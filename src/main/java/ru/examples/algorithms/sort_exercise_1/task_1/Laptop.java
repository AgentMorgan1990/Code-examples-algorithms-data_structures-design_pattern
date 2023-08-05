package ru.examples.algorithms.sort_exercise_1.task_1;

public class Laptop {

    private int price;
    private int randomAccessMemory;
    private String manufacturer;

    public Laptop(Integer price, Integer randomAccessMemory, String manufacturer) {
        this.price = price;
        this.randomAccessMemory = randomAccessMemory;
        this.manufacturer = manufacturer;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", randomAccessMemory=" + randomAccessMemory +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
