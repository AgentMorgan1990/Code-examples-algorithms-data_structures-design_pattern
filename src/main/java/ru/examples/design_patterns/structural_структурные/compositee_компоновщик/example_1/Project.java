package ru.examples.design_patterns.structural_структурные.compositee_компоновщик.example_1;

public class Project {
    public static void main(String[] args) {
        Developer firstJavaDeveloper = new JavaDeveoper();
        Developer secondJavaDeveloper = new JavaDeveoper();
        Developer firstCppDeveloper = new CppDeveloper();

        Team team = new Team();
        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(firstCppDeveloper);

        team.createProject();
    }
}
