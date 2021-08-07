
package com.pabloburzomi.MLARest.DTO;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "free_shipping",
    "mode",
    "tags",
    "logistic_type",
    "store_pick_up"
})
@Generated("jsonschema2pojo")
public class Shipping {

    @JsonProperty("free_shipping")
    private Boolean freeShipping;
    @JsonProperty("mode")
    private String mode;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("logistic_type")
    private String logisticType;
    @JsonProperty("store_pick_up")
    private Boolean storePickUp;

    @JsonProperty("free_shipping")
    public Boolean getFreeShipping() {
        return freeShipping;
    }

    @JsonProperty("free_shipping")
    public void setFreeShipping(Boolean freeShipping) {
        this.freeShipping = freeShipping;
    }

    @JsonProperty("mode")
    public String getMode() {
        return mode;
    }

    @JsonProperty("mode")
    public void setMode(String mode) {
        this.mode = mode;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("logistic_type")
    public String getLogisticType() {
        return logisticType;
    }

    @JsonProperty("logistic_type")
    public void setLogisticType(String logisticType) {
        this.logisticType = logisticType;
    }

    @JsonProperty("store_pick_up")
    public Boolean getStorePickUp() {
        return storePickUp;
    }

    @JsonProperty("store_pick_up")
    public void setStorePickUp(Boolean storePickUp) {
        this.storePickUp = storePickUp;
    }

	@Override
	public String toString() {
		return "Shipping [freeShipping=" + freeShipping + ", mode=" + mode + ", tags=" + tags + ", logisticType="
				+ logisticType + ", storePickUp=" + storePickUp + "]";
	}
    
    

}
