package ru.examples.design_patterns.behavioral_поведенческие.observer_наблюдатель.example_1;

import java.util.List;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + " we have changes in vacancies: " + vacancies + "\n================\n ");
    }
}
