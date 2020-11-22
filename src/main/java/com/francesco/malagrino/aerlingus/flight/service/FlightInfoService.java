package com.francesco.malagrino.aerlingus.flight.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.francesco.malagrino.aerlingus.flight.component.FlightInfoMockApi;
import com.francesco.malagrino.aerlingus.flight.model.FlightInfo;
import com.francesco.malagrino.aerlingus.flight.model.FlightInfoDetail;

@Service
public class FlightInfoService {

	@Autowired
	private FlightInfoMockApi mockApi;
	
	public Optional<List<FlightInfoDetail>> listFlightInfoByLocationCode(final String locationCode) {
		ResponseEntity<FlightInfo> response = mockApi.getFlightDetails(null, locationCode);
		return Optional.ofNullable(response.getBody().getFlightInfoDetails());
	}

	public Optional<List<FlightInfoDetail>> listFlightInfoByArrivalTime(final String flightTime) {
		ResponseEntity<FlightInfo> response = mockApi.getFlightDetails(flightTime, null);
		return Optional.ofNullable(response.getBody().getFlightInfoDetails());
	}
}
