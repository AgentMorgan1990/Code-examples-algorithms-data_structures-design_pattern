package ru.examples.design_patterns.structural_структурные.adapter_адаптер;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();
        database.insert();
        database.select();
        database.update();
        database.remove();
    }
}
