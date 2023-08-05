package ru.examples.design_patterns.structural_структурные.compositee_компоновщик.example_1;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void removeDeveloper(Developer developer){
        developers.remove(developer);
    }
    public void createProject(){
        System.out.println("Team create project");
        developers.forEach(Developer::writeCode);
    }
}
