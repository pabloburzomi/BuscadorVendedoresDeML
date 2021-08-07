
package com.pabloburzomi.MLARest.DTO;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "state",
    "neighborhood",
    "country",
    "city"
})
@Generated("jsonschema2pojo")
public class EshopLocation__1 {

    @JsonProperty("state")
    private State__1 state;
    @JsonProperty("neighborhood")
    private Neighborhood__1 neighborhood;
    @JsonProperty("country")
    private Country__1 country;
    @JsonProperty("city")
    private City__1 city;

    @JsonProperty("state")
    public State__1 getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(State__1 state) {
        this.state = state;
    }

    @JsonProperty("neighborhood")
    public Neighborhood__1 getNeighborhood() {
        return neighborhood;
    }

    @JsonProperty("neighborhood")
    public void setNeighborhood(Neighborhood__1 neighborhood) {
        this.neighborhood = neighborhood;
    }

    @JsonProperty("country")
    public Country__1 getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(Country__1 country) {
        this.country = country;
    }

    @JsonProperty("city")
    public City__1 getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(City__1 city) {
        this.city = city;
    }

}
