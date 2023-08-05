package ru.examples.design_patterns.behavioral_поведенческие.command_команда.example_2;

public class Stereo {
    private int volume;

    public Stereo() {
    }

    public void on() {
        System.out.println("ЖЖЖЖ....");
    }

    public void setCD() {
        System.out.println("Диск, так диск");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void off(){
        System.out.println("Решил поспать?");
    }
}
