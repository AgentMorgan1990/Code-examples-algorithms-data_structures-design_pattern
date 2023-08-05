package ru.examples.design_patterns.structural_структурные.decorator_декоратор.example_2;

public class Test {
    public static void main(String[] args) {
        Developer developer = new SeniorDeveloper(new JavaDeveloper());
        System.out.println(developer.makeJob());

        Developer developer1 = new JavaTeamLead(new SeniorDeveloper(new JavaDeveloper()));
        System.out.println(developer1.makeJob());
    }
}
