package ru.examples.design_patterns.behavioral_поведенческие.template_method_шаблонный_метод.example_1;

public class NewsPage extends PageTemplate {
    @Override
    public void showContent() {
        System.out.println("News");
    }
}
