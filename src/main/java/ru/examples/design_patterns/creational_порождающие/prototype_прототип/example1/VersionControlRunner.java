package ru.examples.design_patterns.creational_порождающие.prototype_прототип.example1;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project project = new Project(1,"Proj", "psvm{ Hello, World}");
        System.out.println(project);
        ProjectFactory projectFactory = new ProjectFactory(project);
        Project cloneProject = projectFactory.cloneProject();

        project.setProjectName("Easy");

        System.out.println(project);
        System.out.println(cloneProject);
    }
}
