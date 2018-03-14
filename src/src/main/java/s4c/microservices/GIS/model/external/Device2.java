package s4c.microservices.GIS.model.external;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({    
    "entity_name",
})
public class Device2 {

    
    @JsonProperty("entity_name")
    private String entity_name;
    
    
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
}
