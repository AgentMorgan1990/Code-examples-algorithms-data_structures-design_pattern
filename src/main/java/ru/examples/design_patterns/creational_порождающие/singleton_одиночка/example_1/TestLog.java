package ru.examples.design_patterns.creational_порождающие.singleton_одиночка.example_1;

public class TestLog {
    public static void main(String[] args) {
        ProgramLogger programLogger = ProgramLogger.getProgramLogger();
        programLogger.addLogInfo("First log ....");
        programLogger.addLogInfo("Second log ...");
        programLogger.showLogFile();
    }
}
