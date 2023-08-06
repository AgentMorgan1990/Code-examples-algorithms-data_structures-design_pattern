package ru.examples.design_patterns.behavioral_поведенческие.template_method_шаблонный_метод.example_1;

public class Test {
    public static void main(String[] args) {
        PageTemplate welcomePage = new WelcomePage();
        PageTemplate newsPage = new NewsPage();
        welcomePage.showPage();
        newsPage.showPage();
    }
}
