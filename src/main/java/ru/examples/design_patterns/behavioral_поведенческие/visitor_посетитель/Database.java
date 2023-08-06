package ru.examples.design_patterns.behavioral_поведенческие.visitor_посетитель;

public class Database implements ProjectElement{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);

    }
}
