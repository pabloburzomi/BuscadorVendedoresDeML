
package com.pabloburzomi.MLARest.DTO;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "display_currency"
})
@Generated("jsonschema2pojo")
public class Presentation {

    @JsonProperty("display_currency")
    private String displayCurrency;

    @JsonProperty("display_currency")
    public String getDisplayCurrency() {
        return displayCurrency;
    }

    @JsonProperty("display_currency")
    public void setDisplayCurrency(String displayCurrency) {
        this.displayCurrency = displayCurrency;
    }

}
