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
@JsonPropertyOrder({ "Hotel" })
public class Offers {

	@JsonProperty("Hotel")
	public List<Hotel> hotel = null;
	
	
	

	public List<Hotel> getHotel() {
		return hotel;
	}

	public void setHotel(List<Hotel> hotel) {
		this.hotel = hotel;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(hotel).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Offers) == false) {
			return false;
		}
		Offers rhs = ((Offers) other);
		return new EqualsBuilder().append(hotel, rhs.hotel).isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("hotel", hotel).toString();
	}

}