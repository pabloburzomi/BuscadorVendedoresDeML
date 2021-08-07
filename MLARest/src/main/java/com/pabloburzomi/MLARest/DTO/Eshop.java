
package com.pabloburzomi.MLARest.DTO;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nick_name",
    "eshop_rubro",
    "eshop_id",
    "eshop_locations",
    "site_id",
    "eshop_logo_url",
    "eshop_status_id",
    "seller",
    "eshop_experience"
})
@Generated("jsonschema2pojo")
public class Eshop {

    @JsonProperty("nick_name")
    private String nickName;
    @JsonProperty("eshop_rubro")
    private EshopRubro eshopRubro;
    @JsonProperty("eshop_id")
    private Long eshopId;
    @JsonProperty("eshop_locations")
    private List<EshopLocation> eshopLocations = new ArrayList<EshopLocation>();
    @JsonProperty("site_id")
    private String siteId;
    @JsonProperty("eshop_logo_url")
    private String eshopLogoUrl;
    @JsonProperty("eshop_status_id")
    private Long eshopStatusId;
    @JsonProperty("seller")
    private Long seller;
    @JsonProperty("eshop_experience")
    private Long eshopExperience;

    @JsonProperty("nick_name")
    public String getNickName() {
        return nickName;
    }

    @JsonProperty("nick_name")
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @JsonProperty("eshop_rubro")
    public EshopRubro getEshopRubro() {
        return eshopRubro;
    }

    @JsonProperty("eshop_rubro")
    public void setEshopRubro(EshopRubro eshopRubro) {
        this.eshopRubro = eshopRubro;
    }

    @JsonProperty("eshop_id")
    public Long getEshopId() {
        return eshopId;
    }

    @JsonProperty("eshop_id")
    public void setEshopId(Long eshopId) {
        this.eshopId = eshopId;
    }

    @JsonProperty("eshop_locations")
    public List<EshopLocation> getEshopLocations() {
        return eshopLocations;
    }

    @JsonProperty("eshop_locations")
    public void setEshopLocations(List<EshopLocation> eshopLocations) {
        this.eshopLocations = eshopLocations;
    }

    @JsonProperty("site_id")
    public String getSiteId() {
        return siteId;
    }

    @JsonProperty("site_id")
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    @JsonProperty("eshop_logo_url")
    public String getEshopLogoUrl() {
        return eshopLogoUrl;
    }

    @JsonProperty("eshop_logo_url")
    public void setEshopLogoUrl(String eshopLogoUrl) {
        this.eshopLogoUrl = eshopLogoUrl;
    }

    @JsonProperty("eshop_status_id")
    public Long getEshopStatusId() {
        return eshopStatusId;
    }

    @JsonProperty("eshop_status_id")
    public void setEshopStatusId(Long eshopStatusId) {
        this.eshopStatusId = eshopStatusId;
    }

    @JsonProperty("seller")
    public Long getSeller() {
        return seller;
    }

    @JsonProperty("seller")
    public void setSeller(Long seller) {
        this.seller = seller;
    }

    @JsonProperty("eshop_experience")
    public Long getEshopExperience() {
        return eshopExperience;
    }

    @JsonProperty("eshop_experience")
    public void setEshopExperience(Long eshopExperience) {
        this.eshopExperience = eshopExperience;
    }

}
