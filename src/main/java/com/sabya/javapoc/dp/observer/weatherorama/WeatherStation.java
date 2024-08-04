package com.sabya.javapoc.dp.observer.weatherorama;

import com.sabya.javapoc.dp.observer.weatherorama.observers.CurrentConditionsDisplay;
import com.sabya.javapoc.dp.observer.weatherorama.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(15, 21.4f, 30);
    }
}
