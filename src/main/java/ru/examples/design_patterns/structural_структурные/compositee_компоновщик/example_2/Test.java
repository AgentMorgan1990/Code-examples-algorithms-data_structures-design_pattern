package ru.examples.design_patterns.structural_структурные.compositee_компоновщик.example_2;

public class Test {
    public static void main(String[] args) {
        Department department1 = new SalesDepartment("Sales");
        Department department2 = new HRDepartment("HR");
        HeadDepartment department3 = new HeadDepartment("Head");
        department3.addDepartment(department1);
        department3.addDepartment(department2);

        department1.printDepartmentName();
        department2.printDepartmentName();
        department3.printDepartmentName();
    }
}
