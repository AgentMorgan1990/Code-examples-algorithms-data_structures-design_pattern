package ru.examples.design_patterns.behavioral_поведенческие.command_команда.example_1;

public class SelectCommand implements Command {
    DataBase dataBase;

    public SelectCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.select();
    }
}
