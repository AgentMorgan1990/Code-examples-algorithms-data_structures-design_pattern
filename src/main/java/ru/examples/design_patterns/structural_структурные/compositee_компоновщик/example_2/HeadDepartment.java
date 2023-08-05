package ru.examples.design_patterns.structural_структурные.compositee_компоновщик.example_2;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {

    private String name;
    private List<Department> departments;

    public HeadDepartment(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    @Override
    public void printDepartmentName() {
        System.out.println("Child departments is:");
        departments.forEach(Department::printDepartmentName);
    }
}
