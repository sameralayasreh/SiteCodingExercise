package com.test.dto;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "hotelInfositeUrl", "hotelSearchResultUrl" })
public class HotelUrls {

	@JsonProperty("hotelInfositeUrl")
	public String hotelInfositeUrl;
	@JsonProperty("hotelSearchResultUrl")
	public String hotelSearchResultUrl;
	
	

	public String getHotelInfositeUrl() {
		return hotelInfositeUrl;
	}

	public void setHotelInfositeUrl(String hotelInfositeUrl) {
		try {
			this.hotelInfositeUrl = URLDecoder.decode(hotelInfositeUrl, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}

	public String getHotelSearchResultUrl() {
		return hotelSearchResultUrl;
	}
	

	public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
		this.hotelSearchResultUrl = hotelSearchResultUrl;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(hotelSearchResultUrl).append(hotelInfositeUrl).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof HotelUrls) == false) {
			return false;
		}
		HotelUrls rhs = ((HotelUrls) other);
		return new EqualsBuilder().append(hotelSearchResultUrl, rhs.hotelSearchResultUrl)
				.append(hotelInfositeUrl, rhs.hotelInfositeUrl).isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("hotelInfositeUrl", hotelInfositeUrl)
				.append("hotelSearchResultUrl", hotelSearchResultUrl).toString();
	}

}