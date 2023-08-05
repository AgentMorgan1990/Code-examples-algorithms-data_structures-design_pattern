package ru.examples.design_patterns.behavioral_поведенческие.mediator_посредник.example_2;

public class Button {
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        mediator.press();
    }
}
