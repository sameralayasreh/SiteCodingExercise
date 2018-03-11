package com.test.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "regionID", "associatedMultiCityRegionId", "longName", "shortName", "country", "province", "city",
		"tla", "nonLocalizedCity" })
public class Destination {

	@JsonProperty("regionID")
	public String regionID;
	@JsonProperty("associatedMultiCityRegionId")
	public String associatedMultiCityRegionId;
	@JsonProperty("longName")
	public String longName;
	@JsonProperty("shortName")
	public String shortName;
	@JsonProperty("country")
	public String country;
	@JsonProperty("province")
	public String province;
	@JsonProperty("city")
	public String city;
	@JsonProperty("tla")
	public String tla;
	@JsonProperty("nonLocalizedCity")
	public String nonLocalizedCity;

	
	
	public String getRegionID() {
		return regionID;
	}

	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}

	public String getAssociatedMultiCityRegionId() {
		return associatedMultiCityRegionId;
	}

	public void setAssociatedMultiCityRegionId(String associatedMultiCityRegionId) {
		this.associatedMultiCityRegionId = associatedMultiCityRegionId;
	}

	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTla() {
		return tla;
	}

	public void setTla(String tla) {
		this.tla = tla;
	}

	public String getNonLocalizedCity() {
		return nonLocalizedCity;
	}

	public void setNonLocalizedCity(String nonLocalizedCity) {
		this.nonLocalizedCity = nonLocalizedCity;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(province).append(longName).append(nonLocalizedCity).append(tla)
				.append(shortName).append(associatedMultiCityRegionId).append(regionID).append(city).append(country)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Destination) == false) {
			return false;
		}
		Destination rhs = ((Destination) other);
		return new EqualsBuilder().append(province, rhs.province).append(longName, rhs.longName)
				.append(nonLocalizedCity, rhs.nonLocalizedCity).append(tla, rhs.tla).append(shortName, rhs.shortName)
				.append(associatedMultiCityRegionId, rhs.associatedMultiCityRegionId).append(regionID, rhs.regionID)
				.append(city, rhs.city).append(country, rhs.country).isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("regionID", regionID)
				.append("associatedMultiCityRegionId", associatedMultiCityRegionId).append("longName", longName)
				.append("shortName", shortName).append("country", country).append("province", province)
				.append("city", city).append("tla", tla).append("nonLocalizedCity", nonLocalizedCity).toString();
	}

}