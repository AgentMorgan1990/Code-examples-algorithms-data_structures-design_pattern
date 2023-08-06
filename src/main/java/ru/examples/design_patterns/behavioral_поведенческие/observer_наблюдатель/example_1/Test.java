package ru.examples.design_patterns.behavioral_поведенческие.observer_наблюдатель.example_1;

public class Test {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("Java Junior");
        jobSite.addVacancy("Java June");

        jobSite.addObserver(new Subscriber("Вася"));
        jobSite.addObserver(new Subscriber("Петя"));

        jobSite.addVacancy("Java meddle");
    }
}
