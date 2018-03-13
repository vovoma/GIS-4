package s4c.microservices.GIS.filters;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import s4c.microservices.GIS.model.external.Device;
import s4c.microservices.GIS.services.external.DeviceManagementService;

public class PreFilter extends ZuulFilter {

	private static Logger log = LoggerFactory.getLogger(PreFilter.class);

	@Value("${contingency.mode}")
	private boolean contingencyMode;

	@Autowired
	private DeviceManagementService deviceManagementService;

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		Map<String, List<String>> params = ctx.getRequestQueryParams();

		if (!contingencyMode) {

			if (request.getRequestURI().contains("gis/ows")
					&& (!params.toString().toLowerCase().contains("request=[getcapabilities]"))) {

				List<String> cql_filter = buildFilter(request.getHeader("X-Authorization-s4c"));

				if (!params.containsKey("cql_filter")) {
					params.put("cql_filter", cql_filter);
				} else {
					params.remove("cql_filter");
					params.put("cql_filter", cql_filter);
				}

				ctx.setRequestQueryParams(params);
			}
		}

		log.debug(String.format("%s request to %s with params %s", request.getMethod(),
				request.getRequestURL().toString(), params.toString()));

		return null;
	}

	private List<String> buildFilter(String JWTTokenHeaderValue) {
		StringBuilder sb = new StringBuilder();
		sb.append("\"_id.id\" IN (");
		List<Device> devices = deviceManagementService.getMyDevices(JWTTokenHeaderValue);
		Device device = null;
		if (devices != null && devices.size() > 0) {
			for (int i = 0; i < devices.size(); i++) {
				device = devices.get(i);
				sb.append("'" + device.getEntity_name() + "'");
				if (i != devices.size() - 1)
					sb.append(",");
			}
		}

		sb.append(")");

		return Arrays.asList(sb.toString());
	}

}
