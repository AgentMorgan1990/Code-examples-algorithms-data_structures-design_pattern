package ru.examples.design_patterns.structural_структурные.facade_фасад.example_1;

public class Developer {

    public void working(SprintTracker tracker) {
        if (tracker.isActive()) {
            System.out.println("Developer write code");
        } else {
            System.out.println("Developer play computer game");
        }
    }
}
