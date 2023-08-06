package ru.examples.design_patterns.behavioral_поведенческие.visitor_посетитель;

public class JuniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Write poor code...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Drop db ...");
    }

    @Override
    public void create(UnitTest test) {
        System.out.println("Write poor test ...");
    }
}
