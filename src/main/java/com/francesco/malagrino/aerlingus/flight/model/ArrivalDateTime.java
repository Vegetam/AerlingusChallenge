package com.francesco.malagrino.aerlingus.flight.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "scheduled", "estimated", "actual" })
public class ArrivalDateTime {

	@JsonProperty("scheduled")
	private String scheduled;
	@JsonProperty("estimated")
	private String estimated;
	@JsonProperty("actual")
	private String actual;

	@JsonProperty("scheduled")
	public String getScheduled() {
		return scheduled;
	}

	@JsonProperty("scheduled")
	public void setScheduled(String scheduled) {
		this.scheduled = scheduled;
	}

	@JsonProperty("estimated")
	public String getEstimated() {
		return estimated;
	}

	@JsonProperty("estimated")
	public void setEstimated(String estimated) {
		this.estimated = estimated;
	}

	@JsonProperty("actual")
	public String getActual() {
		return actual;
	}

	@JsonProperty("actual")
	public void setActual(String actual) {
		this.actual = actual;
	}

}
