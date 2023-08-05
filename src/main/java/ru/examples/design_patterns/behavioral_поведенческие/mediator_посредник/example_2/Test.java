package ru.examples.design_patterns.behavioral_поведенческие.mediator_посредник.example_2;

public class Test {
    public static void main(String[] args) {


        Button button = new Button();
        PowerSupplier powerSupplier = new PowerSupplier();
        Fan fan = new Fan();
        Mediator mediator = new Mediator(button, fan, powerSupplier);
        fan.setMediator(mediator);
        button.setMediator(mediator);

        System.out.println(fan.isOn());
        button.press();
        System.out.println(fan.isOn());
        button.press();
        System.out.println(fan.isOn());
    }
}
