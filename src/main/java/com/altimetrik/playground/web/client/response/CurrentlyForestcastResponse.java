package com.altimetrik.playground.web.client.response;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentlyForestcastResponse {
	
	private Instant time;
	private int temperature;
	
	public Instant getTime() {
		return time;
	}

	public void setTime(Instant time) {
		this.time = time;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "CurrentlyForestcastResponse [time=" + time + ", temperature=" + temperature + "]";
	}
	
}