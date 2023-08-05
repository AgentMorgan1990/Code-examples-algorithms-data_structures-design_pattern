package ru.examples.algorithms.sort_exercise_1;

import java.util.Arrays;

/**
 * Отсортировать массив, состоящий из экземпляров класса Notebook в количестве 10000 штук.
 *
 * Условия для сортировки:
 *
 * 1) по цене. От 500 до 2000 долларов с шагом в 50
 * если цена равная, то
 *
 * 2) по кол-ву оперативной памяти (от 4 до 24 с шагом 4)
 * если памяти тоже равное количество, то
 *
 * 3) по производителю: Lenuvo > Asos > MacNote > Eser > Xamiou
 */

public class TestClass {
    public static void main(String[] args) {


        Laptop[] laptops = new Laptop[10_000];

        for (int i = 0; i < laptops.length; i++) {
            laptops[i] = new Laptop(
                    (int) (Math.random() * 2500),
                    (int) (Math.random() * 32),
                    BrandName.getById((int) (Math.random() * 4))
            );
        }

//        laptops[0] = new Laptop(700,8,BrandName.LENUVO);
//        laptops[1] = new Laptop(700,4,BrandName.ASOS);
//        laptops[2] = new Laptop(700,4,BrandName.LENUVO);
//        laptops[3] = new Laptop(510,12,BrandName.ASOS);
//        laptops[4] = new Laptop(1200,4,BrandName.XAMIOU);
//        laptops[5] = new Laptop(720,4,BrandName.XAMIOU);
//        laptops[6] = new Laptop(2000,20,BrandName.MAC_NOTE);
//        laptops[7] = new Laptop(505,24,BrandName.ESER);
//        laptops[8] = new Laptop(1000,4,BrandName.MAC_NOTE);
//        laptops[9] = new Laptop(600,14,BrandName.XAMIOU);

        System.out.println(Arrays.toString(laptops));

        BubbleSort.sortArray(laptops);

        System.out.println(Arrays.toString(laptops));


    }
}
