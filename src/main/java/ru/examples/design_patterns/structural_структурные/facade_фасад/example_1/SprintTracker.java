package ru.examples.design_patterns.structural_структурные.facade_фасад.example_1;

public class SprintTracker {

    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void startSprint(){
        active = true;
        System.out.println("Sprint in progress ...");
    }

    public void finishSprint(){
        active = false;
        System.out.println("Sprint finished");
    }
}
