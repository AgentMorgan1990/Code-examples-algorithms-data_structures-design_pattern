package ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1.project_team_factory.project_manager;

public class BankingProjectManager implements ProjectManager{
    @Override
    public void manageProject() {
        System.out.println("Banking project manager manages banking project ...");
    }
}
