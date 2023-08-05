package ru.examples.design_patterns.structural_структурные.decorator_декоратор.example_1.component;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double coast() {
        return 1.99;
    }
}
