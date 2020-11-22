package com.francesco.malagrino.aerlingus.flight.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "description", "boarding", "disembarking", "booked", "flown" })
public class PassengerInformation {

	@JsonProperty("description")
	private String description;
	@JsonProperty("boarding")
	private Integer boarding;
	@JsonProperty("disembarking")
	private Integer disembarking;
	@JsonProperty("booked")
	private Integer booked;
	@JsonProperty("flown")
	private Integer flown;

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("boarding")
	public Integer getBoarding() {
		return boarding;
	}

	@JsonProperty("boarding")
	public void setBoarding(Integer boarding) {
		this.boarding = boarding;
	}

	@JsonProperty("disembarking")
	public Integer getDisembarking() {
		return disembarking;
	}

	@JsonProperty("disembarking")
	public void setDisembarking(Integer disembarking) {
		this.disembarking = disembarking;
	}

	@JsonProperty("booked")
	public Integer getBooked() {
		return booked;
	}

	@JsonProperty("booked")
	public void setBooked(Integer booked) {
		this.booked = booked;
	}

	@JsonProperty("flown")
	public Integer getFlown() {
		return flown;
	}

	@JsonProperty("flown")
	public void setFlown(Integer flown) {
		this.flown = flown;
	}

}
