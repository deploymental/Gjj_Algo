package com.getjavajob.training.algo1702.gultiaeve.lesson10;


import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;
import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.fail;

public class CollectionTest {

    public static void main(String[] args) {
        testAddAll();
        testAsLifoQueue();
        testBinarySearch();
        testCheckedCollection();
        testCheckedList();
        testCheckedMap();
        testCheckedSet();
        testDisjoint();
        testFill();
        testFrequency();
        testIndexOfSubList();
        testLastIndexOfSubList();
        testMax();
        testMin();
        testNCopies();
        testNewSetFromMap();
        testReplaceAll();
        testReverse();
        testRotate();
        testSort();
    }

    public static void testAddAll() {
        List result = new ArrayList();
        result.add(5);
        int[] origin = {5};
        Collections.addAll(result, origin);
        assertEquals("testAddAll()", result.toArray()[0], origin[0]);
    }

    public static void testAsLifoQueue() {
        ArrayDeque origin = new ArrayDeque();
        origin.add(5);
        origin.add(3);
        ArrayQueue result = new ArrayQueue(2);
        result.add(5);
        result.add(3);
        assertEquals("testAsLifoQueue()", result.toString(), Collections.asLifoQueue(origin).toString());
    }

    public static void testBinarySearch() {
        List origin = new ArrayList();
        String[] originString = {"A", "Bb", "Ccc", "Dddd", "Eeeee", "Ffffff", "Ggggggg", "Qqqqqqqq", "Rrrrrrrrr", "Ssssssssss"};
        origin.addAll(Arrays.asList(originString));
        assertEquals("testBinaryStringSearch()", 3, Collections.binarySearch(origin, "Dddd", String.CASE_INSENSITIVE_ORDER));
    }

    public static void testCheckedCollection() {
        List origin = new ArrayList();
        origin.add(5);
        Collection result = Collections.checkedCollection(origin, Integer.class);
        try {
            result.add("e");
            fail("not passed");
        } catch (ClassCastException e) {
            System.out.println("testCheckedCollection() passed");
        }
    }

    public static void testCheckedList() {
        List origin = new ArrayList();
        origin.add(5);
        List result = Collections.checkedList(origin, Integer.class);
        try {
            result.add("e");
            fail("not passed");
        } catch (ClassCastException e) {
            System.out.println("testCheckedList() passed");
        }
    }

    public static void testCheckedMap() {
        Map origin = new HashMap();
        origin.put(5, 5);
        Map result = Collections.checkedMap(origin, Integer.class, Integer.class);
        try {
            result.put("e", "e");
            fail("not passed");
        } catch (ClassCastException e) {
            System.out.println("testCheckedMap() passed");
        }
    }

    public static void testCheckedSet() {
        Set origin = new HashSet();
        origin.add(5);
        Set result = Collections.checkedSet(origin, Integer.class);
        try {
            result.add("e");
            fail("not passed");
        } catch (ClassCastException e) {
            System.out.println("testCheckedSet() passed");
        }
    }

    public static void testDisjoint() {
        List first = new ArrayList();
        first.add(5);
        List second = new ArrayList();
        second.add(4);
        assertEquals("testDisjoint()", true, Collections.disjoint(first, second));
    }

    public static void testFill() {
        List origin = new ArrayList();
        origin.add(2);
        origin.add(2);
        List result = new ArrayList();
        result.add(5);
        result.add(5);
        Collections.fill(origin, 5);
        assertEquals("testFill()", result, origin);
    }

    public static void testFrequency() {
        List origin = new ArrayList();
        origin.add(2);
        origin.add(2);
        assertEquals("testFrequency()", 2, Collections.frequency(origin, 2));
    }

    public static void testIndexOfSubList() {
        List origin = new ArrayList();
        origin.add(2);
        origin.add(2);
        List result = new ArrayList();
        result.add(2);
        assertEquals("testIndexOfSubList()", 0, Collections.indexOfSubList(origin, result));
    }

    public static void testLastIndexOfSubList() {
        List origin = new ArrayList();
        origin.add(2);
        origin.add(2);
        List result = new ArrayList();
        result.add(2);
        assertEquals("testLastIndexOfSubList()", 1, Collections.lastIndexOfSubList(origin, result));
    }

    public static void testMax() {
        List<String> origin = new ArrayList();
        origin.add("5");
        assertEquals("testMax()", "5", Collections.max(origin));
        assertEquals("testMaxWithComparator()", "5", Collections.max(origin, String.CASE_INSENSITIVE_ORDER));
    }

    public static void testMin() {
        List<String> origin = new ArrayList();
        origin.add("5");
        assertEquals("testMin()", "5", Collections.min(origin));
        assertEquals("testMinWithComparator()", "5", Collections.min(origin, String.CASE_INSENSITIVE_ORDER));
    }

    public static void testNCopies() {
        List origin = new ArrayList();
        origin.add(5);
        assertEquals("testNCopies()", origin, Collections.nCopies(1, 5));
    }

    public static void testNewSetFromMap() {
        Map<Integer, Boolean> origin = new HashMap();
        Set result = new HashSet();
        assertEquals("testNewSetFromMap()", result, Collections.newSetFromMap(origin));
    }

    public static void testReplaceAll() {
        List origin = new ArrayList();
        origin.add(5);
        List result = new ArrayList();
        result.add(1);
        Collections.replaceAll(origin, 5, 1);
        assertEquals("testNCopies()", result, origin);
    }

    public static void testReverse() {
        List origin = new ArrayList();
        origin.add(5);
        origin.add(1);
        List result = new ArrayList();
        result.add(1);
        result.add(5);
        Collections.reverse(origin);
        assertEquals("testReverse()", result, origin);
    }

    public static void testRotate() {
        List origin = new ArrayList();
        origin.add(5);
        origin.add(1);
        List result = new ArrayList();
        result.add(1);
        result.add(5);
        Collections.rotate(origin, 2);
        assertEquals("testRotate()", result, origin);
    }

    public static void testSort() {
        List origin1 = new ArrayList();
        origin1.add(3);
        origin1.add(2);
        origin1.add(1);
        List result1 = new ArrayList();
        result1.add(1);
        result1.add(2);
        result1.add(3);
        Collections.sort(origin1);
        assertEquals("testSort()", result1, origin1);
        List origin2 = new ArrayList();
        origin2.add("C");
        origin2.add("B");
        origin2.add("A");
        List result2 = new ArrayList();
        result2.add("A");
        result2.add("B");
        result2.add("C");
        Collections.sort(origin2, String.CASE_INSENSITIVE_ORDER);
        assertEquals("testSortWithComparator()", result2, origin2);
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