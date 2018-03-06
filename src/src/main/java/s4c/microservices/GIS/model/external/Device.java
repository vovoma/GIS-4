package s4c.microservices.GIS.model.external;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "name",
    "entity_name",
    "protocol",
    "entity_type",
    "transport_protocol",
    "public",
    "assets",
    "owner",
    "attributes",
    "lazy",
    "static_attributes",
    "commands",
    "internal_attributes",
    "createdAt",
    "updatedAt",
    "expiresAt"
})
public class Device {

    @JsonProperty("_id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    @JsonProperty("entity_name")
    private String entity_name;
    @JsonProperty("protocol")
    private Device.Protocol protocol;
    @JsonProperty("entity_type")
    private String entityType;
    @JsonProperty("transport_protocol")
    private Device.TransportProtocol transportProtocol;
    @JsonProperty("public")
    private Boolean _public;
    /**
     * assets where the device belongs
     * 
     */
    @JsonProperty("assets")
    @JsonPropertyDescription("assets where the device belongs")
    private List<String> assets = null;
    @JsonProperty("owner")
    private String owner;
    /**
     * Active attributes of the entity
     * 
     */
    @JsonProperty("attributes")
    @JsonPropertyDescription("Active attributes of the entity")
    private List<Attribute> attributes = null;
    /**
     * Observations over the device
     * 
     */
    @JsonProperty("lazy")
    @JsonPropertyDescription("Observations over the device")
    private List<Lazy> lazy = null;
    /**
     * Static attributes or parameters of the device
     * 
     */
    @JsonProperty("static_attributes")
    @JsonPropertyDescription("Static attributes or parameters of the device")
    private List<StaticAttribute> staticAttributes = null;
    /**
     * Available commands of the device
     * 
     */
    @JsonProperty("commands")
    @JsonPropertyDescription("Available commands of the device")
    private List<Command> commands = null;
    /**
     * Special values such as mappings, depending on the IoTA implementation
     * 
     */
    @JsonProperty("internal_attributes")
    @JsonPropertyDescription("Special values such as mappings, depending on the IoTA implementation")
    private List<InternalAttribute> internalAttributes = null;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("updatedAt")
    private String updatedAt;
    @JsonProperty("expiresAt")
    private String expiresAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("entity_name")
    public String getEntity_name() {
        return entity_name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("entity_name")
    public void setEntity_name(String entity_name) {
        this.entity_name = entity_name;
    }

    @JsonProperty("protocol")
    public Device.Protocol getProtocol() {
        return protocol;
    }

    @JsonProperty("protocol")
    public void setProtocol(Device.Protocol protocol) {
        this.protocol = protocol;
    }

    @JsonProperty("entity_type")
    public String getEntityType() {
        return entityType;
    }

    @JsonProperty("entity_type")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @JsonProperty("transport_protocol")
    public Device.TransportProtocol getTransportProtocol() {
        return transportProtocol;
    }

    @JsonProperty("transport_protocol")
    public void setTransportProtocol(Device.TransportProtocol transportProtocol) {
        this.transportProtocol = transportProtocol;
    }

    @JsonProperty("public")
    public Boolean getPublic() {
        return _public;
    }

    @JsonProperty("public")
    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    /**
     * assets where the device belongs
     * 
     */
    @JsonProperty("assets")
    public List<String> getAssets() {
        return assets;
    }

    /**
     * assets where the device belongs
     * 
     */
    @JsonProperty("assets")
    public void setAssets(List<String> assets) {
        this.assets = assets;
    }

    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Active attributes of the entity
     * 
     */
    @JsonProperty("attributes")
    public List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * Active attributes of the entity
     * 
     */
    @JsonProperty("attributes")
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    /**
     * Observations over the device
     * 
     */
    @JsonProperty("lazy")
    public List<Lazy> getLazy() {
        return lazy;
    }

    /**
     * Observations over the device
     * 
     */
    @JsonProperty("lazy")
    public void setLazy(List<Lazy> lazy) {
        this.lazy = lazy;
    }

    /**
     * Static attributes or parameters of the device
     * 
     */
    @JsonProperty("static_attributes")
    public List<StaticAttribute> getStaticAttributes() {
        return staticAttributes;
    }

    /**
     * Static attributes or parameters of the device
     * 
     */
    @JsonProperty("static_attributes")
    public void setStaticAttributes(List<StaticAttribute> staticAttributes) {
        this.staticAttributes = staticAttributes;
    }

    /**
     * Available commands of the device
     * 
     */
    @JsonProperty("commands")
    public List<Command> getCommands() {
        return commands;
    }

    /**
     * Available commands of the device
     * 
     */
    @JsonProperty("commands")
    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }

    /**
     * Special values such as mappings, depending on the IoTA implementation
     * 
     */
    @JsonProperty("internal_attributes")
    public List<InternalAttribute> getInternalAttributes() {
        return internalAttributes;
    }

    /**
     * Special values such as mappings, depending on the IoTA implementation
     * 
     */
    @JsonProperty("internal_attributes")
    public void setInternalAttributes(List<InternalAttribute> internalAttributes) {
        this.internalAttributes = internalAttributes;
    }

    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updatedAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("expiresAt")
    public String getExpiresAt() {
        return expiresAt;
    }

    @JsonProperty("expiresAt")
    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public enum Protocol {

        IO_TA_UL("IoTA-UL"),
        COAP("COAP"),
        LORA("LORA"),
        SIGFOX("SIGFOX"),
        JSON_MQTT("JSON-MQTT");
        private final String value;
        private final static Map<String, Device.Protocol> CONSTANTS = new HashMap<String, Device.Protocol>();

        static {
            for (Device.Protocol c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Protocol(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Device.Protocol fromValue(String value) {
            Device.Protocol constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum TransportProtocol {

        HTTP("HTTP"),
        MQTT("MQTT"),
        AMQP("AMQP");
        private final String value;
        private final static Map<String, Device.TransportProtocol> CONSTANTS = new HashMap<String, Device.TransportProtocol>();

        static {
            for (Device.TransportProtocol c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TransportProtocol(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Device.TransportProtocol fromValue(String value) {
            Device.TransportProtocol constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
