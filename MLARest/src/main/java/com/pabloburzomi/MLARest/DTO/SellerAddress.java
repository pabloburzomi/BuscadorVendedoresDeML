
package com.pabloburzomi.MLARest.DTO;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "comment",
    "address_line",
    "zip_code",
    "country",
    "state",
    "city",
    "latitude",
    "longitude"
})
@Generated("jsonschema2pojo")
public class SellerAddress {

    @JsonProperty("id")
    private String id;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("address_line")
    private String addressLine;
    @JsonProperty("zip_code")
    private String zipCode;
    @JsonProperty("country")
    private Country__2 country;
    @JsonProperty("state")
    private State__2 state;
    @JsonProperty("city")
    private City__2 city;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("longitude")
    private String longitude;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonProperty("address_line")
    public String getAddressLine() {
        return addressLine;
    }

    @JsonProperty("address_line")
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    @JsonProperty("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    @JsonProperty("zip_code")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @JsonProperty("country")
    public Country__2 getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(Country__2 country) {
        this.country = country;
    }

    @JsonProperty("state")
    public State__2 getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(State__2 state) {
        this.state = state;
    }

    @JsonProperty("city")
    public City__2 getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(City__2 city) {
        this.city = city;
    }

    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

	@Override
	public String toString() {
		return "SellerAddress [id=" + id + ", comment=" + comment + ", addressLine=" + addressLine + ", zipCode="
				+ zipCode + ", country=" + country + ", state=" + state + ", city=" + city + ", latitude=" + latitude
				+ ", longitude=" + longitude + "]";
	}
    
    

}
