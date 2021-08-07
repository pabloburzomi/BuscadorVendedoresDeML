
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
    "nickname",
    "permalink",
    "registration_date",
    "seller_reputation",
    "real_estate_agency",
    "car_dealer",
    "tags",
    "eshop"
})
@Generated("jsonschema2pojo")
public class Seller {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("permalink")
    private String permalink;
    @JsonProperty("registration_date")
    private String registrationDate;
    @JsonProperty("seller_reputation")
    private SellerReputation sellerReputation;
    @JsonProperty("real_estate_agency")
    private Boolean realEstateAgency;
    @JsonProperty("car_dealer")
    private Boolean carDealer;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("eshop")
    private Eshop eshop;

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("nickname")
    public String getNickname() {
        return nickname;
    }

    @JsonProperty("nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    @JsonProperty("seller_reputation")
    public SellerReputation getSellerReputation() {
        return sellerReputation;
    }

    @JsonProperty("seller_reputation")
    public void setSellerReputation(SellerReputation sellerReputation) {
        this.sellerReputation = sellerReputation;
    }

    @JsonProperty("real_estate_agency")
    public Boolean getRealEstateAgency() {
        return realEstateAgency;
    }

    @JsonProperty("real_estate_agency")
    public void setRealEstateAgency(Boolean realEstateAgency) {
        this.realEstateAgency = realEstateAgency;
    }

    @JsonProperty("car_dealer")
    public Boolean getCarDealer() {
        return carDealer;
    }

    @JsonProperty("car_dealer")
    public void setCarDealer(Boolean carDealer) {
        this.carDealer = carDealer;
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
    public Eshop getEshop() {
        return eshop;
    }

    @JsonProperty("eshop")
    public void setEshop(Eshop eshop) {
        this.eshop = eshop;
    }

	@Override
	public String toString() {
		return "Seller [id=" + id + ", nickname=" + nickname + ", permalink=" + permalink + ", registrationDate="
				+ registrationDate + ", sellerReputation=" + sellerReputation + ", realEstateAgency=" + realEstateAgency
				+ ", carDealer=" + carDealer + ", tags=" + tags + ", eshop=" + eshop + "]";
	}
    
    
    
    

}
