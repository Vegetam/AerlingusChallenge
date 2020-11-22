package com.francesco.malagrino.aerlingus.flight.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "landing", "landingM2P", "taxiIn", "onStand", "onStandM2P", "landingR39", "onStandR39" })
public class Arrival {

	@JsonProperty("landing")
	private Integer landing;
	@JsonProperty("landingM2P")
	private Integer landingM2P;
	@JsonProperty("taxiIn")
	private Integer taxiIn;
	@JsonProperty("onStand")
	private Integer onStand;
	@JsonProperty("onStandM2P")
	private Integer onStandM2P;
	@JsonProperty("landingR39")
	private Integer landingR39;
	@JsonProperty("onStandR39")
	private Integer onStandR39;

	@JsonProperty("landing")
	public Integer getLanding() {
		return landing;
	}

	@JsonProperty("landing")
	public void setLanding(Integer landing) {
		this.landing = landing;
	}

	@JsonProperty("landingM2P")
	public Integer getLandingM2P() {
		return landingM2P;
	}

	@JsonProperty("landingM2P")
	public void setLandingM2P(Integer landingM2P) {
		this.landingM2P = landingM2P;
	}

	@JsonProperty("taxiIn")
	public Integer getTaxiIn() {
		return taxiIn;
	}

	@JsonProperty("taxiIn")
	public void setTaxiIn(Integer taxiIn) {
		this.taxiIn = taxiIn;
	}

	@JsonProperty("onStand")
	public Integer getOnStand() {
		return onStand;
	}

	@JsonProperty("onStand")
	public void setOnStand(Integer onStand) {
		this.onStand = onStand;
	}

	@JsonProperty("onStandM2P")
	public Integer getOnStandM2P() {
		return onStandM2P;
	}

	@JsonProperty("onStandM2P")
	public void setOnStandM2P(Integer onStandM2P) {
		this.onStandM2P = onStandM2P;
	}

	@JsonProperty("landingR39")
	public Integer getLandingR39() {
		return landingR39;
	}

	@JsonProperty("landingR39")
	public void setLandingR39(Integer landingR39) {
		this.landingR39 = landingR39;
	}

	@JsonProperty("onStandR39")
	public Integer getOnStandR39() {
		return onStandR39;
	}

	@JsonProperty("onStandR39")
	public void setOnStandR39(Integer onStandR39) {
		this.onStandR39 = onStandR39;
	}
}
