package ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.duck;

import ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.fly.FlyingNoWay;
import ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.quack.Quack;

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
