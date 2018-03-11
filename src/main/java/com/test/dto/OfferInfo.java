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
@JsonPropertyOrder({ "siteID", "language", "currency", "userSelectedCurrency" })
public class OfferInfo {

	@JsonProperty("siteID")
	public String siteID;
	@JsonProperty("language")
	public String language;
	@JsonProperty("currency")
	public String currency;
	@JsonProperty("userSelectedCurrency")
	public String userSelectedCurrency;

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(siteID).append(userSelectedCurrency).append(language).append(currency)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof OfferInfo) == false) {
			return false;
		}
		OfferInfo rhs = ((OfferInfo) other);
		return new EqualsBuilder().append(siteID, rhs.siteID).append(userSelectedCurrency, rhs.userSelectedCurrency)
				.append(language, rhs.language).append(currency, rhs.currency).isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("siteID", siteID).append("language", language)
				.append("currency", currency).append("userSelectedCurrency", userSelectedCurrency).toString();
	}

}