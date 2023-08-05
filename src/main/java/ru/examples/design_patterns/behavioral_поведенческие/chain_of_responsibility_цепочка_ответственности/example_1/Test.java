package ru.examples.design_patterns.behavioral_поведенческие.chain_of_responsibility_цепочка_ответственности.example_1;

public class Test {
    public static void main(String[] args) {
        Notifier notifier1 = new SimpleReportNotifier(1);
        Notifier notifier2 = new EmailNotifier(2);
        Notifier notifier3 = new SMSNotifier(3);

        notifier1.setNextNotifier(notifier2);
        notifier2.setNextNotifier(notifier3);

        notifier1.notifyManager("Not problem",Priority.ROUTINE);
        notifier1.notifyManager("We have little problem", Priority.IMPORTANT);
        notifier1.notifyManager("AAAAA !!!!",Priority.ASAP);
    }
}
