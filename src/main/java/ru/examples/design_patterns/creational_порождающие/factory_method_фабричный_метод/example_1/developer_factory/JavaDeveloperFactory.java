package ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer_factory;

import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer.Developer;
import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
