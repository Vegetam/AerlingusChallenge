package com.francesco.malagrino.aerlingus.flight.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.client.RestTemplate;

import com.francesco.malagrino.aerlingus.flight.component.FlightInfoMockApi;
import com.francesco.malagrino.aerlingus.flight.model.FlightInfoDetail;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = FlightInfoServiceTest.class)
public class FlightInfoServiceTest {
	
	@Autowired
	private RestTemplate restTemplate;

	@InjectMocks
	private FlightInfoService service;
	
	@InjectMocks
	private FlightInfoMockApi mockApi;

	@BeforeEach
	public void setup() {
		ReflectionTestUtils.setField(service, "mockApi", mockApi);
		ReflectionTestUtils.setField(mockApi, "restTemplate", restTemplate);
		ReflectionTestUtils.setField(mockApi, "flightDefaultFlightTime", "1030-1700");
		ReflectionTestUtils.setField(mockApi, "flightDefaultLocationCode", "DUB");
		ReflectionTestUtils.setField(mockApi, "flightApiUri",
				"https://private-d3e4d2-flightinfo.apiary-mock.com/flightinfo/{flightTime}/departing/{locationCode}");
	}
	
	@Test
	public void test_flight_info_by_arrival_time() {
		Optional<List<FlightInfoDetail>> response = service.listFlightInfoByArrivalTime("1000-13100");
		assertThat(response).isNotNull();
	}
	
	@Test
	public void test_flight_info_by_location_code() {
		Optional<List<FlightInfoDetail>> response = service.listFlightInfoByLocationCode("DUB");
		assertThat(response).isNotNull();
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
