package com.francesco.malagrino.aerlingus.flight.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "cancelled", "messageTimestamp", "departureInformation", "arrivalInformation",
		"diversionInformations", "cabins", "dcsinformation", "atcinformation", "fuelInformation",
		"passengerInformations", "dateTimeExtra" })
public class Tpaextensions {

	@JsonProperty("cancelled")
	private Boolean cancelled;
	@JsonProperty("messageTimestamp")
	private String messageTimestamp;
	@JsonProperty("departureInformation")
	private DepartureInformation departureInformation;
	@JsonProperty("arrivalInformation")
	private ArrivalInformation arrivalInformation;
	@JsonProperty("diversionInformations")
	private List<DiversionInformation> diversionInformations = null;
	@JsonProperty("cabins")
	private List<Cabin> cabins = null;
	@JsonProperty("dcsinformation")
	private Dcsinformation dcsinformation;
	@JsonProperty("atcinformation")
	private Atcinformation atcinformation;
	@JsonProperty("fuelInformation")
	private FuelInformation fuelInformation;
	@JsonProperty("passengerInformations")
	private List<PassengerInformation> passengerInformations = null;
	@JsonProperty("dateTimeExtra")
	private DateTimeExtra dateTimeExtra;

	@JsonProperty("cancelled")
	public Boolean getCancelled() {
		return cancelled;
	}

	@JsonProperty("cancelled")
	public void setCancelled(Boolean cancelled) {
		this.cancelled = cancelled;
	}

	@JsonProperty("messageTimestamp")
	public String getMessageTimestamp() {
		return messageTimestamp;
	}

	@JsonProperty("messageTimestamp")
	public void setMessageTimestamp(String messageTimestamp) {
		this.messageTimestamp = messageTimestamp;
	}

	@JsonProperty("departureInformation")
	public DepartureInformation getDepartureInformation() {
		return departureInformation;
	}

	@JsonProperty("departureInformation")
	public void setDepartureInformation(DepartureInformation departureInformation) {
		this.departureInformation = departureInformation;
	}

	@JsonProperty("arrivalInformation")
	public ArrivalInformation getArrivalInformation() {
		return arrivalInformation;
	}

	@JsonProperty("arrivalInformation")
	public void setArrivalInformation(ArrivalInformation arrivalInformation) {
		this.arrivalInformation = arrivalInformation;
	}

	@JsonProperty("diversionInformations")
	public List<DiversionInformation> getDiversionInformations() {
		return diversionInformations;
	}

	@JsonProperty("diversionInformations")
	public void setDiversionInformations(List<DiversionInformation> diversionInformations) {
		this.diversionInformations = diversionInformations;
	}

	@JsonProperty("cabins")
	public List<Cabin> getCabins() {
		return cabins;
	}

	@JsonProperty("cabins")
	public void setCabins(List<Cabin> cabins) {
		this.cabins = cabins;
	}

	@JsonProperty("dcsinformation")
	public Dcsinformation getDcsinformation() {
		return dcsinformation;
	}

	@JsonProperty("dcsinformation")
	public void setDcsinformation(Dcsinformation dcsinformation) {
		this.dcsinformation = dcsinformation;
	}

	@JsonProperty("atcinformation")
	public Atcinformation getAtcinformation() {
		return atcinformation;
	}

	@JsonProperty("atcinformation")
	public void setAtcinformation(Atcinformation atcinformation) {
		this.atcinformation = atcinformation;
	}

	@JsonProperty("fuelInformation")
	public FuelInformation getFuelInformation() {
		return fuelInformation;
	}

	@JsonProperty("fuelInformation")
	public void setFuelInformation(FuelInformation fuelInformation) {
		this.fuelInformation = fuelInformation;
	}

	@JsonProperty("passengerInformations")
	public List<PassengerInformation> getPassengerInformations() {
		return passengerInformations;
	}

	@JsonProperty("passengerInformations")
	public void setPassengerInformations(List<PassengerInformation> passengerInformations) {
		this.passengerInformations = passengerInformations;
	}

	@JsonProperty("dateTimeExtra")
	public DateTimeExtra getDateTimeExtra() {
		return dateTimeExtra;
	}

	@JsonProperty("dateTimeExtra")
	public void setDateTimeExtra(DateTimeExtra dateTimeExtra) {
		this.dateTimeExtra = dateTimeExtra;
	}

}
