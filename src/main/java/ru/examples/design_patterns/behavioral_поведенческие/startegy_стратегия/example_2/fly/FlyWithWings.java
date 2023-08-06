package ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.example_2.fly;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
