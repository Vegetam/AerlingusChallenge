package com.francesco.malagrino.aerlingus.flight.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.francesco.malagrino.aerlingus.flight.model.FlightInfoDetail;
import com.francesco.malagrino.aerlingus.flight.service.FlightInfoService;

@RestController
@RequestMapping("/flight")
public class FlightInfoController {

	@Autowired
	private FlightInfoService service;

	@GetMapping(value = "/location/{locationCode}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Optional<List<FlightInfoDetail>> getFlightDetailsByLocationCode(
			@PathVariable(name = "locationCode", required = true) String locationCode) {
		return service.listFlightInfoByLocationCode(locationCode);
	}

	@GetMapping(value = "/arrival/{flightTime}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Optional<List<FlightInfoDetail>> getFlightDetailsByArrivalTime(
			@PathVariable(name = "flightTime", required = true) String flightTime) {
		return service.listFlightInfoByArrivalTime(flightTime);
	}

}
