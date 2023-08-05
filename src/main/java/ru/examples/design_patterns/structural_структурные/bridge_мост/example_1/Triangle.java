package ru.examples.design_patterns.structural_структурные.bridge_мост.example_1;

public class Triangle extends Shape{


    public Triangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing triangle ...");
        color.fillColor();
    }
}
