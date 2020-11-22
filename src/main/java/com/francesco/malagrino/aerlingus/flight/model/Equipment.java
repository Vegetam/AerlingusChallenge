package com.francesco.malagrino.aerlingus.flight.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "airEquipType", "aircraftTailNumber" })
public class Equipment {

	@JsonProperty("airEquipType")
	private String airEquipType;
	@JsonProperty("aircraftTailNumber")
	private String aircraftTailNumber;

	@JsonProperty("airEquipType")
	public String getAirEquipType() {
		return airEquipType;
	}

	@JsonProperty("airEquipType")
	public void setAirEquipType(String airEquipType) {
		this.airEquipType = airEquipType;
	}

	@JsonProperty("aircraftTailNumber")
	public String getAircraftTailNumber() {
		return aircraftTailNumber;
	}

	@JsonProperty("aircraftTailNumber")
	public void setAircraftTailNumber(String aircraftTailNumber) {
		this.aircraftTailNumber = aircraftTailNumber;
	}
}
