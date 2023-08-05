package ru.examples.design_patterns.creational_порождающие.singleton_одиночка.example_1;

public class ProgramLogger {

    private static ProgramLogger programLogger;
    private static String lofFile = "This is log file. \n\n";

    public static synchronized ProgramLogger getProgramLogger(){
        if (programLogger==null){
            programLogger =new ProgramLogger();
        } return programLogger;
    }

    private ProgramLogger(){}

    public void addLogInfo(String logInfo){
        lofFile += logInfo + "\n";
    }

    public void showLogFile(){
        System.out.println(lofFile);
    }
}
