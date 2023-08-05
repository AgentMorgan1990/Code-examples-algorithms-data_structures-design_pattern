package ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.pizza_store;

import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
