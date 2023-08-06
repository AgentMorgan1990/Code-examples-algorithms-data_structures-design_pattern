package ru.examples.design_patterns.behavioral_поведенческие.observer_наблюдатель.example_1;

import java.util.List;

public interface Observer {

    void handleEvent(List<String> vacancies);
}
