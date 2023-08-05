package ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.pizza_store;

import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.ingredient_factory.ChicagoPizzaIngredientFactory;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.ingredient_factory.PizzaIngredientFactory;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.pizza.CheesePizza;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.pizza.ClamPizza;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();


        if (item.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
//        else if (item.equals("veggie")) {
//            pizza = new VeggiePizza(pizzaIngredientFactory);
//            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        return pizza;
    }
}

