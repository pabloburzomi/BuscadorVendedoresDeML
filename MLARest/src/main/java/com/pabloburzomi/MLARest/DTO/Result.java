
package com.pabloburzomi.MLARest.DTO;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)  //Por si cambia el Json
@JsonPropertyOrder({
    "id",
    "site_id",
    "title",
    "seller",
    "price",
    "prices",
    "sale_price",
    "currency_id",
    "available_quantity",
    "sold_quantity",
    "buying_mode",
    "listing_type_id",
    "stop_time",
    "condition",
    "permalink",
    "thumbnail",
    "thumbnail_id",
    "accepts_mercadopago",
    "installments",
    "address",
    "shipping",
    "seller_address",
    "attributes",
    "original_price",
    "category_id",
    "official_store_id",
    "domain_id",
    "catalog_product_id",
    "tags",
    "catalog_listing",
    "use_thumbnail_id",
    "order_backend"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("id")
    private String id;
    @JsonProperty("site_id")
    private String siteId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("seller")
    private Seller__1 seller;
    @JsonProperty("price")
    private Long price;
    @JsonProperty("prices")
    private Prices prices;
    @JsonProperty("sale_price")
    private Object salePrice;
    @JsonProperty("currency_id")
    private String currencyId;
    @JsonProperty("available_quantity")
    private Long availableQuantity;
    @JsonProperty("sold_quantity")
    private Long soldQuantity;
    @JsonProperty("buying_mode")
    private String buyingMode;
    @JsonProperty("listing_type_id")
    private String listingTypeId;
    @JsonProperty("stop_time")
    private String stopTime;
    @JsonProperty("condition")
    private String condition;
    @JsonProperty("permalink")
    private String permalink;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonProperty("thumbnail_id")
    private String thumbnailId;
    @JsonProperty("accepts_mercadopago")
    private Boolean acceptsMercadopago;
    @JsonProperty("installments")
    private Installments installments;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("shipping")
    private Shipping shipping;
    @JsonProperty("seller_address")
    private SellerAddress sellerAddress;
    @JsonProperty("attributes")
    private List<Attribute> attributes = new ArrayList<Attribute>();
    @JsonProperty("original_price")
    private Object originalPrice;
    @JsonProperty("category_id")
    private String categoryId;
    @JsonProperty("official_store_id")
    private Object officialStoreId;
    @JsonProperty("domain_id")
    private String domainId;
    @JsonProperty("catalog_product_id")
    private String catalogProductId;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("catalog_listing")
    private Boolean catalogListing;
    @JsonProperty("use_thumbnail_id")
    private Boolean useThumbnailId;
    @JsonProperty("order_backend")
    private Long orderBackend;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("site_id")
    public String getSiteId() {
        return siteId;
    }

    @JsonProperty("site_id")
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("seller")
    public Seller__1 getSeller() {
        return seller;
    }

    @JsonProperty("seller")
    public void setSeller(Seller__1 seller) {
        this.seller = seller;
    }

    @JsonProperty("price")
    public Long getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Long price) {
        this.price = price;
    }

    @JsonProperty("prices")
    public Prices getPrices() {
        return prices;
    }

    @JsonProperty("prices")
    public void setPrices(Prices prices) {
        this.prices = prices;
    }

    @JsonProperty("sale_price")
    public Object getSalePrice() {
        return salePrice;
    }

    @JsonProperty("sale_price")
    public void setSalePrice(Object salePrice) {
        this.salePrice = salePrice;
    }

    @JsonProperty("currency_id")
    public String getCurrencyId() {
        return currencyId;
    }

    @JsonProperty("currency_id")
    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    @JsonProperty("available_quantity")
    public Long getAvailableQuantity() {
        return availableQuantity;
    }

    @JsonProperty("available_quantity")
    public void setAvailableQuantity(Long availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    @JsonProperty("sold_quantity")
    public Long getSoldQuantity() {
        return soldQuantity;
    }

    @JsonProperty("sold_quantity")
    public void setSoldQuantity(Long soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    @JsonProperty("buying_mode")
    public String getBuyingMode() {
        return buyingMode;
    }

    @JsonProperty("buying_mode")
    public void setBuyingMode(String buyingMode) {
        this.buyingMode = buyingMode;
    }

    @JsonProperty("listing_type_id")
    public String getListingTypeId() {
        return listingTypeId;
    }

    @JsonProperty("listing_type_id")
    public void setListingTypeId(String listingTypeId) {
        this.listingTypeId = listingTypeId;
    }

    @JsonProperty("stop_time")
    public String getStopTime() {
        return stopTime;
    }

    @JsonProperty("stop_time")
    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    @JsonProperty("condition")
    public String getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(String condition) {
        this.condition = condition;
    }

    @JsonProperty("permalink")
    public String getPermalink() {
        return permalink;
    }

    @JsonProperty("permalink")
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @JsonProperty("thumbnail_id")
    public String getThumbnailId() {
        return thumbnailId;
    }

    @JsonProperty("thumbnail_id")
    public void setThumbnailId(String thumbnailId) {
        this.thumbnailId = thumbnailId;
    }

    @JsonProperty("accepts_mercadopago")
    public Boolean getAcceptsMercadopago() {
        return acceptsMercadopago;
    }

    @JsonProperty("accepts_mercadopago")
    public void setAcceptsMercadopago(Boolean acceptsMercadopago) {
        this.acceptsMercadopago = acceptsMercadopago;
    }

    @JsonProperty("installments")
    public Installments getInstallments() {
        return installments;
    }

    @JsonProperty("installments")
    public void setInstallments(Installments installments) {
        this.installments = installments;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("shipping")
    public Shipping getShipping() {
        return shipping;
    }

    @JsonProperty("shipping")
    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    @JsonProperty("seller_address")
    public SellerAddress getSellerAddress() {
        return sellerAddress;
    }

    @JsonProperty("seller_address")
    public void setSellerAddress(SellerAddress sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    @JsonProperty("attributes")
    public List<Attribute> getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("original_price")
    public Object getOriginalPrice() {
        return originalPrice;
    }

    @JsonProperty("original_price")
    public void setOriginalPrice(Object originalPrice) {
        this.originalPrice = originalPrice;
    }

    @JsonProperty("category_id")
    public String getCategoryId() {
        return categoryId;
    }

    @JsonProperty("category_id")
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @JsonProperty("official_store_id")
    public Object getOfficialStoreId() {
        return officialStoreId;
    }

    @JsonProperty("official_store_id")
    public void setOfficialStoreId(Object officialStoreId) {
        this.officialStoreId = officialStoreId;
    }

    @JsonProperty("domain_id")
    public String getDomainId() {
        return domainId;
    }

    @JsonProperty("domain_id")
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    @JsonProperty("catalog_product_id")
    public String getCatalogProductId() {
        return catalogProductId;
    }

    @JsonProperty("catalog_product_id")
    public void setCatalogProductId(String catalogProductId) {
        this.catalogProductId = catalogProductId;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("catalog_listing")
    public Boolean getCatalogListing() {
        return catalogListing;
    }

    @JsonProperty("catalog_listing")
    public void setCatalogListing(Boolean catalogListing) {
        this.catalogListing = catalogListing;
    }

    @JsonProperty("use_thumbnail_id")
    public Boolean getUseThumbnailId() {
        return useThumbnailId;
    }

    @JsonProperty("use_thumbnail_id")
    public void setUseThumbnailId(Boolean useThumbnailId) {
        this.useThumbnailId = useThumbnailId;
    }

    @JsonProperty("order_backend")
    public Long getOrderBackend() {
        return orderBackend;
    }

    @JsonProperty("order_backend")
    public void setOrderBackend(Long orderBackend) {
        this.orderBackend = orderBackend;
    }

	@Override
	public String toString() {
		
		return "Result [id=" + id + ", siteId=" + siteId + ", title=" + title + ", seller=" + seller + ", price="
				+ price + "$, prices=" + prices + ", salePrice=" + salePrice + ", currencyId=" + currencyId
				+ ", availableQuantity=" + availableQuantity + ", soldQuantity=" + soldQuantity + ", buyingMode="
				+ buyingMode + ", listingTypeId=" + listingTypeId + ", stopTime=" + stopTime + ", condition="
				+ condition + ", permalink=" + permalink + ", thumbnail=" + thumbnail + ", thumbnailId=" + thumbnailId
				+ ", acceptsMercadopago=" + acceptsMercadopago + ", installments=" + installments + ", address="
				+ address + ", shipping=" + shipping + ", sellerAddress=" + sellerAddress + ", attributes=" + attributes
				+ ", originalPrice=" + originalPrice + ", categoryId=" + categoryId + ", officialStoreId="
				+ officialStoreId + ", domainId=" + domainId + ", catalogProductId=" + catalogProductId + ", tags="
				+ tags + ", catalogListing=" + catalogListing + ", useThumbnailId=" + useThumbnailId + ", orderBackend="
				+ orderBackend + "]";
	}
    
    

}
