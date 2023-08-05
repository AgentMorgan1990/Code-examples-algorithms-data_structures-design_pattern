package ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer_factory;

import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer.Developer;
import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer.PHPDeveloper;

public class PHPDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PHPDeveloper();
    }
}
