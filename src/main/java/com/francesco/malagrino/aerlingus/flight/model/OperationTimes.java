package com.francesco.malagrino.aerlingus.flight.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "operationTimes" })
public class OperationTimes {

	@JsonProperty("operationTimes")
	private List<OperationTime> operationTimes = null;

	@JsonProperty("operationTimes")
	public List<OperationTime> getOperationTimes() {
		return operationTimes;
	}

	@JsonProperty("operationTimes")
	public void setOperationTimes(List<OperationTime> operationTimes) {
		this.operationTimes = operationTimes;
	}
}
