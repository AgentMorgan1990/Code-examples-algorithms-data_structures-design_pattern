package ru.examples.design_patterns.behavioral_поведенческие.chain_of_responsibility_цепочка_ответственности.example_1;


public class SimpleReportNotifier extends Notifier {
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Say to manager: "+ message);
    }
}
