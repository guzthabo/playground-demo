package com.altimetrik.playground.web.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastResponse {
	
	private double latitude;
	private double longitude;
	private CurrentlyForestcastResponse currently;
	private DailyForestcastResponse daily;
	
	public double getLatitude() {
		return latitude;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public CurrentlyForestcastResponse getCurrently() {
		return currently;
	}

	public void setCurrently(CurrentlyForestcastResponse currently) {
		this.currently = currently;
	}

	public DailyForestcastResponse getDaily() {
		return daily;
	}

	public void setDaily(DailyForestcastResponse daily) {
		this.daily = daily;
	}
	
	@Override
	public String toString() {
		return "[latitude=" + latitude + ", longitude=" + longitude + ", currently=" + currently
				+ ", daily=" + daily + "]";
	}
	
}
