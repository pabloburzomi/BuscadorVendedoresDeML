
package com.pabloburzomi.MLARest.DTO;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "permalink",
    "registration_date",
    "car_dealer",
    "real_estate_agency",
    "tags",
    "eshop",
    "seller_reputation",
    "nickname"
})
@Generated("jsonschema2pojo")
public class Seller__1 {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("permalink")
    private String permalink;
    @JsonProperty("registration_date")
    private String registrationDate;
    @JsonProperty("car_dealer")
    private Boolean carDealer;
    @JsonProperty("real_estate_agency")
    private Boolean realEstateAgency;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("eshop")
    private Eshop__1 eshop;
    @JsonProperty("seller_reputation")
    private SellerReputation__1 sellerReputation;
    @JsonProperty("nickname")
    private String nickname;

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("permalink")
    public String getPermalink() {
        return permalink;
    }

    @JsonProperty("permalink")
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    @JsonProperty("registration_date")
    public String getRegistrationDate() {
        return registrationDate;
    }

    @JsonProperty("registration_date")
    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    @JsonProperty("car_dealer")
    public Boolean getCarDealer() {
        return carDealer;
    }

    @JsonProperty("car_dealer")
    public void setCarDealer(Boolean carDealer) {
        this.carDealer = carDealer;
    }

    @JsonProperty("real_estate_agency")
    public Boolean getRealEstateAgency() {
        return realEstateAgency;
    }

    @JsonProperty("real_estate_agency")
    public void setRealEstateAgency(Boolean realEstateAgency) {
        this.realEstateAgency = realEstateAgency;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("eshop")
    public Eshop__1 getEshop() {
        return eshop;
    }

    @JsonProperty("eshop")
    public void setEshop(Eshop__1 eshop) {
        this.eshop = eshop;
    }

    @JsonProperty("seller_reputation")
    public SellerReputation__1 getSellerReputation() {
        return sellerReputation;
    }

    @JsonProperty("seller_reputation")
    public void setSellerReputation(SellerReputation__1 sellerReputation) {
        this.sellerReputation = sellerReputation;
    }

    @JsonProperty("nickname")
    public String getNickname() {
        return nickname;
    }

    @JsonProperty("nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

	@Override
	public String toString() {
		return "Seller__1 [id=" + id + ", permalink=" + permalink + ", registrationDate=" + registrationDate
				+ ", carDealer=" + carDealer + ", realEstateAgency=" + realEstateAgency + ", tags=" + tags + ", eshop="
				+ eshop + ", sellerReputation=" + sellerReputation + ", nickname=" + nickname + "]";
	}
    
    

}
