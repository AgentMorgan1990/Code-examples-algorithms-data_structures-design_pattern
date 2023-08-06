package ru.examples.design_patterns.behavioral_поведенческие.state_состояние.example_1;

public class JavaDeveloper {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if (activity instanceof Coding){
            activity = new Reading();
        } else if (activity instanceof Reading){
            activity = new Training();
        } else if (activity instanceof Training){
            activity = new Coding();
        }
    }

    public void justDoIt(){
        activity.justDoIt();
    }
}
