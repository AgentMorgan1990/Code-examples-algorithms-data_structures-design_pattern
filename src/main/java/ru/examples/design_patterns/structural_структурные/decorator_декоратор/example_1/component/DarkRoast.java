package ru.examples.design_patterns.structural_структурные.decorator_декоратор.example_1.component;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double coast() {
        return 0.74;
    }
}
