package ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_2.pizza_store;

import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_2.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    //Абстрактный фабричный метод
    protected abstract Pizza createPizza(String type);
}
