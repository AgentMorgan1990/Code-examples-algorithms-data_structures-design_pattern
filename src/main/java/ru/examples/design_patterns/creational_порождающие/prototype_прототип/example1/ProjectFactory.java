package ru.examples.design_patterns.creational_порождающие.prototype_прототип.example1;

public class ProjectFactory {

    Project project;

    public ProjectFactory(Project project){
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project cloneProject(){
        return (Project) project.copy();
    }
}
