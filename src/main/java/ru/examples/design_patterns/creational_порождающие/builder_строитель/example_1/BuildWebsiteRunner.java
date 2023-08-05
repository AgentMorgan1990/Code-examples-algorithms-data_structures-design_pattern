package ru.examples.design_patterns.creational_порождающие.builder_строитель.example_1;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new EnterpriseWebsiteBuilder());
        WebSite webSite = director.buildWebsite();
        System.out.println(webSite);
    }
}
