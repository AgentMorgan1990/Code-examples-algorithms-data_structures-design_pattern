package ru.examples.design_patterns.structural_структурные.decorator_декоратор.example_1.condiment_decorator;

import ru.examples.design_patterns.structural_структурные.decorator_декоратор.example_1.component.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double coast() {
        return beverage.coast() + 0.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Mocha";
    }
}
