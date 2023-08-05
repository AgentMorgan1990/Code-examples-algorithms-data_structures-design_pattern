package ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.ingredient_factory;

import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.ingredient_factory.cheese.Cheese;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.ingredient_factory.clams.Clams;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.ingredient_factory.dough.Dough;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.ingredient_factory.peperoni.Pepperoni;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.ingredient_factory.sauce.Sauce;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_2.ingredient_factory.veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}
