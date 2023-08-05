package ru.examples.design_patterns.behavioral_поведенческие.command_команда.example_2;

public class Light {
    String roomName;

    public Light(String roomName) {
        this.roomName = roomName;
    }

    public void on() {
        System.out.println("Light is on in " + roomName);
    }

    public void off() {
        System.out.println("Light is off in " + roomName);
    }
}



