package ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.example_2.duck;

import ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.example_2.fly.FlyWithWings;
import ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.example_2.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I'm real Mallard duck");
    }
}
