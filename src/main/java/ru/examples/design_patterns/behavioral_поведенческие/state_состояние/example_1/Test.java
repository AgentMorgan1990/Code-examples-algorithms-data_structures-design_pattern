package ru.examples.design_patterns.behavioral_поведенческие.state_состояние.example_1;

public class Test {
    public static void main(String[] args) {
        JavaDeveloper developer = new JavaDeveloper();
        Activity coding = new Coding();
        developer.setActivity(coding);

        for (int i = 0; i < 15; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
