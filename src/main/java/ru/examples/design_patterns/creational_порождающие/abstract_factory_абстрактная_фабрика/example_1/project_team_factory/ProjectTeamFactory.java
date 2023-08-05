package ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1.project_team_factory;

import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1.project_team_factory.project_manager.ProjectManager;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1.project_team_factory.tester.Tester;
import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer.Developer;

public interface ProjectTeamFactory {

    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();

}
