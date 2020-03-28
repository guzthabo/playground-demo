package com.altimetrik.playground.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.altimetrik.playground.api.resource.Forecast;
import com.altimetrik.playground.api.resource.ForecastResource;
import com.altimetrik.playground.web.client.response.ForecastResponse;

@Component
public class ForecastResourceAssembler {
	
	private ModelMapper modelMapper;
	
	public ForecastResourceAssembler(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	public ForecastResource toResource(ForecastResponse current, ForecastResponse lastYear) {
		Forecast currentForecast = modelMapper.map(current, Forecast.class);
		Forecast lastYearForecast = modelMapper.map(lastYear, Forecast.class);

		return new ForecastResource(currentForecast, lastYearForecast);
	}
}
