package ru.education.algorithms.sort_exercise_1;

public class Laptop {

    private int price;
    private int randomAccessMemory;
    private BrandName brandName;

    public Laptop(int price, int randomAccessMemory, BrandName brandName) {
        this.price = price;
        this.randomAccessMemory = randomAccessMemory;
        this.brandName = brandName;
    }

    public int getPrice() {
        return price;
    }

    public int getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public BrandName getBrandName() {
        return brandName;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", randomAccessMemory=" + randomAccessMemory +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
