package com.getjavajob.training.algo1702.gultiaeve.lesson06;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class MapTest {

    public static void main(String[] args) {
        testSize();
        testIsEmpty();
        testContainsKey();
        testContainsValue();
        testGetAndPut();
        testRemove();
        testPutAll();
        testClear();
        testValues();
        testKeySet();
        testEntrySet();
    }

    public static void testSize() {
        Map<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < 10; i++) {
            hashMap.put(i, i);
        }
        assertEquals("testSize", 10, hashMap.size());
    }

    public static void testIsEmpty() {
        Map<Integer, Integer> hashMap = new HashMap();
        assertEquals("testIsEmptyTrue", true, hashMap.isEmpty());
        hashMap.put(1, 1);
        assertEquals("testIsEmptyFalse", false, hashMap.isEmpty());
    }

    public static void testContainsKey() {
        Map<Integer, Integer> hashMap = new HashMap();
        assertEquals("testContainsKeyFalse", false, hashMap.containsKey(new Object()));
        hashMap.put(1, 1);
        assertEquals("testContainsKeyTrue", true, hashMap.containsKey(1));
    }

    public static void testContainsValue() {
        Map<Integer, Integer> hashMap = new HashMap();
        assertEquals("testContainsValueFalse", false, hashMap.containsValue(new Object()));
        hashMap.put(1, 1);
        assertEquals("testContainsValueTrue", true, hashMap.containsValue(1));
    }

    public static void testGetAndPut() {
        Map<Integer, Integer> hashMap = new HashMap();
        hashMap.put(1, 1);
        assertEquals("testGetAndPut", new Integer(1), hashMap.get(1));
        hashMap.put(1, 2);
        assertEquals("testPutExisting", new Integer(2), hashMap.get(1));
    }

    public static void testRemove() {
        Map<Integer, Integer> hashMap = new HashMap();
        hashMap.put(1, 1);
        assertEquals("testRemove", new Integer(1), hashMap.remove(1));
    }

    public static void testPutAll() {
        Map<Integer, Integer> temp = new HashMap();
        Map<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < 10; i++) {
            temp.put(i, i);
        }
        hashMap.putAll(temp);
        assertEquals("testPutAll", new Integer(5), hashMap.get(5));
    }

    public static void testClear() {
        Map<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < 10; i++) {
            hashMap.put(i, i);
        }
        hashMap.clear();
        assertEquals("testClear", true, hashMap.isEmpty());
    }

    public static void testValues() {
        Map<Integer, Integer> hashMap = new HashMap();
        Collection list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            hashMap.put(i, i);
            list.add(i);
        }
        Collection collection = hashMap.values();
        assertEquals("testValues", list.toArray(), collection.toArray());
    }

    public static void testKeySet() {
        Map<Integer, Integer> hashMap = new HashMap();
        Set set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put(i, i);
            set.add(i);
        }
        assertEquals("testKeySet", set, hashMap.keySet());
    }

    public static void testEntrySet() {
        Map<Integer, Integer> hashMap = new HashMap();
        hashMap.put(1, 1);
        Object[] objects = hashMap.entrySet().toArray();
        HashMap.Entry entry = (HashMap.Entry) objects[0];
        assertEquals("testEntrySet", new Integer(1), entry.getKey());
    }
}
/*
Violation 1(redundant var) - not found
Violation 2(redundant inicialisation) - not found
Violation 3(wrong interface) - not found
Violation 4(bad naming) - not found
Violation 5(redundant this) - not found
Violation 6(bad casting) - not found
Violation 7(static import) - not found
*/