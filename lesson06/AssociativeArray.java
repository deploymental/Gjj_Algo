package com.getjavajob.training.algo1702.gultiaeve.lesson06;


import java.util.Map;
import java.util.Objects;

public class AssociativeArray<K, V> {
    private int size;
    private double threshold;
    private double loadFactor = 0.75;
    private Node<K, V>[] table;

    public AssociativeArray() {
        this(16);
    }

    public AssociativeArray(int tablelength) {
        table = new Node[tablelength];
        threshold = tablelength * loadFactor;
    }

    public V add(K key, V value) {
        size++;
        if (size >= threshold) {
            resize(table.length << 1);
        }
        return addInArray(key, value, table);
    }

    private V addInArray(K key, V value, Node<K, V>[] arr) {
        Node<K, V> newNode;
        if (key == null) {
            newNode = new Node(0, null, value, null);
        } else {
            newNode = new Node(key.hashCode(), key, value, null);
        }
        V result = null;
        if (arr[indexFor(key, arr.length)] == null) { //index in new var
            arr[indexFor(key, arr.length)] = newNode;
        } else {
            Node<K, V> temp = arr[indexFor(key, arr.length)];
            do {
                if (temp.hash == newNode.hash) {
                    result = temp.value;
                    temp.value = value;
                }
                temp = temp.next == null ? temp : temp.next;
            } while (temp.next != null);
            if (result == null) {
                temp.next = newNode;
            }
        }
        return result;
    }

    public V get(K key) {
        Node<K, V> temp = table[indexFor(key, table.length)];
        V result = temp.value;
        if (temp.next == null) {
            return result;
        } else {
            while (temp != null) {
                if (temp.key.equals(key)) {
                    result = temp.value;
                }
                temp = temp.next;
            }
            return result;
        }
    }

    public V remove(K key) {
        int index = indexFor(key, table.length);
        Node<K, V> temp = table[index];
        V result = temp.value;
        if (temp.next == null) {
            table[index] = null;
        } else if (temp.key.equals(key)) {
            table[index] = temp.next;
        } else {
            while (temp.next != null) {
                if (temp.next.key.equals(key)) {
                    result = temp.next.value;
                    temp.next = temp.next.next;
                }
            }
        }
        return result;
    }

    public int indexFor(Object h, int arrLength) {
        int hash;
        if (h == null) {
            hash = 0;
        } else {
            hash = h.hashCode();
        }
        return Math.abs(hash % arrLength);
    }

    public void resize(int newCapacity) {
        Node<K, V>[] newTable = new Node[newCapacity];
        transfer(newTable);
        table = newTable;
        threshold = (newCapacity * loadFactor);
    }

    public void transfer(Node<K, V>[] newTable) {
        for (Node<K, V> node : table) {
            Node<K, V> temp = node;
            if (temp != null && temp.next == null) {
                addInArray(temp.key, temp.value, newTable);
            } else if (temp != null) {
                while (temp.next != null) {
                    addInArray(temp.key, temp.value, newTable);
                    temp = temp.next;
                }
            }
        }
    }

    public static class Node<K, V> implements Map.Entry<K, V> {
        private final int hash;
        private final K key;
        private V value;
        private Node<K, V> next;

        Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public final K getKey() {
            return key;
        }

        public final V getValue() {
            return value;
        }

        public final String toString() {
            return key + "=" + value;
        }

        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        public final V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        public final boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o instanceof Map.Entry) {
                Map.Entry<?, ?> e = (Map.Entry<?, ?>) o;
                if (Objects.equals(key, e.getKey()) &&
                        Objects.equals(value, e.getValue())) {
                    return true;
                }
            }
            return false;
        }
    }
}
/*
Violation 1(redundant var) - not found
Violation 2(redundant inicialisation) - found
Violation 3(wrong interface) - not found
Violation 4(bad naming) - not found
Violation 5(redundant this) - not found
Violation 6(bad casting) - not found
Violation 7(static import) - not found
*/