package com.test.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "offerInfo", "userInfo", "offers" })
public class offersvcExpedia {

	@JsonProperty("offerInfo")
	public OfferInfo offerInfo;
	@JsonProperty("userInfo")
	public UserInfo userInfo;
	@JsonProperty("offers")
	public Offers offers;
	
	

	public OfferInfo getOfferInfo() {
		return offerInfo;
	}

	public void setOfferInfo(OfferInfo offerInfo) {
		this.offerInfo = offerInfo;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Offers getOffers() {
		return offers;
	}

	public void setOffers(Offers offers) {
		this.offers = offers;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(offers).append(offerInfo).append(userInfo).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof offersvcExpedia) == false) {
			return false;
		}
		offersvcExpedia rhs = ((offersvcExpedia) other);
		return new EqualsBuilder().append(offers, rhs.offers).append(offerInfo, rhs.offerInfo)
				.append(userInfo, rhs.userInfo).isEquals();
	}

}