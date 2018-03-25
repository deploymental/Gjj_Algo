package com.getjavajob.training.algo1702.gultiaeve.lesson09;


import java.util.TreeSet;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class NavigableSetTest {

    public static void main(String[] args) {
        testLower();
        testFloor();
        testCeiling();
        testHigher();
        testPollFirst();
        testPollLast();
    }

    public static void testLower() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        assertEquals("testLower", treeSet.lower(2), new Integer(1));
        assertEquals("testLowerNull", treeSet.lower(1), null);
    }

    public static void testFloor() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(3);
        assertEquals("testFloorEquals", treeSet.floor(3), new Integer(3));
        treeSet.remove(3);
        assertEquals("testFloorLess", treeSet.floor(3), new Integer(2));
        assertEquals("testFloorLessNull", treeSet.floor(1), null);
    }

    public static void testCeiling() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        assertEquals("testCeilingEquals", treeSet.ceiling(1), new Integer(1));
        treeSet.remove(1);
        assertEquals("testCeilingGreater", treeSet.ceiling(1), new Integer(2));
        assertEquals("testCeilingGreaterNull", treeSet.ceiling(3), null);
    }

    public static void testHigher() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        assertEquals("testHigherEquals", treeSet.higher(1), new Integer(2));
        treeSet.remove(1);
        assertEquals("testHigherGreaterNull", treeSet.higher(2), null);
    }

    public static void testPollFirst() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        assertEquals("testPollFirst", treeSet.pollFirst(), new Integer(1));
        assertEquals("testPollFirstNull", treeSet.pollFirst(), null);
    }

    public static void testPollLast() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        assertEquals("testPollLast", treeSet.pollLast(), new Integer(1));
        assertEquals("testPollLastNull", treeSet.pollLast(), null);
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