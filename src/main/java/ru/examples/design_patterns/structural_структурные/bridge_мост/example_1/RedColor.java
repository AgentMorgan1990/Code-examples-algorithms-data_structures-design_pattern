package ru.examples.design_patterns.structural_структурные.bridge_мост.example_1;

public class RedColor implements Color{
    @Override
    public void fillColor() {
        System.out.println("Filling red ...");
    }
}
