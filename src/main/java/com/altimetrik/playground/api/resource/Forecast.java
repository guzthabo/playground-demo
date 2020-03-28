package com.altimetrik.playground.api.resource;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;

public class Forecast {
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "UTC")
	@ApiModelProperty(example = "2020-03-28")
	private Instant date;
	
	@JsonFormat(pattern = "HH:mm:ss", timezone = "UTC")
	@ApiModelProperty(example = "21:01:04")
	private Instant time;
	
	private float temperature;
	private Instant sunriseTime;
	private Instant sunsetTime;
	private float temperatureHigh;
	private Instant temperatureHighTime;
	private float temperatureLow;
	private Instant temperatureLowTime;
	
	public Instant getDate() {
		return date;
	}
	
	public void setDate(Instant date) {
		this.date = date;
	}
	
	public Instant getTime() {
		return time;
	}
	
	public void setTime(Instant time) {
		this.time = time;
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public void setTemperature(float temperature) {
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
	
	public float getTemperatureHigh() {
		return temperatureHigh;
	}
	
	public void setTemperatureHigh(float temperatureHigh) {
		this.temperatureHigh = temperatureHigh;
	}
	
	public Instant getTemperatureHighTime() {
		return temperatureHighTime;
	}
	
	public void setTemperatureHighTime(Instant temperatureHighTime) {
		this.temperatureHighTime = temperatureHighTime;
	}
	
	public float getTemperatureLow() {
		return temperatureLow;
	}
	
	public void setTemperatureLow(float temperatureLow) {
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
