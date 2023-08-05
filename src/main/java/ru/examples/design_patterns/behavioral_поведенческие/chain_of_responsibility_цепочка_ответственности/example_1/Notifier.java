package ru.examples.design_patterns.behavioral_поведенческие.chain_of_responsibility_цепочка_ответственности.example_1;

public abstract class Notifier {

    private Notifier nextNotifier;
    private int priority;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyManager(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (nextNotifier!=null) {
            nextNotifier.notifyManager(message, level);
        }
    }

    public abstract void write(String message);


}
