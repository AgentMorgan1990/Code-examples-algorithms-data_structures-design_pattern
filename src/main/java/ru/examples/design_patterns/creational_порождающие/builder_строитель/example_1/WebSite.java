package ru.examples.design_patterns.creational_порождающие.builder_строитель.example_1;

public class WebSite {

    private String name;
    private int price;
    private String quality;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quality='" + quality + '\'' +
                '}';
    }
}
