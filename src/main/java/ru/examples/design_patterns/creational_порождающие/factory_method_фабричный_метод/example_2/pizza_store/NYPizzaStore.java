package ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_2.pizza_store;

import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_2.pizza.NYStyleCheesePizza;
import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_2.pizza.Pizza;

public class NYPizzaStore extends PizzaStore{

    //конкретный фабричный метод
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")){
            return new NYStyleCheesePizza();
//        } else if (item.equals("veggie")) {
//            return new NYStyleVeggiePizza();
//        } else if (item.equals("clam")) {
//            return new NYStyleClamPizza();
//        } else if (item.equals("peperoni")) {
//            return new NYStylePepperoniPizza();
        } else return null;
    }
}
