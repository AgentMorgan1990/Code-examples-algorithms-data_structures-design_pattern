package ru.education.data_structures.hashmap;


/**
 * Реализация HashTable с открытой адресацией (используется например в Python)
 */
public class HashTableImpl<K, V> implements HashTable<K, V> {

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

    public HashTableImpl(int initialCapacity) {
        this.data = new Item[initialCapacity * 2];
        emptyItem = new Item<>(null, null);
    }

    public HashTableImpl() {
        this(16);
    }

    @Override
    public boolean put(K key, V value) {
        if (size() == data.length) {
            return false;
        }

        int index = hashFunc(key);
        int n = 0;

        while (data[index] != null && data[index] != emptyItem) {
            if (isKeysEquals(data[index], key)) {
                data[index].setValue(value);
                return true;
            }
//            index += getStepLinear();
//            index += getStepQuadratic(n++);
            index += getDoubleHash(key);
            index %= data.length;
        }

        data[index] = new Item<>(key, value);
        size++;

        return true;
    }

    private int getDoubleHash(K key) {
        return 5 - (key.hashCode() % 5);
    }

    private int getStepLinear() {
        return 1;
    }

    private int getStepQuadratic(int n) {
        return (int) Math.pow(n, 2);
    }

    private boolean isKeysEquals(Item<K, V> item, K key) {
        if (item == emptyItem) {
            return false;
        }
        return (item.getKey() == null) ? (key == null) : (item.getKey().equals(key));
    }

    private int hashFunc(K key) {
        return Math.abs(key.hashCode() % data.length);
    }

    @Override
    public V get(K key) {
        int index = indexOf(key);
        ;
        return index == -1 ? null : data[index].getValue();
    }

    private int indexOf(K key) {
        int index = hashFunc(key);

        int count = 0;
        while (count++ < data.length) {
            if (data[index] == null) {
                break;
            }
            if (isKeysEquals(data[index], key)) {
                return index;
            }

//            index += getStepQuadratic(count - 1);
            index += getDoubleHash(key);
            index %= data.length;
        }
        return -1;
    }

    @Override
    public V remove(K key) {

        int index = indexOf(key);
        if (index == -1) {
            return null;
        }

        Item<K, V> removed = data[index];
        data[index] = emptyItem;

        return removed.getValue();
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
