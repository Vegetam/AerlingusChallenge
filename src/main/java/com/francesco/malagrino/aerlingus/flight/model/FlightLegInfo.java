package com.francesco.malagrino.aerlingus.flight.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "departureAirport", "arrivalAirports", "marketingAirline", "operatingAirline", "equipment",
		"departureDateTime", "arrivalDateTime", "journeyDuration", "operationTimes", "groundDuration" })
public class FlightLegInfo {

	@JsonProperty("departureAirport")
	private DepartureAirport departureAirport;
	@JsonProperty("arrivalAirports")
	private List<ArrivalAirport> arrivalAirports = null;
	@JsonProperty("marketingAirline")
	private MarketingAirline marketingAirline;
	@JsonProperty("operatingAirline")
	private OperatingAirline operatingAirline;
	@JsonProperty("equipment")
	private Equipment equipment;
	@JsonProperty("departureDateTime")
	private DepartureDateTime departureDateTime;
	@JsonProperty("arrivalDateTime")
	private ArrivalDateTime arrivalDateTime;
	@JsonProperty("journeyDuration")
	private String journeyDuration;
	@JsonProperty("operationTimes")
	private OperationTimes operationTimes;
	@JsonProperty("groundDuration")
	private String groundDuration;

	@JsonProperty("departureAirport")
	public DepartureAirport getDepartureAirport() {
		return departureAirport;
	}

	@JsonProperty("departureAirport")
	public void setDepartureAirport(DepartureAirport departureAirport) {
		this.departureAirport = departureAirport;
	}

	@JsonProperty("arrivalAirports")
	public List<ArrivalAirport> getArrivalAirports() {
		return arrivalAirports;
	}

	@JsonProperty("arrivalAirports")
	public void setArrivalAirports(List<ArrivalAirport> arrivalAirports) {
		this.arrivalAirports = arrivalAirports;
	}

	@JsonProperty("marketingAirline")
	public MarketingAirline getMarketingAirline() {
		return marketingAirline;
	}

	@JsonProperty("marketingAirline")
	public void setMarketingAirline(MarketingAirline marketingAirline) {
		this.marketingAirline = marketingAirline;
	}

	@JsonProperty("operatingAirline")
	public OperatingAirline getOperatingAirline() {
		return operatingAirline;
	}

	@JsonProperty("operatingAirline")
	public void setOperatingAirline(OperatingAirline operatingAirline) {
		this.operatingAirline = operatingAirline;
	}

	@JsonProperty("equipment")
	public Equipment getEquipment() {
		return equipment;
	}

	@JsonProperty("equipment")
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	@JsonProperty("departureDateTime")
	public DepartureDateTime getDepartureDateTime() {
		return departureDateTime;
	}

	@JsonProperty("departureDateTime")
	public void setDepartureDateTime(DepartureDateTime departureDateTime) {
		this.departureDateTime = departureDateTime;
	}

	@JsonProperty("arrivalDateTime")
	public ArrivalDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}

	@JsonProperty("arrivalDateTime")
	public void setArrivalDateTime(ArrivalDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	@JsonProperty("journeyDuration")
	public String getJourneyDuration() {
		return journeyDuration;
	}

	@JsonProperty("journeyDuration")
	public void setJourneyDuration(String journeyDuration) {
		this.journeyDuration = journeyDuration;
	}

	@JsonProperty("operationTimes")
	public OperationTimes getOperationTimes() {
		return operationTimes;
	}

	@JsonProperty("operationTimes")
	public void setOperationTimes(OperationTimes operationTimes) {
		this.operationTimes = operationTimes;
	}

	@JsonProperty("groundDuration")
	public String getGroundDuration() {
		return groundDuration;
	}

	@JsonProperty("groundDuration")
	public void setGroundDuration(String groundDuration) {
		this.groundDuration = groundDuration;
	}
}
