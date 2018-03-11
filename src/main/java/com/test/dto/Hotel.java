package com.test.dto;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "offerDateRange", "destination", "hotelInfo", "hotelPricingInfo", "hotelUrls" })
public class Hotel {

	@JsonProperty("offerDateRange")
	public OfferDateRange offerDateRange = new OfferDateRange();
	@JsonProperty("destination")
	public Destination destination = new Destination();
	@JsonProperty("hotelInfo")
	public HotelInfo hotelInfo = new HotelInfo();
	@JsonProperty("hotelPricingInfo")
	public HotelPricingInfo hotelPricingInfo = new HotelPricingInfo();
	@JsonProperty("hotelUrls")
	public HotelUrls hotelUrls = new HotelUrls();
	
	

	public OfferDateRange getOfferDateRange() {
		return offerDateRange;
	}

	public void setOfferDateRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public HotelInfo getHotelInfo() {
		return hotelInfo;
	}

	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}

	public HotelPricingInfo getHotelPricingInfo() {
		return hotelPricingInfo;
	}

	public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
		this.hotelPricingInfo = hotelPricingInfo;
	}

	public HotelUrls getHotelUrls() {
		return hotelUrls;
	}

	public void setHotelUrls(HotelUrls hotelUrls) {
		this.hotelUrls = hotelUrls;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(offerDateRange).append(hotelUrls).append(hotelInfo).append(hotelPricingInfo)
				.append(destination).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Hotel) == false) {
			return false;
		}
		Hotel rhs = ((Hotel) other);
		return new EqualsBuilder().append(offerDateRange, rhs.offerDateRange).append(hotelUrls, rhs.hotelUrls)
				.append(hotelInfo, rhs.hotelInfo).append(hotelPricingInfo, rhs.hotelPricingInfo)
				.append(destination, rhs.destination).isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("offerDateRange", offerDateRange).append("destination", destination)
				.append("hotelInfo", hotelInfo).append("hotelPricingInfo", hotelPricingInfo)
				.append("hotelUrls", hotelUrls).toString();
	}

}