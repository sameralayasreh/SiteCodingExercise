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
@JsonPropertyOrder({ "persona", "userId" })
public class UserInfo {

	@JsonProperty("persona")
	public Persona persona;
	@JsonProperty("userId")
	public String userId;

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(userId).append(persona).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof UserInfo) == false) {
			return false;
		}
		UserInfo rhs = ((UserInfo) other);
		return new EqualsBuilder().append(userId, rhs.userId).append(persona, rhs.persona).isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("persona", persona).append("userId", userId).toString();
	}

}