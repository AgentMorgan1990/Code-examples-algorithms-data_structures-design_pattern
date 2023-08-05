package ru.examples.design_patterns.structural_структурные.decorator_декоратор.example_2;

public class DeveloperDecorator implements Developer{

    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
      return developer.makeJob();
    }
}
