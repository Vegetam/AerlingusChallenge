package com.francesco.malagrino.aerlingus.flight.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "flightDiversionInProgress", "legDiversionInProgress", "diversionLeg", "divertedLeg",
		"redundantLeg", "newLegDiversion", "reroutedLeg", "rerouteLeg" })
public class DiversionInformation {

	@JsonProperty("flightDiversionInProgress")
	private Boolean flightDiversionInProgress;
	@JsonProperty("legDiversionInProgress")
	private Boolean legDiversionInProgress;
	@JsonProperty("diversionLeg")
	private Boolean diversionLeg;
	@JsonProperty("divertedLeg")
	private Boolean divertedLeg;
	@JsonProperty("redundantLeg")
	private Boolean redundantLeg;
	@JsonProperty("newLegDiversion")
	private Boolean newLegDiversion;
	@JsonProperty("reroutedLeg")
	private Boolean reroutedLeg;
	@JsonProperty("rerouteLeg")
	private Boolean rerouteLeg;

	@JsonProperty("flightDiversionInProgress")
	public Boolean getFlightDiversionInProgress() {
		return flightDiversionInProgress;
	}

	@JsonProperty("flightDiversionInProgress")
	public void setFlightDiversionInProgress(Boolean flightDiversionInProgress) {
		this.flightDiversionInProgress = flightDiversionInProgress;
	}

	@JsonProperty("legDiversionInProgress")
	public Boolean getLegDiversionInProgress() {
		return legDiversionInProgress;
	}

	@JsonProperty("legDiversionInProgress")
	public void setLegDiversionInProgress(Boolean legDiversionInProgress) {
		this.legDiversionInProgress = legDiversionInProgress;
	}

	@JsonProperty("diversionLeg")
	public Boolean getDiversionLeg() {
		return diversionLeg;
	}

	@JsonProperty("diversionLeg")
	public void setDiversionLeg(Boolean diversionLeg) {
		this.diversionLeg = diversionLeg;
	}

	@JsonProperty("divertedLeg")
	public Boolean getDivertedLeg() {
		return divertedLeg;
	}

	@JsonProperty("divertedLeg")
	public void setDivertedLeg(Boolean divertedLeg) {
		this.divertedLeg = divertedLeg;
	}

	@JsonProperty("redundantLeg")
	public Boolean getRedundantLeg() {
		return redundantLeg;
	}

	@JsonProperty("redundantLeg")
	public void setRedundantLeg(Boolean redundantLeg) {
		this.redundantLeg = redundantLeg;
	}

	@JsonProperty("newLegDiversion")
	public Boolean getNewLegDiversion() {
		return newLegDiversion;
	}

	@JsonProperty("newLegDiversion")
	public void setNewLegDiversion(Boolean newLegDiversion) {
		this.newLegDiversion = newLegDiversion;
	}

	@JsonProperty("reroutedLeg")
	public Boolean getReroutedLeg() {
		return reroutedLeg;
	}

	@JsonProperty("reroutedLeg")
	public void setReroutedLeg(Boolean reroutedLeg) {
		this.reroutedLeg = reroutedLeg;
	}

	@JsonProperty("rerouteLeg")
	public Boolean getRerouteLeg() {
		return rerouteLeg;
	}

	@JsonProperty("rerouteLeg")
	public void setRerouteLeg(Boolean rerouteLeg) {
		this.rerouteLeg = rerouteLeg;
	}
}
