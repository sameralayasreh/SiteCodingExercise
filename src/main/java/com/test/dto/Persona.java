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
@JsonPropertyOrder({ "personaType" })
public class Persona {

	@JsonProperty("personaType")
	public String personaType;

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(personaType).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Persona) == false) {
			return false;
		}
		Persona rhs = ((Persona) other);
		return new EqualsBuilder().append(personaType, rhs.personaType).isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("personaType", personaType).toString();
	}

}