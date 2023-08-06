package ru.examples.design_patterns.behavioral_поведенческие.visitor_посетитель;

public interface Developer {

    void create(ProjectClass projectClass);
    void create(Database database);
    void create(UnitTest test);
}
