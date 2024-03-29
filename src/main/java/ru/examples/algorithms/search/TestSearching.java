package ru.examples.algorithms.search;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestSearching {
    public static void main(String[] args) {

        Integer[] array = {1,3,5,7,9,11,13,15,17,19,67,78,98,115,116,117,119,120,121,122,134,167,175};
//        System.out.println(BinarySearch.binarySearch(array,175));


        System.out.println(LocalDate.now().minusMonths(1).with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println(LocalDate.now().minusMonths(1).with(TemporalAdjusters.lastDayOfMonth()));

        System.out.println(InterpolationSearch.search(array,120));



//        LocalDate.now().minusMonths(1).with(TemporalAdjusters.firstDayOfMonth())

    }
}
