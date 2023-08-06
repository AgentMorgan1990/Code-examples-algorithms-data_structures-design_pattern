package ru.examples.design_patterns.behavioral_поведенческие.visitor_посетитель;

public class Test {
    public static void main(String[] args) {
        Project project = new Project();
        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();
        project.beWritten(junior);
        project.beWritten(senior);
    }
}
