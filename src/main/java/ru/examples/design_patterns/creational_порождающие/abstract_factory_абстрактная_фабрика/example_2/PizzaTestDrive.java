package ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2;

import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.pizza.Pizza;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.pizza_store.ChicagoPizzaStore;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.pizza_store.NYPizzaStore;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.pizza_store.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }
}
