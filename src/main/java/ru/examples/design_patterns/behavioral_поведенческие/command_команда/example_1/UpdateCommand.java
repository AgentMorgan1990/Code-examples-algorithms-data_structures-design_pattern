package ru.examples.design_patterns.behavioral_поведенческие.command_команда.example_1;

public class UpdateCommand implements Command {
    DataBase dataBase;

    public UpdateCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.update();
    }
}
