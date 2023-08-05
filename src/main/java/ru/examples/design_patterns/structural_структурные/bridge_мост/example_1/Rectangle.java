package ru.examples.design_patterns.structural_структурные.bridge_мост.example_1;

public class Rectangle extends Shape{
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing rectangle ...");
        color.fillColor();
    }
}
