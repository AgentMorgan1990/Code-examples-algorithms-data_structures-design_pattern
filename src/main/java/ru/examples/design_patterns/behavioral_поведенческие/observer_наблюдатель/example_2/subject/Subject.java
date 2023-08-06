package ru.examples.design_patterns.behavioral_поведенческие.observer_наблюдатель.example_2.subject;

import ru.examples.design_patterns.behavioral_поведенческие.observer_наблюдатель.example_2.observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();

    public float getTemperature();

    public float getHumidity();

    public float getPressure();

}
