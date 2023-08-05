package ru.examples.design_patterns.creational_порождающие.singleton_одиночка;

public class SingletonWithFullSynchronization {
    private static SingletonWithFullSynchronization uniqueInstance;

    private SingletonWithFullSynchronization() {
    }

    public static synchronized SingletonWithFullSynchronization getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonWithFullSynchronization();
        }
        return uniqueInstance;
    }

    //Остальные методы класса
}
