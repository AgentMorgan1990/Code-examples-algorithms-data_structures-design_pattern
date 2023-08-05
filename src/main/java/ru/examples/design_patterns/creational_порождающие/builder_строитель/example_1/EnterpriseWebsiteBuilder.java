package ru.examples.design_patterns.creational_порождающие.builder_строитель.example_1;

public class EnterpriseWebsiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Enterprise");
    }

    @Override
    void buildPrice() {
        webSite.setPrice(20000);
    }

    @Override
    void buildQuality() {
        webSite.setQuality("Perfect");
    }
}
