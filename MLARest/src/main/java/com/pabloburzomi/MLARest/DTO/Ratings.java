
package com.pabloburzomi.MLARest.DTO;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "negative",
    "positive",
    "neutral"
})
@Generated("jsonschema2pojo")
public class Ratings {

    @JsonProperty("negative")
    private Double negative;
    @JsonProperty("positive")
    private Double positive;
    @JsonProperty("neutral")
    private Double neutral;

    @JsonProperty("negative")
    public Double getNegative() {
        return negative;
    }

    @JsonProperty("negative")
    public void setNegative(Double negative) {
        this.negative = negative;
    }

    @JsonProperty("positive")
    public Double getPositive() {
        return positive;
    }

    @JsonProperty("positive")
    public void setPositive(Double positive) {
        this.positive = positive;
    }

    @JsonProperty("neutral")
    public Double getNeutral() {
        return neutral;
    }

    @JsonProperty("neutral")
    public void setNeutral(Double neutral) {
        this.neutral = neutral;
    }

	@Override
	public String toString() {
		return "Ratings [negative=" + negative + ", positive=" + positive + ", neutral=" + neutral + "]";
	}

}
