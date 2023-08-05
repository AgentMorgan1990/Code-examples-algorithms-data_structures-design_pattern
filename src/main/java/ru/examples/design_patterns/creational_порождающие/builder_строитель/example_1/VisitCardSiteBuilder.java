package ru.examples.design_patterns.creational_порождающие.builder_строитель.example_1;

public class VisitCardSiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("VisitCard");
    }

    @Override
    void buildPrice() {
        webSite.setPrice(500);
    }

    @Override
    void buildQuality() {
        webSite.setQuality("Good");
    }
}
