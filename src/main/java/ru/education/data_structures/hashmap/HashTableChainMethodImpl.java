package ru.education.data_structures.hashmap;

import java.util.LinkedList;
import java.util.List;

/**
 * Реализация HashTable методом цепочек
 */
public class HashTableChainMethodImpl<K, V> implements HashTable<K, V> {


    private final Item<K, V>[] data;
    private final Item<K, V> emptyItem;
    private int size;

    static class Item<K, V> implements Entry<K, V> {
        private final K key;
        private V value;

        public Item(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Item{" + "key=" + key + ", value=" + value + '}';
        }
    }

    public HashTableChainMethodImpl(int initialCapacity) {
        this.data = new Item[initialCapacity];
        emptyItem = new Item<>(null, null);
    }

    public HashTableChainMethodImpl() {
        this(16);
    }


    @Override
    public boolean put(K key, V value) {

        int index = hashFunc(key);

        if (data[index] == null) {
            data[index] = new Item<>(key, value);
            System.out.println("Add new element");
            size++;
            return true;
        }

        Item<K, V> item = new Item<>(data[index].getKey(), data[index].getValue());

        if (item.getValue() instanceof List) {
            List<Item<K, V>> items = (List<Item<K, V>>) item.getValue();

            if (!addValueToSameKey(items, key, value)) {items.add(new Item<>(key, value));}

            System.out.println("Add element to List");
            size++;
            return true;
        }

        List<Item<K, V>> items = new LinkedList<>();
        items.add(item);
        items.add(new Item<>(key, value));
        data[index] = (Item<K, V>) new Item<>(item.getKey(), items);
        System.out.println("Create new List");
        size++;
        return true;
    }

    @Override
    public V get(final K key) {

        int index = indexOf(key);

        if (data[index].getValue() instanceof List) {

            List<Item<K, V>> items = (List<Item<K, V>>) data[index].getValue();

            for (Item item : items) {
                if (item.getKey().equals(key)) {
                    return (V) item.getValue();
                }
            }
        }

        if (data[index].getValue() != null) {
            return data[index].getValue();
        }

        return null;
    }


    private int indexOf(K key) {
        return hashFunc(key);
    }

    @Override
    public V remove(K key) {

        int index = indexOf(key);
        Item<K, V> removeItem = null;

        if (data[index].getValue() instanceof List) {
            List<Item<K, V>> items = (List<Item<K, V>>) data[index].getValue();
            for (Item item : items) {
                if (item.getKey().equals(key)) {
                    removeItem = item;
                }
            }
            items.remove(removeItem);

            if (items.isEmpty()) {
                data[index] = null;
            }

        } else {
            removeItem = data[index];
            data[index] = null;
        }

        size--;
        return removeItem.getValue();
    }


    private boolean addValueToSameKey(List<Item<K, V>> items, K key, V value) {

        for (Item item : items) {
            if (item.getKey().equals(key)) {
                item.setValue(value);
                return true;
            }
        }
        return false;
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

    private int hashFunc(K key) {
        return Math.abs(key.hashCode() % data.length);
    }

}
