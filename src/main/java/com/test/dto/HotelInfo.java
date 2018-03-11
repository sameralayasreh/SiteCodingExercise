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
@JsonPropertyOrder({ "hotelId", "hotelName", "localizedHotelName", "hotelDestination", "hotelDestinationRegionID",
		"hotelLongDestination", "hotelStreetAddress", "hotelCity", "hotelProvince", "hotelCountryCode", "hotelLatitude",
		"hotelLongitude", "hotelStarRating", "hotelGuestReviewRating", "hotelReviewTotal", "hotelImageUrl", "vipAccess",
		"isOfficialRating" })
public class HotelInfo {

	@JsonProperty("hotelId")
	public String hotelId;
	@JsonProperty("hotelName")
	public String hotelName;
	@JsonProperty("localizedHotelName")
	public String localizedHotelName;
	@JsonProperty("hotelDestination")
	public String hotelDestination;
	@JsonProperty("hotelDestinationRegionID")
	public String hotelDestinationRegionID;
	@JsonProperty("hotelLongDestination")
	public String hotelLongDestination;
	@JsonProperty("hotelStreetAddress")
	public String hotelStreetAddress;
	@JsonProperty("hotelCity")
	public String hotelCity;
	@JsonProperty("hotelProvince")
	public String hotelProvince;
	@JsonProperty("hotelCountryCode")
	public String hotelCountryCode;
	@JsonProperty("hotelLatitude")
	public Double hotelLatitude;
	@JsonProperty("hotelLongitude")
	public Double hotelLongitude;
	@JsonProperty("hotelStarRating")
	public String hotelStarRating;
	@JsonProperty("hotelGuestReviewRating")
	public Double hotelGuestReviewRating;
	@JsonProperty("hotelReviewTotal")
	public Long hotelReviewTotal;
	@JsonProperty("hotelImageUrl")
	public String hotelImageUrl;
	@JsonProperty("vipAccess")
	public Boolean vipAccess;
	@JsonProperty("isOfficialRating")
	public Boolean isOfficialRating;
	
	

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getLocalizedHotelName() {
		return localizedHotelName;
	}

	public void setLocalizedHotelName(String localizedHotelName) {
		this.localizedHotelName = localizedHotelName;
	}

	public String getHotelDestination() {
		return hotelDestination;
	}

	public void setHotelDestination(String hotelDestination) {
		this.hotelDestination = hotelDestination;
	}

	public String getHotelDestinationRegionID() {
		return hotelDestinationRegionID;
	}

	public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
		this.hotelDestinationRegionID = hotelDestinationRegionID;
	}

	public String getHotelLongDestination() {
		return hotelLongDestination;
	}

	public void setHotelLongDestination(String hotelLongDestination) {
		this.hotelLongDestination = hotelLongDestination;
	}

	public String getHotelStreetAddress() {
		return hotelStreetAddress;
	}

	public void setHotelStreetAddress(String hotelStreetAddress) {
		this.hotelStreetAddress = hotelStreetAddress;
	}

	public String getHotelCity() {
		return hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public String getHotelProvince() {
		return hotelProvince;
	}

	public void setHotelProvince(String hotelProvince) {
		this.hotelProvince = hotelProvince;
	}

	public String getHotelCountryCode() {
		return hotelCountryCode;
	}

	public void setHotelCountryCode(String hotelCountryCode) {
		this.hotelCountryCode = hotelCountryCode;
	}

	public Double getHotelLatitude() {
		return hotelLatitude;
	}

	public void setHotelLatitude(Double hotelLatitude) {
		this.hotelLatitude = hotelLatitude;
	}

	public Double getHotelLongitude() {
		return hotelLongitude;
	}

	public void setHotelLongitude(Double hotelLongitude) {
		this.hotelLongitude = hotelLongitude;
	}

	public String getHotelStarRating() {
		return hotelStarRating;
	}

	public void setHotelStarRating(String hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}

	public Double getHotelGuestReviewRating() {
		return hotelGuestReviewRating;
	}

	public void setHotelGuestReviewRating(Double hotelGuestReviewRating) {
		this.hotelGuestReviewRating = hotelGuestReviewRating;
	}

	public Long getHotelReviewTotal() {
		return hotelReviewTotal;
	}

	public void setHotelReviewTotal(Long hotelReviewTotal) {
		this.hotelReviewTotal = hotelReviewTotal;
	}

	public String getHotelImageUrl() {
		return hotelImageUrl;
	}

	public void setHotelImageUrl(String hotelImageUrl) {
		this.hotelImageUrl = hotelImageUrl;
	}

	public Boolean getVipAccess() {
		return vipAccess;
	}

	public void setVipAccess(Boolean vipAccess) {
		this.vipAccess = vipAccess;
	}

	public Boolean getIsOfficialRating() {
		return isOfficialRating;
	}

	public void setIsOfficialRating(Boolean isOfficialRating) {
		this.isOfficialRating = isOfficialRating;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(hotelStreetAddress).append(hotelImageUrl).append(localizedHotelName)
				.append(hotelStarRating).append(vipAccess).append(hotelLatitude).append(hotelDestination)
				.append(isOfficialRating).append(hotelProvince).append(hotelDestinationRegionID).append(hotelId)
				.append(hotelLongitude).append(hotelCity).append(hotelReviewTotal).append(hotelName)
				.append(hotelGuestReviewRating).append(hotelCountryCode).append(hotelLongDestination).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof HotelInfo) == false) {
			return false;
		}
		HotelInfo rhs = ((HotelInfo) other);
		return new EqualsBuilder().append(hotelStreetAddress, rhs.hotelStreetAddress)
				.append(hotelImageUrl, rhs.hotelImageUrl).append(localizedHotelName, rhs.localizedHotelName)
				.append(hotelStarRating, rhs.hotelStarRating).append(vipAccess, rhs.vipAccess)
				.append(hotelLatitude, rhs.hotelLatitude).append(hotelDestination, rhs.hotelDestination)
				.append(isOfficialRating, rhs.isOfficialRating).append(hotelProvince, rhs.hotelProvince)
				.append(hotelDestinationRegionID, rhs.hotelDestinationRegionID).append(hotelId, rhs.hotelId)
				.append(hotelLongitude, rhs.hotelLongitude).append(hotelCity, rhs.hotelCity)
				.append(hotelReviewTotal, rhs.hotelReviewTotal).append(hotelName, rhs.hotelName)
				.append(hotelGuestReviewRating, rhs.hotelGuestReviewRating)
				.append(hotelCountryCode, rhs.hotelCountryCode).append(hotelLongDestination, rhs.hotelLongDestination)
				.isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("hotelId", hotelId).append("hotelName", hotelName)
				.append("localizedHotelName", localizedHotelName).append("hotelDestination", hotelDestination)
				.append("hotelDestinationRegionID", hotelDestinationRegionID)
				.append("hotelLongDestination", hotelLongDestination).append("hotelStreetAddress", hotelStreetAddress)
				.append("hotelCity", hotelCity).append("hotelProvince", hotelProvince)
				.append("hotelCountryCode", hotelCountryCode).append("hotelLatitude", hotelLatitude)
				.append("hotelLongitude", hotelLongitude).append("hotelStarRating", hotelStarRating)
				.append("hotelGuestReviewRating", hotelGuestReviewRating).append("hotelReviewTotal", hotelReviewTotal)
				.append("hotelImageUrl", hotelImageUrl).append("vipAccess", vipAccess)
				.append("isOfficialRating", isOfficialRating).toString();
	}

}