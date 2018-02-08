package s4c.microservices.GIS.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "_id", "name", "protocol", "entity_type", "transport_protocol", "public", "assets", "owner",
		"attributes", "lazy", "static_attributes", "commands", "internal_attributes", "createdAt", "updatedAt",
		"expiresAt", "latitude", "longitude", "bbox" })
public class Device {

	@JsonProperty("_id")
	private Object id;
	@JsonProperty("name")
	private Object name;
	@JsonProperty("protocol")
	private Object protocol;
	@JsonProperty("entity_type")
	private Object entityType;
	@JsonProperty("transport_protocol")
	private Object transportProtocol;
	@JsonProperty("public")
	private Object _public;
	@JsonProperty("assets")
	private Object assets;
	@JsonProperty("owner")
	private Object owner;
	@JsonProperty("attributes")
	private Object attributes;
	@JsonProperty("lazy")
	private Object lazy;
	@JsonProperty("static_attributes")
	private Object staticAttributes;
	@JsonProperty("commands")
	private Object commands;
	@JsonProperty("internal_attributes")
	private Object internalAttributes;
	@JsonProperty("createdAt")
	private Object createdAt;
	@JsonProperty("updatedAt")
	private Object updatedAt;
	@JsonProperty("expiresAt")
	private Object expiresAt;
	@JsonProperty("latitude")
	private Object latitude;
	@JsonProperty("longitude")
	private Object longitude;
	@JsonProperty("bbox")
	private Object bbox;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("_id")
	public Object getId() {
		return id;
	}

	@JsonProperty("_id")
	public void setId(Object id) {
		this.id = id;
	}

	@JsonProperty("name")
	public Object getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(Object name) {
		this.name = name;
	}

	@JsonProperty("protocol")
	public Object getProtocol() {
		return protocol;
	}

	@JsonProperty("protocol")
	public void setProtocol(Object protocol) {
		this.protocol = protocol;
	}

	@JsonProperty("entity_type")
	public Object getEntityType() {
		return entityType;
	}

	@JsonProperty("entity_type")
	public void setEntityType(Object entityType) {
		this.entityType = entityType;
	}

	@JsonProperty("transport_protocol")
	public Object getTransportProtocol() {
		return transportProtocol;
	}

	@JsonProperty("transport_protocol")
	public void setTransportProtocol(Object transportProtocol) {
		this.transportProtocol = transportProtocol;
	}

	@JsonProperty("public")
	public Object getPublic() {
		return _public;
	}

	@JsonProperty("public")
	public void setPublic(Object _public) {
		this._public = _public;
	}

	@JsonProperty("assets")
	public Object getAssets() {
		return assets;
	}

	@JsonProperty("assets")
	public void setAssets(Object assets) {
		this.assets = assets;
	}

	@JsonProperty("owner")
	public Object getOwner() {
		return owner;
	}

	@JsonProperty("owner")
	public void setOwner(Object owner) {
		this.owner = owner;
	}

	@JsonProperty("attributes")
	public Object getAttributes() {
		return attributes;
	}

	@JsonProperty("attributes")
	public void setAttributes(Object attributes) {
		this.attributes = attributes;
	}

	@JsonProperty("lazy")
	public Object getLazy() {
		return lazy;
	}

	@JsonProperty("lazy")
	public void setLazy(Object lazy) {
		this.lazy = lazy;
	}

	@JsonProperty("static_attributes")
	public Object getStaticAttributes() {
		return staticAttributes;
	}

	@JsonProperty("static_attributes")
	public void setStaticAttributes(Object staticAttributes) {
		this.staticAttributes = staticAttributes;
	}

	@JsonProperty("commands")
	public Object getCommands() {
		return commands;
	}

	@JsonProperty("commands")
	public void setCommands(Object commands) {
		this.commands = commands;
	}

	@JsonProperty("internal_attributes")
	public Object getInternalAttributes() {
		return internalAttributes;
	}

	@JsonProperty("internal_attributes")
	public void setInternalAttributes(Object internalAttributes) {
		this.internalAttributes = internalAttributes;
	}

	@JsonProperty("createdAt")
	public Object getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("createdAt")
	public void setCreatedAt(Object createdAt) {
		this.createdAt = createdAt;
	}

	@JsonProperty("updatedAt")
	public Object getUpdatedAt() {
		return updatedAt;
	}

	@JsonProperty("updatedAt")
	public void setUpdatedAt(Object updatedAt) {
		this.updatedAt = updatedAt;
	}

	@JsonProperty("expiresAt")
	public Object getExpiresAt() {
		return expiresAt;
	}

	@JsonProperty("expiresAt")
	public void setExpiresAt(Object expiresAt) {
		this.expiresAt = expiresAt;
	}

	@JsonProperty("latitude")
	public Object getLatitude() {
		return latitude;
	}

	@JsonProperty("latitude")
	public void setLatitude(Object latitude) {
		this.latitude = latitude;
	}

	@JsonProperty("longitude")
	public Object getLongitude() {
		return longitude;
	}

	@JsonProperty("longitude")
	public void setLongitude(Object longitude) {
		this.longitude = longitude;
	}

	@JsonProperty("bbox")
	public Object getBbox() {
		return bbox;
	}

	@JsonProperty("bbox")
	public void setBbox(Object bbox) {
		this.bbox = bbox;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}