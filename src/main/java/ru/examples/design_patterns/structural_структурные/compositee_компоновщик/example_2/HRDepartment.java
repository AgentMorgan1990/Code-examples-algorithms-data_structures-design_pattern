package ru.examples.design_patterns.structural_структурные.compositee_компоновщик.example_2;

public class HRDepartment implements Department{

    private String name;

    public HRDepartment(String name) {
        this.name = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println("Department name is " + name);
    }
}
