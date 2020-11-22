package com.francesco.malagrino.aerlingus.flight.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "diversion", "locationCode" })
public class ArrivalAirport {

	@JsonProperty("diversion")
	private Boolean diversion;
	@JsonProperty("locationCode")
	private String locationCode;

	@JsonProperty("diversion")
	public Boolean getDiversion() {
		return diversion;
	}

	@JsonProperty("diversion")
	public void setDiversion(Boolean diversion) {
		this.diversion = diversion;
	}

	@JsonProperty("locationCode")
	public String getLocationCode() {
		return locationCode;
	}

	@JsonProperty("locationCode")
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
}
