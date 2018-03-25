package com.getjavajob.training.algo1702.gultiaeve.lesson04;


import java.util.ArrayList;
import java.util.List;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class SinglyLinkedListTest {

    public static void main(String[] args) {
        testAdd();
        testAddWithIndex();
        testGet();
        testSize();
        testReverse();
        testRemove();
    }

    public static void testAdd() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Object obj = new Object();
        singlyLinkedList.add(obj);
        assertEquals("testAdd", obj, singlyLinkedList.get(0));
    }

    public static void testAddWithIndex() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(1);
        singlyLinkedList.add(3);
        singlyLinkedList.add(2);
        singlyLinkedList.add(10, 0);
        assertEquals("testAddWithIndexInTheBeginning", 10, singlyLinkedList.get(0));
        singlyLinkedList.add(5, 1);
        assertEquals("testAddWithIndexInTheMiddle", 5, singlyLinkedList.get(1));
        singlyLinkedList.add(7, 2);
        assertEquals("testAddWithIndexInTheEnd", 7, singlyLinkedList.get(2));
    }

    public static void testRemove() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(3);
        singlyLinkedList.add(2);
        singlyLinkedList.add(5);
        singlyLinkedList.add(6);
        singlyLinkedList.remove(0);
        assertEquals("testRemoveFromTheBeginning", 2, singlyLinkedList.get(0));
        singlyLinkedList.remove(1);
        assertEquals("testRemove", 6, singlyLinkedList.get(1));
    }

    public static void testGet() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(10);
        assertEquals("testGet", 10, singlyLinkedList.get(0));
    }

    public static void testSize() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(10);
        assertEquals("testSize", 1, singlyLinkedList.size());
    }

    public static void testReverse() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        List arrayList = new ArrayList();
        singlyLinkedList.add(10);
        singlyLinkedList.add(11);
        singlyLinkedList.add(12);
        singlyLinkedList.add(13);
        singlyLinkedList.add(14);
        arrayList.add(14);
        arrayList.add(13);
        arrayList.add(12);
        arrayList.add(11);
        arrayList.add(10);
        singlyLinkedList.reverse();
        assertEquals("testReverse", arrayList, singlyLinkedList.asList());
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