package ru.examples.design_patterns.structural_структурные.decorator_декоратор.example_1.component;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double coast() {
        return 0.89;
    }
}
