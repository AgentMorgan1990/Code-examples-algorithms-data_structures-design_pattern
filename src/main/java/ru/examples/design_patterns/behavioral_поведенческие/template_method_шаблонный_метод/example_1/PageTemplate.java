package ru.examples.design_patterns.behavioral_поведенческие.template_method_шаблонный_метод.example_1;

public abstract class PageTemplate {
    void showPage() {
        System.out.println("Header");
        showContent();
        System.out.println("Footer");
    }

    public abstract void showContent();
}
