
package com.pabloburzomi.MLARest.DTO;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "total",
    "primary_results",
    "offset",
    "limit"
})
@Generated("jsonschema2pojo")
public class Paging {

    @JsonProperty("total")
    private Long total;
    @JsonProperty("primary_results")
    private Long primaryResults;
    @JsonProperty("offset")
    private Long offset;
    @JsonProperty("limit")
    private Long limit;

    @JsonProperty("total")
    public Long getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Long total) {
        this.total = total;
    }

    @JsonProperty("primary_results")
    public Long getPrimaryResults() {
        return primaryResults;
    }

    @JsonProperty("primary_results")
    public void setPrimaryResults(Long primaryResults) {
        this.primaryResults = primaryResults;
    }

    @JsonProperty("offset")
    public Long getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(Long offset) {
        this.offset = offset;
    }

    @JsonProperty("limit")
    public Long getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Long limit) {
        this.limit = limit;
    }

    
}
