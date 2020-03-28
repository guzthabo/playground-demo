package com.altimetrik.playground.service;

import java.time.Instant;

import com.altimetrik.playground.api.resource.ForecastResource;

public interface ForecastService {
	
	public ForecastResource getForecast(Double latitude, Double longitude, Instant time);
	
}
