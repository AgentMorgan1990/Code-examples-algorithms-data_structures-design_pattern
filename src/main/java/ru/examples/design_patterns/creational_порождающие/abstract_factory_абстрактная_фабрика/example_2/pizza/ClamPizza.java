package ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.pizza;

import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.ingredient_factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.pizzaIngredientFactory =ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing "+ name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClam();
    }
}
