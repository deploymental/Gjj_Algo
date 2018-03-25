package com.getjavajob.training.algo1702.gultiaeve.lesson04;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class CollectionTest {

    public static void main(String[] args) {
        testSize();
        testIsEmpty();
        testContains();
        testIterator();
        testToArray();
        testAdd();
        testRemove();
        testAddAll();
        testClear();
        testRetainAll();
        testRemoveAll();
        testContainsAll();
        testToArrayReturningArray();
    }

    public static void testSize() {
        Collection<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(1);
        assertEquals("testSize", 2, arrayList.size());
    }

    public static void testIsEmpty() {
        Collection<Integer> arrayList = new ArrayList();
        assertEquals("isEmptyTrue", true, arrayList.isEmpty());
        arrayList.add(1);
        assertEquals("isEmptyFalse", false, arrayList.isEmpty());
    }

    public static void testContains() {
        Collection arrayList = new ArrayList();
        Object obj = new Object();
        arrayList.add(obj);
        assertEquals("contains", true, arrayList.contains(obj));
    }

    public static void testIterator() {
        Collection<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        assertEquals("iterator", new Integer(1), arrayList.iterator().next());
    }

    public static void testToArray() {
        Collection<Integer> arrayList = new ArrayList();
        Integer[] array = new Integer[2];
        arrayList.add(111);
        arrayList.add(222);
        array[0] = 111;
        array[1] = 222;
        assertEquals("testToArray", array, arrayList.toArray());
    }

    public static void testAdd() {
        List<Integer> arrayList = new ArrayList();
        arrayList.add(111);
        assertEquals("testAdd", new Integer(111), arrayList.get(0));
    }

    public static void testRemove() {
        List arrayList = new ArrayList();
        Object obj = new Object();
        arrayList.add(obj);
        arrayList.add(222);
        arrayList.remove(obj);
        assertEquals("testRemove", 222, arrayList.get(0));
    }

    public static void testAddAll() {
        List<Integer> arrayList = new ArrayList();
        Collection<Integer> arrayList1 = new ArrayList();
        arrayList1.add(333);
        arrayList.addAll(arrayList1);
        assertEquals("testAddAll", new Integer(333), arrayList.get(0));
    }

    public static void testClear() {
        Collection<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.clear();
        assertEquals("testClear", true, arrayList.isEmpty());
    }

    public static void testRetainAll() {
        List<Integer> arrayList = new ArrayList();
        Collection<Integer> arrayList1 = new ArrayList();
        arrayList.add(111);
        arrayList.add(555);
        arrayList1.add(555);
        arrayList.retainAll(arrayList1);
        assertEquals("testRetainAll", new Integer(555), arrayList.get(0));
    }

    public static void testRemoveAll() {
        List<Integer> arrayList = new ArrayList();
        Collection<Integer> arrayList1 = new ArrayList();
        arrayList.add(111);
        arrayList.add(555);
        arrayList1.add(111);
        arrayList.removeAll(arrayList1);
        assertEquals("testRemoveAll", new Integer(555), arrayList.get(0));
    }

    public static void testContainsAll() {
        Collection<Integer> arrayList = new ArrayList();
        Collection<Integer> arrayList1 = new ArrayList();
        arrayList.add(111);
        arrayList1.add(111);
        assertEquals("testRemoveAllTrue", true, arrayList.containsAll(arrayList1));
        arrayList1.add(555);
        assertEquals("testRemoveAllFalse", false, arrayList.containsAll(arrayList1));
    }

    public static void testToArrayReturningArray() {
        Collection<Integer> arrayList = new ArrayList();
        Integer[] array = new Integer[3];
        arrayList.add(111);
        arrayList.add(222);
        arrayList.add(333);
        arrayList.toArray(array);
        assertEquals("testToArray", array, arrayList.toArray());
    }
}
/*
Violation 1(redundant var) - not found
Violation 2(redundant inicialisation) - not found
Violation 3(wrong interface) - found
Violation 4(bad naming) - not found
Violation 5(redundant this) - not found
Violation 6(bad casting) - not found
Violation 7(static import) - not found
*/