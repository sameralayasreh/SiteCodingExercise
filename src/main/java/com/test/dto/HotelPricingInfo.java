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
@JsonPropertyOrder({ "averagePriceValue", "totalPriceValue", "crossOutPriceValue", "originalPricePerNight", "currency",
		"percentSavings", "drr" })
public class HotelPricingInfo {

	@JsonProperty("averagePriceValue")
	public Double averagePriceValue;
	@JsonProperty("totalPriceValue")
	public Double totalPriceValue;
	@JsonProperty("crossOutPriceValue")
	public Double crossOutPriceValue;
	@JsonProperty("originalPricePerNight")
	public Double originalPricePerNight;
	@JsonProperty("currency")
	public String currency;
	@JsonProperty("percentSavings")
	public Double percentSavings;
	@JsonProperty("drr")
	public Boolean drr;
	
	

	public Double getAveragePriceValue() {
		return averagePriceValue;
	}

	public void setAveragePriceValue(Double averagePriceValue) {
		this.averagePriceValue = averagePriceValue;
	}

	public Double getTotalPriceValue() {
		return totalPriceValue;
	}

	public void setTotalPriceValue(Double totalPriceValue) {
		this.totalPriceValue = totalPriceValue;
	}

	public Double getCrossOutPriceValue() {
		return crossOutPriceValue;
	}

	public void setCrossOutPriceValue(Double crossOutPriceValue) {
		this.crossOutPriceValue = crossOutPriceValue;
	}

	public Double getOriginalPricePerNight() {
		return originalPricePerNight;
	}

	public void setOriginalPricePerNight(Double originalPricePerNight) {
		this.originalPricePerNight = originalPricePerNight;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getPercentSavings() {
		return percentSavings;
	}

	public void setPercentSavings(Double percentSavings) {
		this.percentSavings = percentSavings;
	}

	public Boolean getDrr() {
		return drr;
	}

	public void setDrr(Boolean drr) {
		this.drr = drr;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(totalPriceValue).append(averagePriceValue).append(originalPricePerNight)
				.append(drr).append(percentSavings).append(currency).append(crossOutPriceValue).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof HotelPricingInfo) == false) {
			return false;
		}
		HotelPricingInfo rhs = ((HotelPricingInfo) other);
		return new EqualsBuilder().append(totalPriceValue, rhs.totalPriceValue)
				.append(averagePriceValue, rhs.averagePriceValue)
				.append(originalPricePerNight, rhs.originalPricePerNight).append(drr, rhs.drr)
				.append(percentSavings, rhs.percentSavings).append(currency, rhs.currency)
				.append(crossOutPriceValue, rhs.crossOutPriceValue).isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("averagePriceValue", averagePriceValue)
				.append("totalPriceValue", totalPriceValue).append("crossOutPriceValue", crossOutPriceValue)
				.append("originalPricePerNight", originalPricePerNight).append("currency", currency)
				.append("percentSavings", percentSavings).append("drr", drr).toString();
	}

}