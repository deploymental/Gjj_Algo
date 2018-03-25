package com.getjavajob.training.algo1702.gultiaeve.lesson09;


import java.util.TreeMap;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class SortedMapTest {

    public static void main(String[] args) {
        testSubMap();
        testHeadMap();
        testTailMap();
        testFirst();
        testLast();
    }

    public static void testSubMap() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        TreeMap<Integer, Integer> testMap = new TreeMap<>();
        treeMap.put(2, 2);
        treeMap.put(3, 3);
        treeMap.put(4, 4);
        testMap.put(2, 2);
        assertEquals("testSubMap", treeMap.subMap(2, 3), testMap);
        testMap.put(3, 3);
        testMap.remove(2);
        assertEquals("testSubMapFirstExclusive", testMap, treeMap.subMap(2, false, 4, false));
        testMap.put(4, 4);
        assertEquals("testSubMapLastInclusive", testMap, treeMap.subMap(3, true, 4, true));
    }

    public static void testHeadMap() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        TreeMap<Integer, Integer> testMap = new TreeMap<>();
        treeMap.put(1, 1);
        treeMap.put(2, 2);
        testMap.put(1, 1);
        assertEquals("testHeadMap", testMap, treeMap.headMap(2));
        testMap.put(2, 2);
        assertEquals("testHeadMap7Inclusive", testMap, treeMap.headMap(2, true));
    }

    public static void testTailMap() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        TreeMap<Integer, Integer> testMap = new TreeMap<>();
        treeMap.put(2, 2);
        treeMap.put(3, 3);
        testMap.put(2, 2);
        testMap.put(3, 3);
        assertEquals("testTailMap", testMap, treeMap.tailMap(2));
        testMap.remove(2);
        assertEquals("testTailInclusive", testMap, treeMap.tailMap(2, false));
    }

    public static void testFirst() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1, 1);
        assertEquals("testFirst", treeMap.firstKey(), new Integer(1));
    }

    public static void testLast() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(2, 2);
        treeMap.put(1, 1);
        assertEquals("testLast", treeMap.lastKey(), new Integer(2));
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