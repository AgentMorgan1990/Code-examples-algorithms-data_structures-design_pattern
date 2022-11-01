package ru.education.data_structures.hashmap;

public class TestHashTable {


    public static void main(String[] args) {

        HashTable<Product, Integer> hashTable = new HashTableImpl<>(5);

        hashTable.put(new Product(1, "Orange"), 150);
        hashTable.put(new Product(56, "Banana"), 400);
        hashTable.put(new Product(45, "Milk"), 30);
        hashTable.put(new Product(98, "Bread"), 56);
        hashTable.put(new Product(178, "Wine"), 100);
        hashTable.put(new Product(179, "Beer"), 15);

        System.out.println("Size is " + hashTable.size());
        hashTable.display();
    }
}
