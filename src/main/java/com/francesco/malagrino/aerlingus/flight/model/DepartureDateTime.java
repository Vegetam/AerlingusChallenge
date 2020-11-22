package com.francesco.malagrino.aerlingus.flight.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "scheduled", "actual" })
public class DepartureDateTime {

	@JsonProperty("scheduled")
	private String scheduled;
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

	@JsonProperty("actual")
	public String getActual() {
		return actual;
	}

	@JsonProperty("actual")
	public void setActual(String actual) {
		this.actual = actual;
	}
}
