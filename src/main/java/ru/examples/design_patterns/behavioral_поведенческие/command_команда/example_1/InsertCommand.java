package ru.examples.design_patterns.behavioral_поведенческие.command_команда.example_1;

public class InsertCommand implements Command {

    DataBase dataBase;

    public InsertCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.insert();
    }
}
