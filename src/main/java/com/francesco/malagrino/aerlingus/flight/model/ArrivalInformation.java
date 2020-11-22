package com.francesco.malagrino.aerlingus.flight.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "hideInFIDS", "rampAgentActive", "offScreenTime", "taxiInTime", "timeAdjustment" })
public class ArrivalInformation {

	@JsonProperty("hideInFIDS")
	private Boolean hideInFIDS;
	@JsonProperty("rampAgentActive")
	private Boolean rampAgentActive;
	@JsonProperty("offScreenTime")
	private String offScreenTime;
	@JsonProperty("taxiInTime")
	private String taxiInTime;
	@JsonProperty("timeAdjustment")
	private Integer timeAdjustment;

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

	@JsonProperty("taxiInTime")
	public String getTaxiInTime() {
		return taxiInTime;
	}

	@JsonProperty("taxiInTime")
	public void setTaxiInTime(String taxiInTime) {
		this.taxiInTime = taxiInTime;
	}

	@JsonProperty("timeAdjustment")
	public Integer getTimeAdjustment() {
		return timeAdjustment;
	}

	@JsonProperty("timeAdjustment")
	public void setTimeAdjustment(Integer timeAdjustment) {
		this.timeAdjustment = timeAdjustment;
	}
}
