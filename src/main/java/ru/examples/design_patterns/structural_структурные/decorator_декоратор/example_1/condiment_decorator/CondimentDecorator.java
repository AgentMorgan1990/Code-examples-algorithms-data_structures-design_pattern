package ru.examples.design_patterns.structural_структурные.decorator_декоратор.example_1.condiment_decorator;

import ru.examples.design_patterns.structural_структурные.decorator_декоратор.example_1.component.Beverage;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public abstract String getDescription();

}
