package com.altimetrik.playground.web.client.response;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DailyForestcastResponse {

	private DailyData data;

	public DailyData getData() {
		return data;
	}

	public void setData(DailyData data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "DailyForestcastResponse [data=" + data + "]";
	}
	
	public class DailyData {
		List<String> object;
		
		private Instant sunriseTime;
		private Instant sunsetTime;
		private int temperatureHigh;
		private Instant temperatureHighTime;
		private int temperatureLow;
		private Instant temperatureLowTime;

		public List<String> getObject() {
			return object;
		}

		public void setObject(List<String> object) {
			this.object = object;
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
			return "DailyData [object=" + object + ", sunriseTime=" + sunriseTime + ", sunsetTime=" + sunsetTime
					+ ", temperatureHigh=" + temperatureHigh + ", temperatureHighTime=" + temperatureHighTime
					+ ", temperatureLow=" + temperatureLow + ", temperatureLowTime=" + temperatureLowTime + "]";
		}
	}

}
