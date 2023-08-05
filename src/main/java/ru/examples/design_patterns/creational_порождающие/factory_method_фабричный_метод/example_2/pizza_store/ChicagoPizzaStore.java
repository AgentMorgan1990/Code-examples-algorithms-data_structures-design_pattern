package ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_2.pizza_store;

import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_2.pizza.ChicagoStyleCheesePizza;
import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_2.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    //конкретный фабричный метод
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
//        } else if (item.equals("veggie")) {
//            return new ChicagoStyleVeggiePizza();
//        } else if (item.equals("clam")) {
//            return new ChicagoStyleClamPizza();
//        } else if (item.equals("peperoni")) {
//            return new ChicagoStylePeperoniPizza();
        } else return null;
    }
}

