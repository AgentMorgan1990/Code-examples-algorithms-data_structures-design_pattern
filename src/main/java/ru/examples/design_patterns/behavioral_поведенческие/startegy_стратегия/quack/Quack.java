package ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.quack;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
