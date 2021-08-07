
package com.pabloburzomi.MLARest.DTO;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "site_id",
    "seller",
    "paging",
    "results",
    "secondary_results",
    "related_results",
    "sort",
    "available_sorts",
    "filters",
    "available_filters"
})
@Generated("jsonschema2pojo")
public class ProductoRest {

    @JsonProperty("site_id")
    private String siteId;
    @JsonProperty("seller")
    private Seller seller;
    @JsonProperty("paging")
    private Paging paging;
    @JsonProperty("results")
    private List<Result> results = new ArrayList<Result>();
    @JsonProperty("secondary_results")
    private List<Object> secondaryResults = new ArrayList<Object>();
    @JsonProperty("related_results")
    private List<Object> relatedResults = new ArrayList<Object>();
    @JsonProperty("sort")
    private Sort sort;
    @JsonProperty("available_sorts")
    private List<AvailableSort> availableSorts = new ArrayList<AvailableSort>();
    @JsonProperty("filters")
    private List<Object> filters = new ArrayList<Object>();
    @JsonProperty("available_filters")
    private List<AvailableFilter> availableFilters = new ArrayList<AvailableFilter>();

    @JsonProperty("site_id")
    public String getSiteId() {
        return siteId;
    }

    @JsonProperty("site_id")
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    @JsonProperty("seller")
    public Seller getSeller() {
        return seller;
    }

    @JsonProperty("seller")
    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    @JsonProperty("paging")
    public Paging getPaging() {
        return paging;
    }

    @JsonProperty("paging")
    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    @JsonProperty("secondary_results")
    public List<Object> getSecondaryResults() {
        return secondaryResults;
    }

    @JsonProperty("secondary_results")
    public void setSecondaryResults(List<Object> secondaryResults) {
        this.secondaryResults = secondaryResults;
    }

    @JsonProperty("related_results")
    public List<Object> getRelatedResults() {
        return relatedResults;
    }

    @JsonProperty("related_results")
    public void setRelatedResults(List<Object> relatedResults) {
        this.relatedResults = relatedResults;
    }

    @JsonProperty("sort")
    public Sort getSort() {
        return sort;
    }

    @JsonProperty("sort")
    public void setSort(Sort sort) {
        this.sort = sort;
    }

    @JsonProperty("available_sorts")
    public List<AvailableSort> getAvailableSorts() {
        return availableSorts;
    }

    @JsonProperty("available_sorts")
    public void setAvailableSorts(List<AvailableSort> availableSorts) {
        this.availableSorts = availableSorts;
    }

    @JsonProperty("filters")
    public List<Object> getFilters() {
        return filters;
    }

    @JsonProperty("filters")
    public void setFilters(List<Object> filters) {
        this.filters = filters;
    }

    @JsonProperty("available_filters")
    public List<AvailableFilter> getAvailableFilters() {
        return availableFilters;
    }

    @JsonProperty("available_filters")
    public void setAvailableFilters(List<AvailableFilter> availableFilters) {
        this.availableFilters = availableFilters;
    }

	@Override
	public String toString() {
		return "ProductoRest [siteId=" + siteId + ", seller=" + seller + ", paging=" + paging + ", results=" + results
				+ ", secondaryResults=" + secondaryResults + ", relatedResults=" + relatedResults + ", sort=" + sort
				+ ", availableSorts=" + availableSorts + ", filters=" + filters + ", availableFilters="
				+ availableFilters + "]";
	}
    
    

}
