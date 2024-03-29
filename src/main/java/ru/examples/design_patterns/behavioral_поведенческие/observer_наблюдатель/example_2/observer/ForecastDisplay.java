package ru.examples.design_patterns.behavioral_поведенческие.observer_наблюдатель.example_2.observer;

import ru.examples.design_patterns.behavioral_поведенческие.observer_наблюдатель.example_2.subject.Subject;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        if (lastPressure > currentPressure) {
            System.out.println("Pressure rising");
        }
        if (currentPressure < lastPressure) {
            System.out.println("Pressure declining");
        }
        if (currentPressure == lastPressure) {
            System.out.println("Pressure the same");
        }
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }
}
