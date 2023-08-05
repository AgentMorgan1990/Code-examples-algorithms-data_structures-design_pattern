package ru.examples.design_patterns.structural_структурные.flyweight_приспособленец.example_1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();
        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("cpp"));
        developers.add(developerFactory.getDeveloperBySpeciality("cpp"));

        developers.forEach(Developer::writeCode);
    }
}
