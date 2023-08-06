package ru.examples.design_patterns.behavioral_поведенческие.visitor_посетитель;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Write clear code ...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Up db");
    }

    @Override
    public void create(UnitTest test) {
        System.out.println("Write perfect test");
    }
}
