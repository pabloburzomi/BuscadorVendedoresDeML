
package com.pabloburzomi.MLARest.DTO;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "quantity",
    "amount",
    "rate",
    "currency_id"
})
@Generated("jsonschema2pojo")
public class Installments {

    @JsonProperty("quantity")
    private Long quantity;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("rate")
    private Double rate;
    @JsonProperty("currency_id")
    private String currencyId;

    @JsonProperty("quantity")
    public Long getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("rate")
    public Double getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(Double rate) {
        this.rate = rate;
    }

    @JsonProperty("currency_id")
    public String getCurrencyId() {
        return currencyId;
    }

    @JsonProperty("currency_id")
    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

	@Override
	public String toString() {
		return "Installments [quantity=" + quantity + ", amount=" + amount + ", rate=" + rate + ", currencyId="
				+ currencyId + "]";
	}

    
}
