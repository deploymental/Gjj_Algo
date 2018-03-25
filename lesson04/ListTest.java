package com.getjavajob.training.algo1702.gultiaeve.lesson04;


import java.util.ArrayList;
import java.util.List;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class ListTest {

    public static void main(String[] args) {
        testAddAll();
        testGet();
        testSet();
        testAdd();
        testRemove();
        testIndexOf();
        testLastIndexOf();
        testListIterator();
        testListIteratorWithIndex();
        testSubList();
    }

    public static void testAddAll() {
        List<Integer> arrayList = new ArrayList();
        List<Integer> arrayList1 = new ArrayList();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList.addAll(0, arrayList1);
        assertEquals("addAll(int, collection)", arrayList1, arrayList);
    }

    public static void testGet() {
        List<Integer> arrayList = new ArrayList();
        arrayList.add(111);
        assertEquals("testGet", new Integer(111), arrayList.get(0));
    }

    public static void testSet() {
        List<Integer> arrayList = new ArrayList();
        arrayList.add(111);
        arrayList.set(0, 555);
        assertEquals("testSet", new Integer(555), arrayList.get(0));
    }

    public static void testAdd() {
        List<Integer> arrayList = new ArrayList();
        arrayList.add(111);
        arrayList.add(0, 555);
        assertEquals("testGet", new Integer(555), arrayList.get(0));
    }

    public static void testRemove() {
        List<Integer> arrayList = new ArrayList();
        arrayList.add(111);
        arrayList.add(555);
        arrayList.remove(0);
        assertEquals("testGet", new Integer(555), arrayList.get(0));
    }

    public static void testIndexOf() {
        List arrayList = new ArrayList();
        Object obj = new Object();
        arrayList.add(111);
        arrayList.add(obj);
        assertEquals("testGet", 1, arrayList.indexOf(obj));
    }

    public static void testLastIndexOf() {
        List arrayList = new ArrayList();
        Object obj = new Object();
        arrayList.add(obj);
        arrayList.add(obj);
        assertEquals("testGet", 1, arrayList.lastIndexOf(obj));
    }

    public static void testListIterator() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        assertEquals("testListIterator", new Integer(1), arrayList.listIterator().next());
    }

    public static void testListIteratorWithIndex() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        assertEquals("testListIterator", new Integer(2), arrayList.listIterator(1).next());
    }

    public static void testSubList() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayListSubList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < 5; i++) {
            arrayListSubList.add(i);
        }
        assertEquals("testSubList", arrayListSubList, arrayList.subList(0, 5));
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