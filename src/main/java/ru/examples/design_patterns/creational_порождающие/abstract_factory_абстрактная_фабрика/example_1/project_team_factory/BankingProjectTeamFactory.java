package ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1.project_team_factory;


import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1.project_team_factory.project_manager.BankingProjectManager;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1.project_team_factory.project_manager.ProjectManager;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1.project_team_factory.tester.QATester;
import ru.examples.design_patterns.creational_порождающие.abstract_factory_абстрактная_фабрика.example_1.project_team_factory.tester.Tester;
import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer.Developer;
import ru.examples.design_patterns.creational_порождающие.factory_method_фабричный_метод.example_1.developer.JavaDeveloper;

public class BankingProjectTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingProjectManager();
    }
}
