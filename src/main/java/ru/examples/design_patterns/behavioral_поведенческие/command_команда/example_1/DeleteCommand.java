package ru.examples.design_patterns.behavioral_поведенческие.command_команда.example_1;

public class DeleteCommand implements Command {
    DataBase dataBase;

    public DeleteCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.delete();
    }
}
