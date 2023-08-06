package ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.example_1;


public class Test {
    public static void main(String[] args) {
        JavaDeveloper developer = new JavaDeveloper();
        developer.setActivity(new Training());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Sleeping());
        developer.executeActivity();
    }
}
