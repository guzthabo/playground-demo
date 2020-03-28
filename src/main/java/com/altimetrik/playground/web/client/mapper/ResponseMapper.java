package com.altimetrik.playground.web.client.mapper;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.altimetrik.playground.web.client.response.CurrentlyForestcastResponse;
import com.altimetrik.playground.web.client.response.ForecastResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ResponseMapper {
	
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	private ObjectMapper mapper;
	
	public ResponseMapper(ObjectMapper mapper) {
		this.mapper = mapper;
	}
	
	public ForecastResponse buildFromResponse(String response) {
		CurrentlyForestcastResponse currentlyResponse = new CurrentlyForestcastResponse();
		
//		try {
//			JsonNode json = mapper.readTree(response);
//			
//			JsonNode latitude = json.get("latitude");
//			JsonNode longitude = json.get("longitude");
//			JsonNode currently = json.get("currently");
//			JsonNode daily = json.get("daily.data");
//			
//			LOG.debug("{}", latitude.textValue());
//			LOG.debug("{}", longitude.textValue());
//			LOG.debug("{}", currently.textValue());
//			LOG.debug("{}", daily.textValue());
//		} catch (JsonMappingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		return new ForecastResponse();
	}
}
