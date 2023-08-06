package ru.examples.design_patterns.behavioral_поведенческие.memento_хранитель.example_1;

import java.time.LocalDateTime;

public class Project {
    private String version;
    private LocalDateTime localDateTime;

    public void setVersionAndDate(String version){
        this.version = version;
        localDateTime = LocalDateTime.now();
    }

    public Save save(){
        return new Save(version);
    }

    public void load(Save save){
        this.version = save.getVersion();
        this.localDateTime = save.getDateTime();
    }

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
