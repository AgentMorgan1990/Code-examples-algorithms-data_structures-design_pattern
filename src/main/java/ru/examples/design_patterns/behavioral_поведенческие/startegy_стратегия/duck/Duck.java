package ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.duck;

import ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.fly.FlyBehavior;
import ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.quack.QuackBehavior;

public abstract class Duck {
 FlyBehavior flyBehavior;
 QuackBehavior quackBehavior;

 public Duck() {
 }

 public void swim() {
  System.out.println("All Ducks float, even decoys!");
 }

 public abstract void display();

 public void performQuack() {
  quackBehavior.quack();
 }

 public void performFly() {
  flyBehavior.fly();
 }

 public void setFlyBehavior(FlyBehavior fb) {
  flyBehavior = fb;
 }

 public void setQuackBehavior(QuackBehavior qb) {
  quackBehavior = qb;
 }
}
