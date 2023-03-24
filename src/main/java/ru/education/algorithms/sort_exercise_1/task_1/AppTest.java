package ru.education.algorithms.sort_exercise_1.task_1;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class AppTest {

    public static void main(String[] args) {

        Laptop[] laptops = new Laptop[100];
        Map<Integer, String> laptopManufacturer = Map.of(1, "Lenuvo", 2, "Asos", 3, "MacNote", 4, "Eser", 5, "Xamiou");

        Random random = new Random();

        for (int i = 0; i < laptops.length; i++) {
            laptops[i] = new Laptop(
                    450 + (int) (Math.random() * 31 + 1) * 50,
                    (1 + random.nextInt(6)) * 4,
                    laptopManufacturer.get(1 + random.nextInt(5))
            );
        }
        System.out.println(Arrays.toString(laptops));
        sortLaptops(laptops);
        System.out.println(Arrays.toString(laptops));
    }

    public static void sortLaptops(Laptop[] laptops) {

        boolean isChange;

        do {
            isChange = false;
            for (int i = 0; i < laptops.length - 1; i++) {
                if (greaterThen(laptops[i], laptops[i + 1])) {
                    Laptop tmp = laptops[i];
                    laptops[i] = laptops[i + 1];
                    laptops[i + 1] = tmp;
                    isChange = true;
                }
            }
        } while (isChange);
    }


    public static boolean greaterThen(Laptop currentLaptop, Laptop nextLaptop) {
        Map<String, Integer> laptopManufacturer = Map.of("Lenuvo", 1, "Asos", 2, "MacNote", 3, "Eser", 4, "Xamiou", 5);

        if ((int) currentLaptop.getPrice() != nextLaptop.getPrice())
            return currentLaptop.getPrice() > nextLaptop.getPrice();

        if ((int) currentLaptop.getRandomAccessMemory() != nextLaptop.getRandomAccessMemory())
            return currentLaptop.getRandomAccessMemory() > nextLaptop.getRandomAccessMemory();

        if ((int) laptopManufacturer.get(currentLaptop.getManufacturer()) != laptopManufacturer.get(nextLaptop.getManufacturer()))
            return laptopManufacturer.get(currentLaptop.getManufacturer()) > laptopManufacturer.get(nextLaptop.getManufacturer());

        return false;
    }
}

