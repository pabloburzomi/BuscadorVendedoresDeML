
package com.pabloburzomi.MLARest.DTO;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sales"
})
@Generated("jsonschema2pojo")
public class Metrics {

    @JsonProperty("sales")
    private Sales sales;

    @JsonProperty("sales")
    public Sales getSales() {
        return sales;
    }

    @JsonProperty("sales")
    public void setSales(Sales sales) {
        this.sales = sales;
    }

	@Override
	public String toString() {
		return "Metrics [sales=" + sales + "]";
	}
    
    

}
