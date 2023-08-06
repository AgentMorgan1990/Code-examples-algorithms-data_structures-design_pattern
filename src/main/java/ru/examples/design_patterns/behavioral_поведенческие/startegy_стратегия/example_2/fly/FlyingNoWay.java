package ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.example_2.fly;

public class FlyingNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
