package ru.examples.algorithms.recursion;

import java.util.LinkedHashSet;
import java.util.Set;


public class Anagram {


    private Set<String> resultSet = new LinkedHashSet<>();
    private char[] chars;

    public static void main(String[] args) {
        System.out.println(new Anagram().findAll("abcd"));
    }

    private Set<String> findAll(String world) {
        resultSet.clear();
        chars = world.toCharArray();
        find(chars.length);

        return resultSet;
    }

    private void find(int length) {
        if (length==1){
            return;
        }
        for (int i = 0; i < length; i++) {
            find(length-1);
            resultSet.add(String.valueOf(chars));
            rotate(length);
        }
    }

    private void rotate(int length) {
        int first = chars.length-length;
        char tmp = chars[first];
        for (int i = first + 1; i < chars.length; i++) {
            chars[i - 1] = chars[i];
        }
        chars[chars.length - 1] = tmp;
    }
}
