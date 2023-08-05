package ru.examples.design_patterns.structural_структурные.decorator_декоратор.example_2;

public class SeniorDeveloper extends DeveloperDecorator{

    private String makeReview(){
        return "Make review ...";
    }

    public SeniorDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeReview();
    }
}
