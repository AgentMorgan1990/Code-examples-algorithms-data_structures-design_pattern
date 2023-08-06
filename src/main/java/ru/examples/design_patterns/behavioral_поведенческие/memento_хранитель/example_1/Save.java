package ru.examples.design_patterns.behavioral_поведенческие.memento_хранитель.example_1;

import java.time.LocalDateTime;

public class Save {
    private final String version;
    private final LocalDateTime dateTime;

    public Save(String version) {
        this.version = version;
        this.dateTime = LocalDateTime.now();
    }

    public String getVersion() {
        return version;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

}
