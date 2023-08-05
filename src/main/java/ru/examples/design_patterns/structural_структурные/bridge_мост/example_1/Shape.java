package ru.examples.design_patterns.structural_структурные.bridge_мост.example_1;

public abstract class Shape {


    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();


}
