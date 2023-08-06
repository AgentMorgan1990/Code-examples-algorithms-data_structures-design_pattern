package ru.examples.design_patterns.behavioral_поведенческие.observer_наблюдатель.example_1;


public interface Observed {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
