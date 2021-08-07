
package com.pabloburzomi.MLARest.DTO;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "level_id",
    "power_seller_status",
    "transactions",
    "metrics"
})
@Generated("jsonschema2pojo")
public class SellerReputation {

    @JsonProperty("level_id")
    private String levelId;
    @JsonProperty("power_seller_status")
    private String powerSellerStatus;
    @JsonProperty("transactions")
    private Transactions transactions;
    @JsonProperty("metrics")
    private Metrics metrics;

    @JsonProperty("level_id")
    public String getLevelId() {
        return levelId;
    }

    @JsonProperty("level_id")
    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    @JsonProperty("power_seller_status")
    public String getPowerSellerStatus() {
        return powerSellerStatus;
    }

    @JsonProperty("power_seller_status")
    public void setPowerSellerStatus(String powerSellerStatus) {
        this.powerSellerStatus = powerSellerStatus;
    }

    @JsonProperty("transactions")
    public Transactions getTransactions() {
        return transactions;
    }

    @JsonProperty("transactions")
    public void setTransactions(Transactions transactions) {
        this.transactions = transactions;
    }

    @JsonProperty("metrics")
    public Metrics getMetrics() {
        return metrics;
    }

    @JsonProperty("metrics")
    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

	@Override
	public String toString() {
		return "SellerReputation [levelId=" + levelId + ", powerSellerStatus=" + powerSellerStatus + ", transactions="
				+ transactions + ", metrics=" + metrics + "]";
	}
    
    

}
