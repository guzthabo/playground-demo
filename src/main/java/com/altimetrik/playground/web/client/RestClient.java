package com.altimetrik.playground.web.client;

import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.altimetrik.playground.web.client.response.ForecastResponse;

@Component
public class RestClient {
	
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	@Value("${api.url}")
	private String apiURL;
	
	@Value("${api.key}")
	private String apiKey;
	
	private RestTemplate template;	
	public RestClient(RestTemplate template) {
		this.template = template;
	}
	
	public Optional<ForecastResponse> callForecastAPI(Double latitude, Double longitude, Long time) {
		StringBuilder uri = new StringBuilder(String.format(apiURL, apiKey));
		uri.append(latitude)
			.append(",")
			.append(latitude)
			.append(",")
			.append(time);
		
		URI url = UriComponentsBuilder.fromUriString(uri.toString())
				.queryParam("exclude", "minutely", "hourly", "flags") //remove unnecessary data from response
				.build()
				.toUri();
		
		LOG.debug("Calling {}", url.toString());
		
		try {
			ForecastResponse response = template.getForEntity(url, ForecastResponse.class).getBody();

			return Optional.of(response);
			
		} catch (Exception e) {
			LOG.error("Error while trying to request: {} -> {}", url.toString(), e.getMessage());
			
			return Optional.empty();
		}
		
	}
}
