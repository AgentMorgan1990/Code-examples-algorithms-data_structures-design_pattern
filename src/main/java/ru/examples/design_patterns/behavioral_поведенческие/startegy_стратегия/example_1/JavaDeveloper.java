package ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.example_1;

public class JavaDeveloper {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    void executeActivity(){
        activity.justDoIt();
    }
}
