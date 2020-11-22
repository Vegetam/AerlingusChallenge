package com.francesco.malagrino.aerlingus.flight.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "hideInFIDS", "rampAgentActive", "offScreenTime", "specialServices", "loaderCrew",
		"plannedETETime", "rampAgent", "rampAgentRadio", "standNumber", "taxiOutTime" })
public class DepartureInformation {

	@JsonProperty("hideInFIDS")
	private Boolean hideInFIDS;
	@JsonProperty("rampAgentActive")
	private Boolean rampAgentActive;
	@JsonProperty("offScreenTime")
	private String offScreenTime;
	@JsonProperty("specialServices")
	private Boolean specialServices;
	@JsonProperty("loaderCrew")
	private String loaderCrew;
	@JsonProperty("plannedETETime")
	private String plannedETETime;
	@JsonProperty("rampAgent")
	private String rampAgent;
	@JsonProperty("rampAgentRadio")
	private String rampAgentRadio;
	@JsonProperty("standNumber")
	private String standNumber;
	@JsonProperty("taxiOutTime")
	private String taxiOutTime;

	@JsonProperty("hideInFIDS")
	public Boolean getHideInFIDS() {
		return hideInFIDS;
	}

	@JsonProperty("hideInFIDS")
	public void setHideInFIDS(Boolean hideInFIDS) {
		this.hideInFIDS = hideInFIDS;
	}

	@JsonProperty("rampAgentActive")
	public Boolean getRampAgentActive() {
		return rampAgentActive;
	}

	@JsonProperty("rampAgentActive")
	public void setRampAgentActive(Boolean rampAgentActive) {
		this.rampAgentActive = rampAgentActive;
	}

	@JsonProperty("offScreenTime")
	public String getOffScreenTime() {
		return offScreenTime;
	}

	@JsonProperty("offScreenTime")
	public void setOffScreenTime(String offScreenTime) {
		this.offScreenTime = offScreenTime;
	}

	@JsonProperty("specialServices")
	public Boolean getSpecialServices() {
		return specialServices;
	}

	@JsonProperty("specialServices")
	public void setSpecialServices(Boolean specialServices) {
		this.specialServices = specialServices;
	}

	@JsonProperty("loaderCrew")
	public String getLoaderCrew() {
		return loaderCrew;
	}

	@JsonProperty("loaderCrew")
	public void setLoaderCrew(String loaderCrew) {
		this.loaderCrew = loaderCrew;
	}

	@JsonProperty("plannedETETime")
	public String getPlannedETETime() {
		return plannedETETime;
	}

	@JsonProperty("plannedETETime")
	public void setPlannedETETime(String plannedETETime) {
		this.plannedETETime = plannedETETime;
	}

	@JsonProperty("rampAgent")
	public String getRampAgent() {
		return rampAgent;
	}

	@JsonProperty("rampAgent")
	public void setRampAgent(String rampAgent) {
		this.rampAgent = rampAgent;
	}

	@JsonProperty("rampAgentRadio")
	public String getRampAgentRadio() {
		return rampAgentRadio;
	}

	@JsonProperty("rampAgentRadio")
	public void setRampAgentRadio(String rampAgentRadio) {
		this.rampAgentRadio = rampAgentRadio;
	}

	@JsonProperty("standNumber")
	public String getStandNumber() {
		return standNumber;
	}

	@JsonProperty("standNumber")
	public void setStandNumber(String standNumber) {
		this.standNumber = standNumber;
	}

	@JsonProperty("taxiOutTime")
	public String getTaxiOutTime() {
		return taxiOutTime;
	}

	@JsonProperty("taxiOutTime")
	public void setTaxiOutTime(String taxiOutTime) {
		this.taxiOutTime = taxiOutTime;
	}
}
