
package com.pabloburzomi.MLARest.DTO;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "id",
    "type",
    "conditions",
    "amount",
    "regular_amount",
    "currency_id",
    "exchange_rate_context",
    "metadata",
    "last_updated"
})
@Generated("jsonschema2pojo")
public class Price {

    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("conditions")
    private Conditions conditions;
    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("regular_amount")
    private Object regularAmount;
    @JsonProperty("currency_id")
    private String currencyId;
    @JsonProperty("exchange_rate_context")
    private String exchangeRateContext;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("last_updated")
    private String lastUpdated;
    
    

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("conditions")
    public Conditions getConditions() {
        return conditions;
    }

    @JsonProperty("conditions")
    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    @JsonProperty("amount")
    public Long getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @JsonProperty("regular_amount")
    public Object getRegularAmount() {
        return regularAmount;
    }

    @JsonProperty("regular_amount")
    public void setRegularAmount(Object regularAmount) {
        this.regularAmount = regularAmount;
    }

    @JsonProperty("currency_id")
    public String getCurrencyId() {
        return currencyId;
    }

    @JsonProperty("currency_id")
    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    @JsonProperty("exchange_rate_context")
    public String getExchangeRateContext() {
        return exchangeRateContext;
    }

    @JsonProperty("exchange_rate_context")
    public void setExchangeRateContext(String exchangeRateContext) {
        this.exchangeRateContext = exchangeRateContext;
    }

    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("last_updated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    
    

}
