
package com.pabloburzomi.MLARest.DTO;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "claims",
    "delayed_handling_time",
    "sales",
    "cancellations"
})
@Generated("jsonschema2pojo")
public class Metrics__1 {

    @JsonProperty("claims")
    private Claims claims;
    @JsonProperty("delayed_handling_time")
    private DelayedHandlingTime delayedHandlingTime;
    @JsonProperty("sales")
    private Sales__1 sales;
    @JsonProperty("cancellations")
    private Cancellations cancellations;

    @JsonProperty("claims")
    public Claims getClaims() {
        return claims;
    }

    @JsonProperty("claims")
    public void setClaims(Claims claims) {
        this.claims = claims;
    }

    @JsonProperty("delayed_handling_time")
    public DelayedHandlingTime getDelayedHandlingTime() {
        return delayedHandlingTime;
    }

    @JsonProperty("delayed_handling_time")
    public void setDelayedHandlingTime(DelayedHandlingTime delayedHandlingTime) {
        this.delayedHandlingTime = delayedHandlingTime;
    }

    @JsonProperty("sales")
    public Sales__1 getSales() {
        return sales;
    }

    @JsonProperty("sales")
    public void setSales(Sales__1 sales) {
        this.sales = sales;
    }

    @JsonProperty("cancellations")
    public Cancellations getCancellations() {
        return cancellations;
    }

    @JsonProperty("cancellations")
    public void setCancellations(Cancellations cancellations) {
        this.cancellations = cancellations;
    }

	@Override
	public String toString() {
		return "Metrics__1 [claims=" + claims + ", delayedHandlingTime=" + delayedHandlingTime + ", sales=" + sales
				+ ", cancellations=" + cancellations + "]";
	}
    
    

}
