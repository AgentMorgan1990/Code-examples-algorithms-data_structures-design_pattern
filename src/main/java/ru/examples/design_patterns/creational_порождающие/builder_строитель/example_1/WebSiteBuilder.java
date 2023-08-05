package ru.examples.design_patterns.creational_порождающие.builder_строитель.example_1;

public abstract class WebSiteBuilder {

    WebSite webSite;

    void createWebsite(){
        webSite = new WebSite();
    }
    abstract void buildName();
    abstract void buildPrice();
    abstract void buildQuality();

    WebSite getWebSite(){
        return webSite;
    }

}
