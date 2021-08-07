
package com.pabloburzomi.MLARest.DTO;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "context_restrictions",
    "start_time",
    "end_time",
    "eligible"
})
@Generated("jsonschema2pojo")
public class Conditions {

    @JsonProperty("context_restrictions")
    private List<Object> contextRestrictions = new ArrayList<Object>();
    @JsonProperty("start_time")
    private Object startTime;
    @JsonProperty("end_time")
    private Object endTime;
    @JsonProperty("eligible")
    private Boolean eligible;

    @JsonProperty("context_restrictions")
    public List<Object> getContextRestrictions() {
        return contextRestrictions;
    }

    @JsonProperty("context_restrictions")
    public void setContextRestrictions(List<Object> contextRestrictions) {
        this.contextRestrictions = contextRestrictions;
    }

    @JsonProperty("start_time")
    public Object getStartTime() {
        return startTime;
    }

    @JsonProperty("start_time")
    public void setStartTime(Object startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("end_time")
    public Object getEndTime() {
        return endTime;
    }

    @JsonProperty("end_time")
    public void setEndTime(Object endTime) {
        this.endTime = endTime;
    }

    @JsonProperty("eligible")
    public Boolean getEligible() {
        return eligible;
    }

    @JsonProperty("eligible")
    public void setEligible(Boolean eligible) {
        this.eligible = eligible;
    }
    
    

}
