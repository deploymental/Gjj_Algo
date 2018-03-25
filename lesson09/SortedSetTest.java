package com.getjavajob.training.algo1702.gultiaeve.lesson09;


import java.util.TreeSet;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class SortedSetTest {

    public static void main(String[] args) {
        testSubSet();
        testHeadSet();
        testTailSet();
        testFirst();
        testLast();
    }

    public static void testSubSet() {
        TreeSet<Integer> treeMap = new TreeSet<>();
        TreeSet<Integer> testMap = new TreeSet<>();
        treeMap.add(2);
        treeMap.add(3);
        treeMap.add(4);
        testMap.add(2);
        assertEquals("testSubSet", treeMap.subSet(2, 3), testMap);
        testMap.add(3);
        testMap.remove(2);
        assertEquals("testSubSetFirstExclusive", testMap, treeMap.subSet(2, false, 4, false));
        testMap.add(4);
        assertEquals("testSubSetLastInclusive", testMap, treeMap.subSet(3, true, 4, true));
    }

    public static void testHeadSet() {
        TreeSet<Integer> treeMap = new TreeSet<>();
        TreeSet<Integer> testMap = new TreeSet<>();
        treeMap.add(1);
        treeMap.add(2);
        testMap.add(1);
        assertEquals("testHeadSet", testMap, treeMap.headSet(2));
        testMap.add(2);
        assertEquals("testHeadSetLastInclusive", testMap, treeMap.headSet(2, true));
    }

    public static void testTailSet() {
        TreeSet<Integer> treeMap = new TreeSet<>();
        TreeSet<Integer> testMap = new TreeSet<>();
        treeMap.add(2);
        treeMap.add(3);
        testMap.add(2);
        testMap.add(3);
        assertEquals("testTailSet", testMap, treeMap.tailSet(2));
        testMap.remove(2);
        assertEquals("testTailInclusive", testMap, treeMap.tailSet(2, false));
    }

    public static void testFirst() {
        TreeSet<Integer> treeMap = new TreeSet<>();
        treeMap.add(1);
        assertEquals("testFirst", treeMap.first(), new Integer(1));
    }

    public static void testLast() {
        TreeSet<Integer> treeMap = new TreeSet<>();
        treeMap.add(2);
        treeMap.add(1);
        assertEquals("testLast", treeMap.last(), new Integer(2));
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