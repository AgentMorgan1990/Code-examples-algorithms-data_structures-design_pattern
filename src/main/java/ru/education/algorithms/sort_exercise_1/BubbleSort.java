package ru.education.algorithms.sort_exercise_1;

public class BubbleSort {


    public static void sortArray(Laptop[] array) {

        //todo * добавить проверку были изменения в массиве

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j].getPrice() > array[j + 1].getPrice()) {

                    Laptop tmpLaptop = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmpLaptop;

                }

                if (array[j].getPrice() == array[j + 1].getPrice()
                        && array[j].getRandomAccessMemory() > array[j + 1].getRandomAccessMemory()) {

                    Laptop tmpLaptop = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmpLaptop;

                }

                if (array[j].getPrice() == array[j + 1].getPrice()
                        && array[j].getRandomAccessMemory() == array[j + 1].getRandomAccessMemory()
                        && array[j].getBrandName().getId() > array[j + 1].getBrandName().getId()
                ) {

                    Laptop tmpLaptop = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmpLaptop;

                }
            }
        }
    }
}

