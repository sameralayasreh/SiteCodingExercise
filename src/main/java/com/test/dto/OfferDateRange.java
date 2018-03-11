package com.test.dto;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "travelStartDate", "travelEndDate", "lengthOfStay" })
public class OfferDateRange {

	@JsonProperty("travelStartDate")
	public List<Long> travelStartDate = null;
	@JsonProperty("travelEndDate")
	public List<Long> travelEndDate = null;
	@JsonProperty("lengthOfStay")
	public Long lengthOfStay;
	
	

	public List<Long> getTravelStartDate() {
		return travelStartDate;
	}

	public void setTravelStartDate(List<Long> travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	public List<Long> getTravelEndDate() {
		return travelEndDate;
	}

	public void setTravelEndDate(List<Long> travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	public Long getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(Long lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(travelEndDate).append(lengthOfStay).append(travelStartDate).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof OfferDateRange) == false) {
			return false;
		}
		OfferDateRange rhs = ((OfferDateRange) other);
		return new EqualsBuilder().append(travelEndDate, rhs.travelEndDate).append(lengthOfStay, rhs.lengthOfStay)
				.append(travelStartDate, rhs.travelStartDate).isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("travelStartDate", travelStartDate)
				.append("travelEndDate", travelEndDate).append("lengthOfStay", lengthOfStay).toString();
	}

}