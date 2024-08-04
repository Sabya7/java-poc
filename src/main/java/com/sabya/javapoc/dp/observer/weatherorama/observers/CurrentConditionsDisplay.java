package com.sabya.javapoc.dp.observer.weatherorama.observers;

import com.sabya.javapoc.dp.observer.weatherorama.display.DisplayElement;
import com.sabya.javapoc.dp.observer.weatherorama.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;

    private float humidity;

    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println( "CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity + " " +
                '}');
    }

    @Override
    public void update() {
        System.out.println("I am being updated");
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        display();
    }
}
