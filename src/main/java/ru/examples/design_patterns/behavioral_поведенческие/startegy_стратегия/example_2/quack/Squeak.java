package ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.example_2.quack;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
