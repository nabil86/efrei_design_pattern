package com.efrei.dp.observer;

public class WeatherData {

	private float temperature;
	private float humidity;
	private float pressure;

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void measurementsChanged() {
		final var temperature = getTemperature();
		final var humidity = getHumidity();
		final var pressure = getPressure();

		// TODO add your display devices here
	}

}
