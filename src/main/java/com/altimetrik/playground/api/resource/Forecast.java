package com.altimetrik.playground.api.resource;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Forecast {
	
	private LocalDate date;
	private LocalDateTime time;
	private int temperature;
	private Instant sunriseTime;
	private Instant sunsetTime;
	private int temperatureHigh;
	private Instant temperatureHighTime;
	private int temperatureLow;
	private Instant temperatureLowTime;
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public LocalDateTime getTime() {
		return time;
	}
	
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
	public int getTemperature() {
		return temperature;
	}
	
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	public Instant getSunriseTime() {
		return sunriseTime;
	}
	
	public void setSunriseTime(Instant sunriseTime) {
		this.sunriseTime = sunriseTime;
	}
	
	public Instant getSunsetTime() {
		return sunsetTime;
	}
	
	public void setSunsetTime(Instant sunsetTime) {
		this.sunsetTime = sunsetTime;
	}
	
	public int getTemperatureHigh() {
		return temperatureHigh;
	}
	
	public void setTemperatureHigh(int temperatureHigh) {
		this.temperatureHigh = temperatureHigh;
	}
	
	public Instant getTemperatureHighTime() {
		return temperatureHighTime;
	}
	
	public void setTemperatureHighTime(Instant temperatureHighTime) {
		this.temperatureHighTime = temperatureHighTime;
	}
	
	public int getTemperatureLow() {
		return temperatureLow;
	}
	
	public void setTemperatureLow(int temperatureLow) {
		this.temperatureLow = temperatureLow;
	}
	
	public Instant getTemperatureLowTime() {
		return temperatureLowTime;
	}
	
	public void setTemperatureLowTime(Instant temperatureLowTime) {
		this.temperatureLowTime = temperatureLowTime;
	}
	
	@Override
	public String toString() {
		return "Forecast [date=" + date + ", time=" + time + ", temperature=" + temperature + ", sunriseTime="
				+ sunriseTime + ", sunsetTime=" + sunsetTime + ", temperatureHigh=" + temperatureHigh
				+ ", temperatureHighTime=" + temperatureHighTime + ", temperatureLow=" + temperatureLow
				+ ", temperatureLowTime=" + temperatureLowTime + "]";
	}
}
