package s4c.microservices.GIS.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import s4c.microservices.GIS.model.Device;
import s4c.microservices.GIS.services.WFSService;

@Service("WFSService")
public class WFSServiceImpl implements WFSService{

	@Override
	public List<Device> getDummyDevices() {
		// TODO Auto-generated method stub
		return new ArrayList<Device>();
	}

}
