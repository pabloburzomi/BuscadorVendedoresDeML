
package com.pabloburzomi.MLARest.DTO;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "total",
    "canceled",
    "period",
    "ratings",
    "completed"
})
@Generated("jsonschema2pojo")
public class Transactions {

    @JsonProperty("total")
    private Long total;
    @JsonProperty("canceled")
    private Long canceled;
    @JsonProperty("period")
    private String period;
    @JsonProperty("ratings")
    private Ratings ratings;
    @JsonProperty("completed")
    private Long completed;

    @JsonProperty("total")
    public Long getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Long total) {
        this.total = total;
    }

    @JsonProperty("canceled")
    public Long getCanceled() {
        return canceled;
    }

    @JsonProperty("canceled")
    public void setCanceled(Long canceled) {
        this.canceled = canceled;
    }

    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    @JsonProperty("ratings")
    public Ratings getRatings() {
        return ratings;
    }

    @JsonProperty("ratings")
    public void setRatings(Ratings ratings) {
        this.ratings = ratings;
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
		return "Transactions [total=" + total + ", canceled=" + canceled + ", period=" + period + ", ratings=" + ratings
				+ ", completed=" + completed + "]";
	}

}
