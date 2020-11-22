package com.francesco.malagrino.aerlingus.flight.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "kilos", "litres", "gam", "m2I", "r39" })
public class Uplift {

	@JsonProperty("kilos")
	private Integer kilos;
	@JsonProperty("litres")
	private Integer litres;
	@JsonProperty("gam")
	private Integer gam;
	@JsonProperty("m2I")
	private Integer m2I;
	@JsonProperty("r39")
	private Integer r39;

	@JsonProperty("kilos")
	public Integer getKilos() {
		return kilos;
	}

	@JsonProperty("kilos")
	public void setKilos(Integer kilos) {
		this.kilos = kilos;
	}

	@JsonProperty("litres")
	public Integer getLitres() {
		return litres;
	}

	@JsonProperty("litres")
	public void setLitres(Integer litres) {
		this.litres = litres;
	}

	@JsonProperty("gam")
	public Integer getGam() {
		return gam;
	}

	@JsonProperty("gam")
	public void setGam(Integer gam) {
		this.gam = gam;
	}

	@JsonProperty("m2I")
	public Integer getM2I() {
		return m2I;
	}

	@JsonProperty("m2I")
	public void setM2I(Integer m2I) {
		this.m2I = m2I;
	}

	@JsonProperty("r39")
	public Integer getR39() {
		return r39;
	}

	@JsonProperty("r39")
	public void setR39(Integer r39) {
		this.r39 = r39;
	}
}