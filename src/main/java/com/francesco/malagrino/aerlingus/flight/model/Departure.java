package com.francesco.malagrino.aerlingus.flight.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "pushback", "pushbackM2P", "taxiOut", "takeoff", "takeoffM2P", "pushbackR39", "takeoffR39" })
public class Departure {

	@JsonProperty("pushback")
	private Integer pushback;
	@JsonProperty("pushbackM2P")
	private Integer pushbackM2P;
	@JsonProperty("taxiOut")
	private Integer taxiOut;
	@JsonProperty("takeoff")
	private Integer takeoff;
	@JsonProperty("takeoffM2P")
	private Integer takeoffM2P;
	@JsonProperty("pushbackR39")
	private Integer pushbackR39;
	@JsonProperty("takeoffR39")
	private Integer takeoffR39;

	@JsonProperty("pushback")
	public Integer getPushback() {
		return pushback;
	}

	@JsonProperty("pushback")
	public void setPushback(Integer pushback) {
		this.pushback = pushback;
	}

	@JsonProperty("pushbackM2P")
	public Integer getPushbackM2P() {
		return pushbackM2P;
	}

	@JsonProperty("pushbackM2P")
	public void setPushbackM2P(Integer pushbackM2P) {
		this.pushbackM2P = pushbackM2P;
	}

	@JsonProperty("taxiOut")
	public Integer getTaxiOut() {
		return taxiOut;
	}

	@JsonProperty("taxiOut")
	public void setTaxiOut(Integer taxiOut) {
		this.taxiOut = taxiOut;
	}

	@JsonProperty("takeoff")
	public Integer getTakeoff() {
		return takeoff;
	}

	@JsonProperty("takeoff")
	public void setTakeoff(Integer takeoff) {
		this.takeoff = takeoff;
	}

	@JsonProperty("takeoffM2P")
	public Integer getTakeoffM2P() {
		return takeoffM2P;
	}

	@JsonProperty("takeoffM2P")
	public void setTakeoffM2P(Integer takeoffM2P) {
		this.takeoffM2P = takeoffM2P;
	}

	@JsonProperty("pushbackR39")
	public Integer getPushbackR39() {
		return pushbackR39;
	}

	@JsonProperty("pushbackR39")
	public void setPushbackR39(Integer pushbackR39) {
		this.pushbackR39 = pushbackR39;
	}

	@JsonProperty("takeoffR39")
	public Integer getTakeoffR39() {
		return takeoffR39;
	}

	@JsonProperty("takeoffR39")
	public void setTakeoffR39(Integer takeoffR39) {
		this.takeoffR39 = takeoffR39;
	}
}
