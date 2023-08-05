package ru.examples.design_patterns.structural_структурные.flyweight_приспособленец.example_1;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality) {
        Developer developer = developers.get(speciality);

        if (developer == null) {
            switch (speciality) {
                case "java" -> {
                    System.out.println("Hiring java developers");
                    developer = new JavaDeveloper();

                }
                case "cpp" -> {
                    System.out.println("Hiring c++ developers");
                    developer = new CppDeveloper();
                }
            }
            developers.put(speciality, developer);
        }
        return developer;
    }
}
