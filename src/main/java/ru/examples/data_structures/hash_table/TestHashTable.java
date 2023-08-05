package ru.examples.data_structures.hash_table;

public class TestHashTable {


    public static void main(String[] args) {
//
//        HashTable<Product, Integer> hashTable = new HashTableImpl<>(5);
//
//        hashTable.put(new Product(1, "Orange"), 150);
//        hashTable.put(new Product(77, "Banana"), 100);
//        hashTable.put(new Product(67, "Carrot"), 228);
//        hashTable.put(new Product(60, "Lemon"), 250);
//        hashTable.put(new Product(51, "Milk"), 120);
//        hashTable.put(new Product(21, "Potato"), 67);
//
//        System.out.println("Size is " + hashTable.size());
//        hashTable.display();
//        System.out.println("Cost potato is " + hashTable.get(new Product(21, "Potato")));
//        System.out.println("Cost banana is " + hashTable.get(new Product(77, "Banana")));
//        System.out.println("Cost carrot is " + hashTable.get(new Product(67, "Carrot")));
//
//        hashTable.remove(new Product(21, "Potato"));
//        hashTable.remove(new Product(77, "Banana"));
//
//        System.out.println("Cost potato is " + hashTable.get(new Product(21, "Potato")));
//        System.out.println("Cost banana is " + hashTable.get(new Product(77, "Banana")));
//        System.out.println("Cost carrot is " + hashTable.get(new Product(67, "Carrot")));
//
//        hashTable.put(new Product(47, "Pineapple"), 228);
//
//        hashTable.display();

        HashTable<Product, Integer> hashTable = new HashTableChainMethodImpl<>(4);

        hashTable.put(new Product(1, "Orange"), 150);
        hashTable.put(new Product(77, "Banana"), 100);
        hashTable.put(new Product(67, "Carrot"), 500);
        hashTable.put(new Product(60, "Lemon"), 250);
        hashTable.put(new Product(51, "Milk"), 120);
        hashTable.put(new Product(21, "Potato"), 67);
        hashTable.display();

        hashTable.put(new Product(21, "Potato"), 87);

        System.out.println("Size is " + hashTable.size());
        hashTable.display();

        System.out.println("Cost potato is " + hashTable.get(new Product(21, "Potato")));
        System.out.println("Cost banana is " + hashTable.get(new Product(77, "Banana")));
        System.out.println("Cost carrot is " + hashTable.get(new Product(67, "Carrot")));
        System.out.println("Cost orange is " + hashTable.get(new Product(1, "Orange")));

        hashTable.remove(new Product(21, "Potato"));
        hashTable.remove(new Product(77, "Banana"));
        hashTable.remove(new Product(1, "Orange"));

        System.out.println("Cost potato is " + hashTable.get(new Product(21, "Potato")));
        System.out.println("Cost banana is " + hashTable.get(new Product(77, "Banana")));
        System.out.println("Cost carrot is " + hashTable.get(new Product(67, "Carrot")));

        hashTable.put(new Product(47, "Pineapple"), 228);

        hashTable.display();

        System.out.println(hashTable.get(new Product(21, "Potato")));
    }
}
