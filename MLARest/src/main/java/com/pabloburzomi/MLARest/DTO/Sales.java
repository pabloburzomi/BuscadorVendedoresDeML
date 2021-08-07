
package com.pabloburzomi.MLARest.DTO;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "period",
    "completed"
})
@Generated("jsonschema2pojo")
public class Sales {

    @JsonProperty("period")
    private String period;
    @JsonProperty("completed")
    private Long completed;

    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    @JsonProperty("completed")
    public Long getCompleted() {
        return completed;
    }

    @JsonProperty("completed")
    public void setCompleted(Long completed) {
        this.completed = completed;
    }

	@Override
	public String toString() {
		return "Sales [period=" + period + ", completed=" + completed + "]";
	}
    
    

}
