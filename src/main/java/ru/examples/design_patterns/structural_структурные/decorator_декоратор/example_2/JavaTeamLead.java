package ru.examples.design_patterns.structural_структурные.decorator_декоратор.example_2;

public class JavaTeamLead extends DeveloperDecorator{


    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    private String writeWeekReport(){
        return "Write week report ... ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + writeWeekReport();
    }
}
