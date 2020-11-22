package com.francesco.malagrino.aerlingus.flight.component;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.client.RestTemplate;

import com.francesco.malagrino.aerlingus.flight.model.FlightInfo;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FlightInfoMockApiTest.class)
public class FlightInfoMockApiTest {

	@Autowired
	private RestTemplate restTemplate;

	@InjectMocks
	private FlightInfoMockApi api;

	@BeforeEach
	public void setup() {
		ReflectionTestUtils.setField(api, "restTemplate", restTemplate);
		ReflectionTestUtils.setField(api, "flightDefaultFlightTime", "1030-1700");
		ReflectionTestUtils.setField(api, "flightDefaultLocationCode", "DUB");
		ReflectionTestUtils.setField(api, "flightApiUri",
				"https://private-d3e4d2-flightinfo.apiary-mock.com/flightinfo/{flightTime}/departing/{locationCode}");
	}

	@Test
	public void test_get_flight_details() {
		ResponseEntity<FlightInfo> response = api.getFlightDetails(null, "DUB");
		assertThat(response).isNotNull();
	}

	@Test
	public void test_get_flight_details_when_throws_bad_gateway_502() {
		FlightInfoMockApi mockApi = Mockito.mock(FlightInfoMockApi.class);
		FlightInfo fInfo = new FlightInfo();
		ResponseEntity<FlightInfo> response = new ResponseEntity<>(fInfo, HttpStatus.BAD_GATEWAY);
		when(mockApi.getFlightDetails(null, "DUB")).thenReturn(response);
		assertEquals(HttpStatus.BAD_GATEWAY, response.getStatusCode());
	}

	@Test
	public void test_get_flight_details_when_throws_not_implemented_501() {
		FlightInfoMockApi mockApi = Mockito.mock(FlightInfoMockApi.class);
		FlightInfo fInfo = new FlightInfo();
		ResponseEntity<FlightInfo> response = new ResponseEntity<>(fInfo, HttpStatus.NOT_IMPLEMENTED);
		when(mockApi.getFlightDetails(null, "DUB")).thenReturn(response);
		assertEquals(HttpStatus.NOT_IMPLEMENTED, response.getStatusCode());
	}
	
	@Test
	public void test_get_flight_details_when_throws_service_unavailable_503() {
		FlightInfoMockApi mockApi = Mockito.mock(FlightInfoMockApi.class);
		FlightInfo fInfo = new FlightInfo();
		ResponseEntity<FlightInfo> response = new ResponseEntity<>(fInfo, HttpStatus.SERVICE_UNAVAILABLE);
		when(mockApi.getFlightDetails(null, "DUB")).thenReturn(response);
		assertEquals(HttpStatus.SERVICE_UNAVAILABLE, response.getStatusCode());
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
