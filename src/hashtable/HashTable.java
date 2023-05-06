package hashtable;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable<K, V> extends AbstractHashTable<K, V> {
    private LinkedList<Node<K, V>>[] hashTable = null;

    public HashTable(int capacity) {
        super(capacity);
        hashTable = new LinkedList[capacity];
    }

    @Override
    public void clear() {
        hashTable = new LinkedList[capacity];
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public V get(K key) {
        int index = hash(key);
        if (hashTable[index] == null) {
            throw new IllegalArgumentException("Nuk ekziston celesi i dhene ne hashtabele!");
        }

        for (Node<K, V> node : hashTable[index]) {
            if (node.getKey().equals(key))
                return node.getValue();
        }
        throw new IllegalArgumentException("Nuk ekzsiton celesi i dhene ne hashtabele!");

    }

    @Override
    public void put(K key, V value) {
        int index = hash(key);

        if (hashTable[index] == null) {
            hashTable[index] = new LinkedList<>();
            hashTable[index].add(new Node<>(key, value));
            size++;
            return;
        }
        //kontrollo ne listen e nderlidhur se a ekziston ky celes, nese nuk ekziston shto!
        for (Node<K, V> node : hashTable[index]) {
            if (node.getKey().equals(key)) {
                throw new IllegalArgumentException("Celesi vetemse ekziston, perdore replace!");
            }
        }
        hashTable[index].addLast(new Node<>(key, value));
        size++;
    }

    @Override
    public void remove(K key, V value) {

    }

    @Override
    public void remove(K key) {

    }

    @Override
    public void replace(K key, V value) {

    }

    @Override
    public ArrayList<V> values() {
        ArrayList<V> values = new ArrayList<>();
        for (LinkedList<Node<K, V>> linkedList : hashTable) {
            if (linkedList != null) {
                for (Node<K, V> node : linkedList) {
                    values.add(node.getValue());
                }
            }
        }
        return values;
    }

    @Override
    public ArrayList<K> keys() {
        ArrayList<K> keys = new ArrayList<>();
        for (LinkedList<Node<K, V>> linkedList : hashTable) {
            if (linkedList != null) {
                for (Node<K, V> node : linkedList) {
                    keys.add(node.getKey());
                }
            }
        }
        return keys;
    }

    @Override
    public boolean containsKey(K key) {
        return keys().contains(key);
    }

    @Override
    public boolean containsValue(V value) {
        return values().contains(value);
    }

    @Override
    public V getOrDefault(K key) {
        return null;
    }

    private int hash(K key) {
        return (key.hashCode() & 0x7FFFFFFF) % capacity;
    }
}












