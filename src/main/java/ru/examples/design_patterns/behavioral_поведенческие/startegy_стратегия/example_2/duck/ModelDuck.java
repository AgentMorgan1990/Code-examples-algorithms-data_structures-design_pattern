package ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.example_2.duck;

import ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.example_2.fly.FlyingNoWay;
import ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.example_2.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyingNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
