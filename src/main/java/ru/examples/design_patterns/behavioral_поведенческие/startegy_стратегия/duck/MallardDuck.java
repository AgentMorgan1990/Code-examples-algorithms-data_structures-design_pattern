package ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.duck;

import ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.fly.FlyWithWings;
import ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.quack.Quack;

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
