package ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1.project_team_factory;

import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1.project_team_factory.project_manager.ProjectManager;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1.project_team_factory.project_manager.WebSiteProjectManager;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1.project_team_factory.tester.ManualTester;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1.project_team_factory.tester.Tester;
import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer.Developer;
import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer.PHPDeveloper;

public class WebSiteProjectTeamFactory implements ProjectTeamFactory{
    @Override
    public Developer getDeveloper() {
        return new PHPDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSiteProjectManager();
    }
}
