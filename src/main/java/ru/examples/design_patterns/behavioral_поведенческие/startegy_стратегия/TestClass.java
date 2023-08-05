package ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия;

import ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.duck.Duck;
import ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.duck.MallardDuck;
import ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.duck.ModelDuck;
import ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.fly.FlyRocketPowered;

public class TestClass {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("<<<>>>");

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
