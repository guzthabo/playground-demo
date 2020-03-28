package com.altimetrik.playground.api.resource;

public class ForecastResource {
	
	private Forecast currentForecast;
	private Forecast lastYearForecast;
	
	public ForecastResource() {
	}
	
	public ForecastResource(Forecast currentForecast, Forecast lastYearForecast) {
		this.currentForecast = currentForecast;
		this.lastYearForecast = lastYearForecast;
	}

	public Forecast getCurrentForecast() {
		return currentForecast;
	}
	
	public void setCurrentForecast(Forecast currentForecast) {
		this.currentForecast = currentForecast;
	}
	
	public Forecast getLastYearForecast() {
		return lastYearForecast;
	}
	
	public void setLastYearForecast(Forecast lastYearForecast) {
		this.lastYearForecast = lastYearForecast;
	}
	
	@Override
	public String toString() {
		return "ForecastResource [currentForecast=" + currentForecast + ", lastYearForecast=" + lastYearForecast + "]";
	}
}
