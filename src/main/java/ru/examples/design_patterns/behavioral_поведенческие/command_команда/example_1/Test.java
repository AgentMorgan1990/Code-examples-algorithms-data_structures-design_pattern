package ru.examples.design_patterns.behavioral_поведенческие.command_команда.example_1;

public class Test {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Developer developer = new Developer(
                new InsertCommand(dataBase),
                new UpdateCommand(dataBase),
                new SelectCommand(dataBase),
                new DeleteCommand(dataBase)

        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.updateRecord();
    }
}
