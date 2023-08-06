package ru.examples.design_patterns.behavioral_поведенческие.observer_наблюдатель.example_2;

import ru.examples.design_patterns.behavioral_поведенческие.observer_наблюдатель.example_2.observer.CurrentConditionsDisplay;
import ru.examples.design_patterns.behavioral_поведенческие.observer_наблюдатель.example_2.observer.ForecastDisplay;
import ru.examples.design_patterns.behavioral_поведенческие.observer_наблюдатель.example_2.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurement(80,65,30.4f);
        weatherData.setMeasurement(82,70,29.2f);
        weatherData.setMeasurement(78,90,29.2f);

    }
}
