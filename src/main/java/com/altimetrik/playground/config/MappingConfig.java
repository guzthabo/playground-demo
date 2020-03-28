package com.altimetrik.playground.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.altimetrik.playground.api.resource.Forecast;
import com.altimetrik.playground.web.client.response.ForecastResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Configuration
public class MappingConfig {
	
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper mapper = new ModelMapper();
		
		mapper.addMappings(new PropertyMap<ForecastResponse, Forecast>() {
			@Override
			protected void configure() {				
				map().setTemperature(source.getCurrently().getTemperature());
				map().setDate(source.getCurrently().getTime());
				map().setTime(source.getCurrently().getTime());
				map().setSunriseTime(source.getDaily().getData().getSunriseTime());
				map().setSunsetTime(source.getDaily().getData().getSunsetTime());
				map().setTemperatureHigh(source.getDaily().getData().getTemperatureHigh());
				map().setTemperatureHighTime(source.getDaily().getData().getTemperatureHighTime());
				map().setTemperatureLow(source.getDaily().getData().getTemperatureLow());
				map().setTemperatureLowTime(source.getDaily().getData().getTemperatureLowTime());
			}
		});
		
		return mapper;
	}
	
	@Bean
	public ObjectMapper objectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		
		objectMapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
		objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		objectMapper.registerModule(new JavaTimeModule());
		
		return objectMapper;
	}
}
