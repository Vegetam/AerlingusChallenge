package com.francesco.malagrino.aerlingus.flight.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "planning", "uplift", "departure", "arrival", "specificGravityGAM", "specificGravityM2I" })
public class FuelInformation {

	@JsonProperty("planning")
	private Planning planning;
	@JsonProperty("uplift")
	private Uplift uplift;
	@JsonProperty("departure")
	private Departure departure;
	@JsonProperty("arrival")
	private Arrival arrival;
	@JsonProperty("specificGravityGAM")
	private Double specificGravityGAM;
	@JsonProperty("specificGravityM2I")
	private Double specificGravityM2I;

	@JsonProperty("planning")
	public Planning getPlanning() {
		return planning;
	}

	@JsonProperty("planning")
	public void setPlanning(Planning planning) {
		this.planning = planning;
	}

	@JsonProperty("uplift")
	public Uplift getUplift() {
		return uplift;
	}

	@JsonProperty("uplift")
	public void setUplift(Uplift uplift) {
		this.uplift = uplift;
	}

	@JsonProperty("departure")
	public Departure getDeparture() {
		return departure;
	}

	@JsonProperty("departure")
	public void setDeparture(Departure departure) {
		this.departure = departure;
	}

	@JsonProperty("arrival")
	public Arrival getArrival() {
		return arrival;
	}

	@JsonProperty("arrival")
	public void setArrival(Arrival arrival) {
		this.arrival = arrival;
	}

	@JsonProperty("specificGravityGAM")
	public Double getSpecificGravityGAM() {
		return specificGravityGAM;
	}

	@JsonProperty("specificGravityGAM")
	public void setSpecificGravityGAM(Double specificGravityGAM) {
		this.specificGravityGAM = specificGravityGAM;
	}

	@JsonProperty("specificGravityM2I")
	public Double getSpecificGravityM2I() {
		return specificGravityM2I;
	}

	@JsonProperty("specificGravityM2I")
	public void setSpecificGravityM2I(Double specificGravityM2I) {
		this.specificGravityM2I = specificGravityM2I;
	}
}
