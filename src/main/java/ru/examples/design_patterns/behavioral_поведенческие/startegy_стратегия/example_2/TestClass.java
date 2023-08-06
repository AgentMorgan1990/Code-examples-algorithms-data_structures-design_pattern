package ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.example_2;

import ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.example_2.duck.Duck;
import ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.example_2.duck.MallardDuck;
import ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.example_2.duck.ModelDuck;
import ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.example_2.fly.FlyRocketPowered;

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
