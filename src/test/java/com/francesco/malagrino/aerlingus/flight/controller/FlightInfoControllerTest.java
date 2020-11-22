package com.francesco.malagrino.aerlingus.flight.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.francesco.malagrino.aerlingus.flight.service.FlightInfoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightInfoControllerTest {

	private MockMvc mockMvc;

	@MockBean
	private FlightInfoService service;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@BeforeEach
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void test_get_flight_details_by_location_code() throws Exception {
		mockMvc.perform(get("/flight/location/{locationCode}", "v1", "DUB")
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}

	@Test
	@WithMockUser
	public void test_get_flight_details_by_arrival_time() throws Exception {
		mockMvc.perform(get("/flight/arrival/{flightTime}", "v1", "1000 - 1300")
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}

	@Test
	@WithMockUser
	public void test_should_return_when_flight_info_object_is_null_or_empty() throws Exception {
		when(service.listFlightInfoByLocationCode("LHR")).thenReturn(null);
		mockMvc.perform(get("/flight/arrival/{flightTime}", "v1", "1000 - 1300")
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$").doesNotExist());
	}
}
