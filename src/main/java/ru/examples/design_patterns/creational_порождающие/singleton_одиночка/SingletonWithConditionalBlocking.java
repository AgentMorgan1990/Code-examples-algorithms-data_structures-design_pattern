package ru.examples.design_patterns.creational_порождающие.singleton_одиночка;

public class SingletonWithConditionalBlocking {
    private volatile static SingletonWithConditionalBlocking uniqueInstance;

    private SingletonWithConditionalBlocking() {
    }

    public static SingletonWithConditionalBlocking getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonWithConditionalBlocking.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonWithConditionalBlocking();
                }
            }
        }
        return uniqueInstance;
    }
    //Остальные методы класса
}
