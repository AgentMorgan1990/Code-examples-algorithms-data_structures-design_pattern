package ru.education.algorithms.sort_exercise_1;

public class MySort {

    public static void sortArray(Laptop[] array) {

        //todo посчитать сколько массивов должно быть
        int numberOfPriceGroups = 1;

        for (int i = 500; i < 2000; i += 50) {
            numberOfPriceGroups++;
        }

        //todo создаём эти массивы в массиве массивов
        Laptop[][] laptops = new Laptop[numberOfPriceGroups][];

        //todo создаём массив с цифрами этих границ
        //todo идём по основному списку и раскладываем их по массивам
        //todo раскладываем массивы в один массив





//        for (int i = 500; i < 2000; i += 50) {
//            Laptop[] laptops = new Laptop[array.length];
//            for (int j = 0; j < array.length; j++) {
//                if (array[j].getPrice()<i){
//                    //todo добавляем в массив
//                }
//            }
//        }
    }
}
