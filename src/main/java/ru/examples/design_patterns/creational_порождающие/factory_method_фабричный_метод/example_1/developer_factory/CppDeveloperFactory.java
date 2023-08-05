package ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer_factory;

import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer.CppDeveloper;
import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer.Developer;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
