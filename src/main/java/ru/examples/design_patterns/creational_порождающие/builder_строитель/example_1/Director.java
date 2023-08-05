package ru.examples.design_patterns.creational_порождающие.builder_строитель.example_1;

public class Director {
    WebSiteBuilder builder;

    public void setBuilder(WebSiteBuilder builder) {
        this.builder = builder;
    }

    WebSite buildWebsite(){
        builder.createWebsite();
        builder.buildName();
        builder.buildPrice();
        builder.buildQuality();
        WebSite webSite = builder.getWebSite();
        return webSite;
    }
}
