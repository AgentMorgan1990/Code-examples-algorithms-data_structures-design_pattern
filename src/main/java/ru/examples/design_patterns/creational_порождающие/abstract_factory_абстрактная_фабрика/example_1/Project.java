package ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1;

import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1.project_team_factory.project_manager.ProjectManager;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1.project_team_factory.BankingProjectTeamFactory;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1.project_team_factory.ProjectTeamFactory;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1.project_team_factory.WebSiteProjectTeamFactory;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1.project_team_factory.tester.Tester;
import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer.Developer;

public class Project {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingProjectTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Developer developer1 = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        developer.writeCode();
        developer1.writeCode();
        tester.testCode();
        projectManager.manageProject();


        ProjectTeamFactory projectTeamFactory1 = new WebSiteProjectTeamFactory();
        Developer developer2 = projectTeamFactory1.getDeveloper();

        Tester tester2 = projectTeamFactory1.getTester();
        ProjectManager projectManager2 = projectTeamFactory1.getProjectManager();
        developer2.writeCode();
        tester2.testCode();
        projectManager2.manageProject();
    }
}
