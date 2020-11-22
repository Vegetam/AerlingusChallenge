package com.francesco.malagrino.aerlingus.flight.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "success", "flightInfoDetails", "timeStamp", "targetName", "transactionIdentifier",
		"correlationID" })
public class FlightInfo {

	@JsonProperty("success")
	private Success success;
	@JsonProperty("flightInfoDetails")
	private List<FlightInfoDetail> flightInfoDetails = null;
	@JsonProperty("timeStamp")
	private String timeStamp;
	@JsonProperty("targetName")
	private String targetName;
	@JsonProperty("transactionIdentifier")
	private String transactionIdentifier;
	@JsonProperty("correlationID")
	private String correlationID;

	@JsonProperty("success")
	public Success getSuccess() {
		return success;
	}

	@JsonProperty("success")
	public void setSuccess(Success success) {
		this.success = success;
	}

	@JsonProperty("flightInfoDetails")
	public List<FlightInfoDetail> getFlightInfoDetails() {
		return flightInfoDetails;
	}

	@JsonProperty("flightInfoDetails")
	public void setFlightInfoDetails(List<FlightInfoDetail> flightInfoDetails) {
		this.flightInfoDetails = flightInfoDetails;
	}

	@JsonProperty("timeStamp")
	public String getTimeStamp() {
		return timeStamp;
	}

	@JsonProperty("timeStamp")
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@JsonProperty("targetName")
	public String getTargetName() {
		return targetName;
	}

	@JsonProperty("targetName")
	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

	@JsonProperty("transactionIdentifier")
	public String getTransactionIdentifier() {
		return transactionIdentifier;
	}

	@JsonProperty("transactionIdentifier")
	public void setTransactionIdentifier(String transactionIdentifier) {
		this.transactionIdentifier = transactionIdentifier;
	}

	@JsonProperty("correlationID")
	public String getCorrelationID() {
		return correlationID;
	}

	@JsonProperty("correlationID")
	public void setCorrelationID(String correlationID) {
		this.correlationID = correlationID;
	}

}
