package ru.examples.design_patterns.behavioral_поведенческие.memento_хранитель.example_1;

public class Test {
    public static void main(String[] args) {
        Project project = new Project();
        GitHubRepo gitHubRepo = new GitHubRepo();

        System.out.println("Creating new project");
        project.setVersionAndDate("1.0.0");
        System.out.println(project);
        gitHubRepo.setSave(project.save());
        System.out.println("Проект сохранён на гитхаб");

        project.setVersionAndDate("1.0.1");
        System.out.println(project);

        project.load(gitHubRepo.getSave());
        System.out.println(project);

    }
}
