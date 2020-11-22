package com.francesco.malagrino.aerlingus.flight.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "doorsClosedDateTime", "firstPaxDateTime", "lastPaxDateTime" })
public class DateTimeExtra {

	@JsonProperty("doorsClosedDateTime")
	private String doorsClosedDateTime;
	@JsonProperty("firstPaxDateTime")
	private String firstPaxDateTime;
	@JsonProperty("lastPaxDateTime")
	private String lastPaxDateTime;

	@JsonProperty("doorsClosedDateTime")
	public String getDoorsClosedDateTime() {
		return doorsClosedDateTime;
	}

	@JsonProperty("doorsClosedDateTime")
	public void setDoorsClosedDateTime(String doorsClosedDateTime) {
		this.doorsClosedDateTime = doorsClosedDateTime;
	}

	@JsonProperty("firstPaxDateTime")
	public String getFirstPaxDateTime() {
		return firstPaxDateTime;
	}

	@JsonProperty("firstPaxDateTime")
	public void setFirstPaxDateTime(String firstPaxDateTime) {
		this.firstPaxDateTime = firstPaxDateTime;
	}

	@JsonProperty("lastPaxDateTime")
	public String getLastPaxDateTime() {
		return lastPaxDateTime;
	}

	@JsonProperty("lastPaxDateTime")
	public void setLastPaxDateTime(String lastPaxDateTime) {
		this.lastPaxDateTime = lastPaxDateTime;
	}

}
