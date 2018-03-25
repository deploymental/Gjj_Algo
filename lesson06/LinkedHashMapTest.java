package com.getjavajob.training.algo1702.gultiaeve.lesson06;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class LinkedHashMapTest {

    public static void main(String[] args) {
        testPut();
        testPutAll();
    }

    public static void testPut() {
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(100, 100);
        Iterator<Integer> iterator = linkedHashMap.values().iterator();
        assertEquals("testPut", new Integer(100), iterator.next());
    }

    public static void testPutAll() {
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap();
        Map hashmap = new HashMap();
        hashmap.put(100, 100);
        linkedHashMap.putAll(hashmap);
        Iterator<Integer> iterator = linkedHashMap.values().iterator();
        assertEquals("testPutAll", new Integer(100), iterator.next());
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