package ru.examples.design_patterns.behavioral_поведенческие.observer_наблюдатель.subject;

import ru.examples.design_patterns.behavioral_поведенческие.observer_наблюдатель.observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();

    public float getTemperature();

    public float getHumidity();

    public float getPressure();

}
