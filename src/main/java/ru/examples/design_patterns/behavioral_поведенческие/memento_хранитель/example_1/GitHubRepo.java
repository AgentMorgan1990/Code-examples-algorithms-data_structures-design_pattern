package ru.examples.design_patterns.behavioral_поведенческие.memento_хранитель.example_1;

public class GitHubRepo {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
