package com.altimetrik.playground.web.client.response;

import java.time.Instant;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DailyForestcastResponse {

	@JsonIgnore
	private DailyData data;
	
	@JsonIgnore
	private HashMap<Object, Object> json;

	@JsonCreator
	public DailyForestcastResponse(@JsonProperty("data") List<HashMap<Object, Object>> data) {
		this.json = data.get(0);
		this.data = new DailyData(json);
	}

	public HashMap<Object, Object> getJson() {
		return json;
	}

	public void setJson(HashMap<Object, Object> json) {
		this.json = json;
	}

	public DailyData getData() {
		return data;
	}

	public void setData(DailyData dailyData) {
		this.data = dailyData;
	}

	@Override
	public String toString() {
		return " [data=" + data + "]";
	}

	public class DailyData {

		private Instant sunriseTime;
		private Instant sunsetTime;
		private float temperatureHigh;
		private Instant temperatureHighTime;
		private float temperatureLow;
		private Instant temperatureLowTime;

		public DailyData(HashMap<Object, Object> json) {
			this.sunriseTime = Instant.ofEpochSecond((Integer) json.get("sunriseTime"));
			this.sunsetTime = Instant.ofEpochSecond((Integer) json.get("sunsetTime"));
			this.temperatureHigh = ((Double) json.get("temperatureHigh")).floatValue();
			this.temperatureHighTime = Instant.ofEpochSecond((Integer) json.get("temperatureHighTime"));
			this.temperatureLow = ((Double) json.get("temperatureLow")).floatValue();
			this.temperatureLowTime = Instant.ofEpochSecond((Integer) json.get("temperatureLowTime"));
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
			return "[sunriseTime=" + sunriseTime + ", sunsetTime=" + sunsetTime + ", temperatureHigh="
					+ temperatureHigh + ", temperatureHighTime=" + temperatureHighTime + ", temperatureLow="
					+ temperatureLow + ", temperatureLowTime=" + temperatureLowTime + "]";
		}
	}

}
