package com.francesco.malagrino.aerlingus.flight.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "availableSeats", "disruptionInfo", "flightType", "legNumber", "legCount", "regSnag",
		"aircraftRegistration", "currentStatus", "dryOperatingWeight", "estimatedOnRouteTime", "payloadFlownWeight",
		"wheelChairCount" })
public class Dcsinformation {

	@JsonProperty("availableSeats")
	private Integer availableSeats;
	@JsonProperty("disruptionInfo")
	private Boolean disruptionInfo;
	@JsonProperty("flightType")
	private String flightType;
	@JsonProperty("legNumber")
	private Integer legNumber;
	@JsonProperty("legCount")
	private Integer legCount;
	@JsonProperty("regSnag")
	private Boolean regSnag;
	@JsonProperty("aircraftRegistration")
	private String aircraftRegistration;
	@JsonProperty("currentStatus")
	private String currentStatus;
	@JsonProperty("dryOperatingWeight")
	private Integer dryOperatingWeight;
	@JsonProperty("estimatedOnRouteTime")
	private String estimatedOnRouteTime;
	@JsonProperty("payloadFlownWeight")
	private Integer payloadFlownWeight;
	@JsonProperty("wheelChairCount")
	private Integer wheelChairCount;

	@JsonProperty("availableSeats")
	public Integer getAvailableSeats() {
		return availableSeats;
	}

	@JsonProperty("availableSeats")
	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}

	@JsonProperty("disruptionInfo")
	public Boolean getDisruptionInfo() {
		return disruptionInfo;
	}

	@JsonProperty("disruptionInfo")
	public void setDisruptionInfo(Boolean disruptionInfo) {
		this.disruptionInfo = disruptionInfo;
	}

	@JsonProperty("flightType")
	public String getFlightType() {
		return flightType;
	}

	@JsonProperty("flightType")
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	@JsonProperty("legNumber")
	public Integer getLegNumber() {
		return legNumber;
	}

	@JsonProperty("legNumber")
	public void setLegNumber(Integer legNumber) {
		this.legNumber = legNumber;
	}

	@JsonProperty("legCount")
	public Integer getLegCount() {
		return legCount;
	}

	@JsonProperty("legCount")
	public void setLegCount(Integer legCount) {
		this.legCount = legCount;
	}

	@JsonProperty("regSnag")
	public Boolean getRegSnag() {
		return regSnag;
	}

	@JsonProperty("regSnag")
	public void setRegSnag(Boolean regSnag) {
		this.regSnag = regSnag;
	}

	@JsonProperty("aircraftRegistration")
	public String getAircraftRegistration() {
		return aircraftRegistration;
	}

	@JsonProperty("aircraftRegistration")
	public void setAircraftRegistration(String aircraftRegistration) {
		this.aircraftRegistration = aircraftRegistration;
	}

	@JsonProperty("currentStatus")
	public String getCurrentStatus() {
		return currentStatus;
	}

	@JsonProperty("currentStatus")
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	@JsonProperty("dryOperatingWeight")
	public Integer getDryOperatingWeight() {
		return dryOperatingWeight;
	}

	@JsonProperty("dryOperatingWeight")
	public void setDryOperatingWeight(Integer dryOperatingWeight) {
		this.dryOperatingWeight = dryOperatingWeight;
	}

	@JsonProperty("estimatedOnRouteTime")
	public String getEstimatedOnRouteTime() {
		return estimatedOnRouteTime;
	}

	@JsonProperty("estimatedOnRouteTime")
	public void setEstimatedOnRouteTime(String estimatedOnRouteTime) {
		this.estimatedOnRouteTime = estimatedOnRouteTime;
	}

	@JsonProperty("payloadFlownWeight")
	public Integer getPayloadFlownWeight() {
		return payloadFlownWeight;
	}

	@JsonProperty("payloadFlownWeight")
	public void setPayloadFlownWeight(Integer payloadFlownWeight) {
		this.payloadFlownWeight = payloadFlownWeight;
	}

	@JsonProperty("wheelChairCount")
	public Integer getWheelChairCount() {
		return wheelChairCount;
	}

	@JsonProperty("wheelChairCount")
	public void setWheelChairCount(Integer wheelChairCount) {
		this.wheelChairCount = wheelChairCount;
	}
}