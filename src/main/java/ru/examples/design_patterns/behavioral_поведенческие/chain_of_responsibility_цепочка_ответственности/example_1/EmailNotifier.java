package ru.examples.design_patterns.behavioral_поведенческие.chain_of_responsibility_цепочка_ответственности.example_1;

public class EmailNotifier extends Notifier{

    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Write to email: "+ message);
    }
}
