package ru.examples.design_patterns.behavioral_поведенческие.visitor_посетитель;

public class Project implements ProjectElement{
    ProjectElement[] projectElement;

    public Project() {
        this.projectElement = new ProjectElement[]{
                new UnitTest(),
                new ProjectClass(),
                new Database()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement element:projectElement) {
            element.beWritten(developer);
        }
    }
}
