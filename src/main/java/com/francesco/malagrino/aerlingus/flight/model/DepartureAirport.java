package com.francesco.malagrino.aerlingus.flight.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "locationCode", "gate" })
public class DepartureAirport {

	@JsonProperty("locationCode")
	private String locationCode;
	@JsonProperty("gate")
	private String gate;

	@JsonProperty("locationCode")
	public String getLocationCode() {
		return locationCode;
	}

	@JsonProperty("locationCode")
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	@JsonProperty("gate")
	public String getGate() {
		return gate;
	}

	@JsonProperty("gate")
	public void setGate(String gate) {
		this.gate = gate;
	}

}
