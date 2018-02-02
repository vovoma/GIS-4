package s4c.microservices.GIS.model;

import java.util.List;

public class Device {
	
	private String _id;
	private String name;
	private String protocol;
	private String entity_type;
	private String transport_protocol;
	private boolean isPublic;
	private String owner;
	private String __v;
	private List<String> internal_attributes;
	private List<String> commands;
	private List<String> lazy;
	private List<String> static_attributes;
	private List<String> attributes;
	private Geometry geometry;
	
	
	
	public Device(String _id, String name, String protocol, String entity_type, String transport_protocol,
			boolean isPublic, String owner, String __v, List<String> internal_attributes, List<String> commands,
			List<String> lazy, List<String> static_attributes, List<String> attributes, Geometry geometry) {
		super();
		this._id = _id;
		this.name = name;
		this.protocol = protocol;
		this.entity_type = entity_type;
		this.transport_protocol = transport_protocol;
		this.isPublic = isPublic;
		this.owner = owner;
		this.__v = __v;
		this.internal_attributes = internal_attributes;
		this.commands = commands;
		this.lazy = lazy;
		this.static_attributes = static_attributes;
		this.attributes = attributes;
		this.geometry = geometry;
	}
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public String getEntity_type() {
		return entity_type;
	}
	public void setEntity_type(String entity_type) {
		this.entity_type = entity_type;
	}
	public String getTransport_protocol() {
		return transport_protocol;
	}
	public void setTransport_protocol(String transport_protocol) {
		this.transport_protocol = transport_protocol;
	}
	public boolean isPublic() {
		return isPublic;
	}
	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String get__v() {
		return __v;
	}
	public void set__v(String __v) {
		this.__v = __v;
	}
	public List<String> getInternal_attributes() {
		return internal_attributes;
	}
	public void setInternal_attributes(List<String> internal_attributes) {
		this.internal_attributes = internal_attributes;
	}
	public List<String> getCommands() {
		return commands;
	}
	public void setCommands(List<String> commands) {
		this.commands = commands;
	}
	public List<String> getLazy() {
		return lazy;
	}
	public void setLazy(List<String> lazy) {
		this.lazy = lazy;
	}
	public List<String> getStatic_attributes() {
		return static_attributes;
	}
	public void setStatic_attributes(List<String> static_attributes) {
		this.static_attributes = static_attributes;
	}
	public List<String> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<String> attributes) {
		this.attributes = attributes;
	}
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	
	


}
