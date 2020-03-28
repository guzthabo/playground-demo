package com.altimetrik.playground.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.altimetrik.playground.api.resource.Forecast;
import com.altimetrik.playground.api.resource.ForecastResource;
import com.altimetrik.playground.web.client.response.ForecastResponse;

@Component
public class ForecastResourceAssembler {
	
	private ModelMapper mapper;
	
	public ForecastResourceAssembler(ModelMapper mapper) {
		this.mapper = mapper;
	}
	
	public ForecastResource toResource(ForecastResponse current, ForecastResponse lastYear) {
		Forecast currentForecast = mapper.map(current, Forecast.class);
		Forecast lastYearForecast = mapper.map(lastYear, Forecast.class);

		return new ForecastResource(currentForecast, lastYearForecast);
	}
}
