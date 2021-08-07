
package com.pabloburzomi.MLARest.DTO;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transactions",
    "power_seller_status",
    "metrics",
    "level_id"
})
@Generated("jsonschema2pojo")
public class SellerReputation__1 {

    @JsonProperty("transactions")
    private Transactions__1 transactions;
    @JsonProperty("power_seller_status")
    private String powerSellerStatus;
    @JsonProperty("metrics")
    private Metrics__1 metrics;
    @JsonProperty("level_id")
    private String levelId;

    @JsonProperty("transactions")
    public Transactions__1 getTransactions() {
        return transactions;
    }

    @JsonProperty("transactions")
    public void setTransactions(Transactions__1 transactions) {
        this.transactions = transactions;
    }

    @JsonProperty("power_seller_status")
    public String getPowerSellerStatus() {
        return powerSellerStatus;
    }

    @JsonProperty("power_seller_status")
    public void setPowerSellerStatus(String powerSellerStatus) {
        this.powerSellerStatus = powerSellerStatus;
    }

    @JsonProperty("metrics")
    public Metrics__1 getMetrics() {
        return metrics;
    }

    @JsonProperty("metrics")
    public void setMetrics(Metrics__1 metrics) {
        this.metrics = metrics;
    }

    @JsonProperty("level_id")
    public String getLevelId() {
        return levelId;
    }

    @JsonProperty("level_id")
    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

}
