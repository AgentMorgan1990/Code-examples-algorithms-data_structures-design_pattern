package ru.education.data_structures.hashmap;


import java.util.Arrays;

/**
 * Реализация HashTable с открытой адресацией, используется например в Python
 */
public class HashTableImpl<K, V> implements HashTable<K, V> {

    private final Item<K, V>[] data;

    private int size;

    static class Item<K, V> implements Entry<K, V> {
        private final K key;
        private V value;

        Item(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }

        @Override
        public K getKey() {
            return null;
        }

        @Override
        public V getValue() {
            return null;
        }

        @Override
        public void setValue(V value) {

        }
    }


    public HashTableImpl(int initialCapacity) {
        this.data = new Item[initialCapacity * 2];
    }

    public HashTableImpl() {
        this(16);
    }

    @Override
    public boolean put(K key, V value) {
        if (size() == data.length) {
            return false;
        }

        int index = hashFunction(key);

        while (data[index] != null) {

            if (isKeyEquals(data[index], key)) {
                data[index].setValue(value);
                return true;
            }
            index += getStepLinear();
            index %= data.length;
        }

        data[index] = new Item<>(key, value);
        size++;
        return true;
    }

    private int getStepLinear() {
        return 1;
    }

    //todo упростить код или понять как это работает
    private boolean isKeyEquals(Item<K, V> item, K key) {
        return (item.getKey() == null) ? (key == null) : (item.getKey().equals(key));

    }

    private int hashFunction(K key) {
        return Math.abs(key.hashCode() % data.length);
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            sb.append(String.format("%s = [%s]%n", i, data[i]));
        }
        return sb.toString();
    }
}
