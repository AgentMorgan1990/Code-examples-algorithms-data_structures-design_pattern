package ru.examples.design_patterns.structural_структурные.bridge_мост.example_1;

public class Test {
    public static void main(String[] args) {
        Shape blueRectangle = new Rectangle(new BlueColor());
        blueRectangle.draw();

        Shape redTriangle = new Triangle(new RedColor());
        redTriangle.draw();
    }
}
