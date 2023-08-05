package ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1;

import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer.Developer;
import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer_factory.CppDeveloperFactory;
import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer_factory.DeveloperFactory;
import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer_factory.JavaDeveloperFactory;
import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer_factory.PHPDeveloperFactory;

public class Program {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality("PHP");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();

    }

    static DeveloperFactory createDeveloperFactoryBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")) {
            return new PHPDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " not supported speciality");
        }
    }
}
