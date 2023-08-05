package ru.examples.design_patterns.creational_порождающие.singleton_одиночка;

public class SingletonWithStaticInitialization {
    private static SingletonWithStaticInitialization uniqueInstance = new SingletonWithStaticInitialization();

    private SingletonWithStaticInitialization() {
    }

    public static synchronized SingletonWithStaticInitialization getInstance() {
        return uniqueInstance;
    }

    //Остальные методы класса
}
