package com.getjavajob.training.algo1702.gultiaeve.lesson09;


import java.util.TreeMap;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class NavigableMapTest {

    public static void main(String[] args) {
        testLower();
        testFloor();
        testCeiling();
        testHigher();
        testPollFirst();
        testPollLast();
    }

    public static void testLower() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1, 1);
        treeMap.put(2, 2);
        assertEquals("testLower", treeMap.lowerKey(2), new Integer(1));
        assertEquals("testLowerNull", treeMap.lowerKey(1), null);
    }

    public static void testFloor() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(2, 2);
        treeMap.put(3, 3);
        assertEquals("testFloorEquals", treeMap.floorKey(3), new Integer(3));
        treeMap.remove(3);
        assertEquals("testFloorLess", treeMap.floorKey(3), new Integer(2));
        assertEquals("testFloorLessNull", treeMap.floorKey(1), null);
    }

    public static void testCeiling() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1, 1);
        treeMap.put(2, 2);
        assertEquals("testCeilingEquals", treeMap.ceilingKey(1), new Integer(1));
        treeMap.remove(1);
        assertEquals("testCeilingGreater", treeMap.ceilingKey(1), new Integer(2));
        assertEquals("testCeilingGreaterNull", treeMap.ceilingKey(3), null);
    }

    public static void testHigher() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1, 1);
        treeMap.put(2, 2);
        assertEquals("testHigherEquals", treeMap.higherKey(1), new Integer(2));
        treeMap.remove(1);
        assertEquals("testHigherGreaterNull", treeMap.higherKey(2), null);
    }

    public static void testPollFirst() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1, 1);
        assertEquals("testPollFirst", treeMap.pollFirstEntry().getKey(), new Integer(1));
        assertEquals("testPollFirstNull", treeMap.pollFirstEntry(), null);
    }

    public static void testPollLast() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1, 1);
        assertEquals("testPollLast", treeMap.pollLastEntry().getKey(), new Integer(1));
        assertEquals("testPollLastNull", treeMap.pollLastEntry(), null);
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