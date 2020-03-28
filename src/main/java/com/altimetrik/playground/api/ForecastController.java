package com.altimetrik.playground.api;

import java.lang.invoke.MethodHandles;
import java.time.Instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.playground.api.resource.ForecastResource;
import com.altimetrik.playground.service.ForecastService;

import io.swagger.annotations.Api;

@Api
@RestController
@RequestMapping("/forecast")
public class ForecastController {
	
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	private ForecastService service;
	
	public ForecastController(ForecastService service) {
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<ForecastResource> getForecast(@RequestParam Double latitude, @RequestParam Double longitude) {
		LOG.info("Calculating forecast for: {}, {}", latitude, longitude);
		
		ForecastResource resource = service.getForecast(latitude, longitude, Instant.now());
		
		LOG.info("Forecasts: {}", resource);
		
		return ResponseEntity.ok(resource);
	}
}
