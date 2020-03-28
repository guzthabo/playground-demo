package com.altimetrik.playground.service.impl;

import java.lang.invoke.MethodHandles;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.altimetrik.playground.api.resource.ForecastResource;
import com.altimetrik.playground.assembler.ForecastResourceAssembler;
import com.altimetrik.playground.service.ForecastService;
import com.altimetrik.playground.web.client.RestClient;
import com.altimetrik.playground.web.client.response.ForecastResponse;

@Service
public class ForecastServiceImpl implements ForecastService {
	
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	private RestClient restClient;
	private ForecastResourceAssembler assembler;
	
	public ForecastServiceImpl(RestClient restClient, ForecastResourceAssembler assembler) {
		this.restClient = restClient;
		this.assembler = assembler;
	}
	
	@Override
	public ForecastResource getForecast(Double latitude, Double longitude, Instant time) {
		LocalDateTime now = LocalDateTime.ofInstant(time, ZoneId.of("UTC"));

		LOG.debug("Requesting forecast for: {}, {} with time: {}", latitude, longitude, now);
		
		Optional<ForecastResponse> currentForecast = restClient.callForecastAPI(latitude, longitude,
				time.getEpochSecond());
		
		if (!currentForecast.isPresent()) {
			
		}
		
		LOG.info("API response: {}", currentForecast.get());
		
		LocalDateTime lastYear = now.minusYears(1);
		long lastYearEpoch = lastYear.toInstant(ZoneOffset.UTC).getEpochSecond();
		LOG.debug("Requesting forecast for: {}, {} with time: {}", latitude, longitude, lastYear);
		
		Optional<ForecastResponse> lastYearForecast = restClient.callForecastAPI(latitude, longitude, lastYearEpoch);

		if (!lastYearForecast.isPresent()) {
			//throw ex
		}
		
		LOG.info("API response: {}", lastYearForecast.get());

		return assembler.toResource(currentForecast.get(), lastYearForecast.get());
	}
}