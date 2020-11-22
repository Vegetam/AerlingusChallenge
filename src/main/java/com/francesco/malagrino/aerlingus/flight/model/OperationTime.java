package com.francesco.malagrino.aerlingus.flight.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "operationType", "timeType" })
public class OperationTime {

	@JsonProperty("operationType")
	private String operationType;
	@JsonProperty("timeType")
	private String timeType;

	@JsonProperty("operationType")
	public String getOperationType() {
		return operationType;
	}

	@JsonProperty("operationType")
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	@JsonProperty("timeType")
	public String getTimeType() {
		return timeType;
	}

	@JsonProperty("timeType")
	public void setTimeType(String timeType) {
		this.timeType = timeType;
	}
}
