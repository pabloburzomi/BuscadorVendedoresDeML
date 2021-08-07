
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
    "id",
    "prices",
    "presentation",
    "payment_method_prices",
    "reference_prices",
    "purchase_discounts"
})
@Generated("jsonschema2pojo")
public class Prices {

    @JsonProperty("id")
    private String id;
    @JsonProperty("prices")
    private List<Price> prices = new ArrayList<Price>();
    @JsonProperty("presentation")
    private Presentation presentation;
    @JsonProperty("payment_method_prices")
    private List<Object> paymentMethodPrices = new ArrayList<Object>();
    @JsonProperty("reference_prices")
    private List<Object> referencePrices = new ArrayList<Object>();
    @JsonProperty("purchase_discounts")
    private List<Object> purchaseDiscounts = new ArrayList<Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("prices")
    public List<Price> getPrices() {
        return prices;
    }

    @JsonProperty("prices")
    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    @JsonProperty("presentation")
    public Presentation getPresentation() {
        return presentation;
    }

    @JsonProperty("presentation")
    public void setPresentation(Presentation presentation) {
        this.presentation = presentation;
    }

    @JsonProperty("payment_method_prices")
    public List<Object> getPaymentMethodPrices() {
        return paymentMethodPrices;
    }

    @JsonProperty("payment_method_prices")
    public void setPaymentMethodPrices(List<Object> paymentMethodPrices) {
        this.paymentMethodPrices = paymentMethodPrices;
    }

    @JsonProperty("reference_prices")
    public List<Object> getReferencePrices() {
        return referencePrices;
    }

    @JsonProperty("reference_prices")
    public void setReferencePrices(List<Object> referencePrices) {
        this.referencePrices = referencePrices;
    }

    @JsonProperty("purchase_discounts")
    public List<Object> getPurchaseDiscounts() {
        return purchaseDiscounts;
    }

    @JsonProperty("purchase_discounts")
    public void setPurchaseDiscounts(List<Object> purchaseDiscounts) {
        this.purchaseDiscounts = purchaseDiscounts;
    }
    
    

}
