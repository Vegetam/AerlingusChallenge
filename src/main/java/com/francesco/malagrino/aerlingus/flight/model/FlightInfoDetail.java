package com.francesco.malagrino.aerlingus.flight.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "flightLegInfos", "messageStatus", "flightNumber", "tpaextensions", "totalFlightTime" })
public class FlightInfoDetail {

	@JsonProperty("flightLegInfos")
	private List<FlightLegInfo> flightLegInfos = null;
	@JsonProperty("messageStatus")
	private String messageStatus;
	@JsonProperty("flightNumber")
	private String flightNumber;
	@JsonProperty("tpaextensions")
	private Tpaextensions tpaextensions;
	@JsonProperty("totalFlightTime")
	private String totalFlightTime;

	@JsonProperty("flightLegInfos")
	public List<FlightLegInfo> getFlightLegInfos() {
		return flightLegInfos;
	}

	@JsonProperty("flightLegInfos")
	public void setFlightLegInfos(List<FlightLegInfo> flightLegInfos) {
		this.flightLegInfos = flightLegInfos;
	}

	@JsonProperty("messageStatus")
	public String getMessageStatus() {
		return messageStatus;
	}

	@JsonProperty("messageStatus")
	public void setMessageStatus(String messageStatus) {
		this.messageStatus = messageStatus;
	}

	@JsonProperty("flightNumber")
	public String getFlightNumber() {
		return flightNumber;
	}

	@JsonProperty("flightNumber")
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	@JsonProperty("tpaextensions")
	public Tpaextensions getTpaextensions() {
		return tpaextensions;
	}

	@JsonProperty("tpaextensions")
	public void setTpaextensions(Tpaextensions tpaextensions) {
		this.tpaextensions = tpaextensions;
	}

	@JsonProperty("totalFlightTime")
	public String getTotalFlightTime() {
		return totalFlightTime;
	}

	@JsonProperty("totalFlightTime")
	public void setTotalFlightTime(String totalFlightTime) {
		this.totalFlightTime = totalFlightTime;
	}

}
