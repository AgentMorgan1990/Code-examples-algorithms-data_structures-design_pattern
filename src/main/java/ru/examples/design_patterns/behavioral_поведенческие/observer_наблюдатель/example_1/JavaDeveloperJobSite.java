package ru.examples.design_patterns.behavioral_поведенческие.observer_наблюдатель.example_1;


import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed {


    private List<String> vacancies = new ArrayList<>();
    private List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy) {
        vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        subscribers.forEach((subscriber) -> subscriber.handleEvent(this.vacancies));
    }
}
