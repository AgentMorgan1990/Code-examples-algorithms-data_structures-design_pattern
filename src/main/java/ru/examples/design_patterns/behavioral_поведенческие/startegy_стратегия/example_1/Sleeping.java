package ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.example_1;

public class Sleeping implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Sleeping ...");
    }
}
