package com.francesco.malagrino.aerlingus.flight.component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.francesco.malagrino.aerlingus.flight.exception.BadGatewayException;
import com.francesco.malagrino.aerlingus.flight.exception.NotImplementedException;
import com.francesco.malagrino.aerlingus.flight.exception.ServiceUnavailableException;
import com.francesco.malagrino.aerlingus.flight.model.FlightInfo;

@Component
public class FlightInfoMockApi {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${flight.api.uri}")
	private String flightApiUri;
	@Value("${flight.default.flight.time}")
	private String flightDefaultFlightTime;
	@Value("${flight.default.location.code}")
	private String flightDefaultLocationCode;

	public ResponseEntity<FlightInfo> getFlightDetails(String flightTime, String locationCode) {
		locationCode = Optional.ofNullable(locationCode).orElse(flightDefaultLocationCode);
		flightTime = Optional.ofNullable(flightTime).orElse(flightDefaultFlightTime);
		ResponseEntity<FlightInfo> response = restTemplate.exchange(flightApiUri, HttpMethod.GET, null,
				FlightInfo.class, addParams(flightTime, locationCode));
		return responseWithOrWithoutAnyException(response);
	}

	private ResponseEntity<FlightInfo> responseWithOrWithoutAnyException(ResponseEntity<FlightInfo> response) {
		if (response.getStatusCode() == HttpStatus.OK) {
			return response;
		} else if (response.getStatusCode() == HttpStatus.BAD_GATEWAY) {
			throw new BadGatewayException("Bad Gatway.");
		} else if (response.getStatusCode() == HttpStatus.SERVICE_UNAVAILABLE) {
			throw new ServiceUnavailableException("Flight info mock service not available.");
		} else if (response.getStatusCode() == HttpStatus.NOT_IMPLEMENTED) {
			throw new NotImplementedException("Resource not implemented for flight info mock api.");
		}
		return response;
	}

	private Map<String, String> addParams(String flightTime, String locationCode) {
		Map<String, String> params = new HashMap<>();
		params.put("locationCode", locationCode);
		params.put("flightTime", flightTime);
		return params;
	}

}
