package s4c.microservices.GIS.model.external;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "object_id",
    "name",
    "formType"
})
public class Command {

    @JsonProperty("object_id")
    private String objectId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("formType")
    private String formType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("object_id")
    public String getObjectId() {
        return objectId;
    }

    @JsonProperty("object_id")
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("formType")
    public String getFormType() {
        return formType;
    }

    @JsonProperty("formType")
    public void setFormType(String formType) {
        this.formType = formType;
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
