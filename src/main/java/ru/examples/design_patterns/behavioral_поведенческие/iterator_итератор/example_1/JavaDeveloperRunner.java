package ru.examples.design_patterns.behavioral_поведенческие.iterator_итератор.example_1;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java","Spring","Postgres"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Вася",skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer: "+ javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
