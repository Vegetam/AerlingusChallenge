package com.francesco.malagrino.aerlingus.flight.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "burnOff", "target", "flightPlan", "taxi", "zfw" })
public class Planning {

	@JsonProperty("burnOff")
	private Integer burnOff;
	@JsonProperty("target")
	private Integer target;
	@JsonProperty("flightPlan")
	private Integer flightPlan;
	@JsonProperty("taxi")
	private Integer taxi;
	@JsonProperty("zfw")
	private Integer zfw;

	@JsonProperty("burnOff")
	public Integer getBurnOff() {
		return burnOff;
	}

	@JsonProperty("burnOff")
	public void setBurnOff(Integer burnOff) {
		this.burnOff = burnOff;
	}

	@JsonProperty("target")
	public Integer getTarget() {
		return target;
	}

	@JsonProperty("target")
	public void setTarget(Integer target) {
		this.target = target;
	}

	@JsonProperty("flightPlan")
	public Integer getFlightPlan() {
		return flightPlan;
	}

	@JsonProperty("flightPlan")
	public void setFlightPlan(Integer flightPlan) {
		this.flightPlan = flightPlan;
	}

	@JsonProperty("taxi")
	public Integer getTaxi() {
		return taxi;
	}

	@JsonProperty("taxi")
	public void setTaxi(Integer taxi) {
		this.taxi = taxi;
	}

	@JsonProperty("zfw")
	public Integer getZfw() {
		return zfw;
	}

	@JsonProperty("zfw")
	public void setZfw(Integer zfw) {
		this.zfw = zfw;
	}
}
