package com.getjavajob.training.algo1702.gultiaeve.lesson04;


import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import static com.getjavajob.training.algo1702.gultiaeve.util.StopWatch.getElapsedTime;
import static com.getjavajob.training.algo1702.gultiaeve.util.StopWatch.start;

public class DoublyLinkedListPerformanceTest {

    public static void main(String[] args) {
        testAddToTheEnd();
        testAddInFirstPosition();
        testAddInMiddlePosition();
        testAddInLastPosition();
        testObjectReturnRemoveFromFirstPosition();
        testObjectReturnRemoveFromMiddlePosition();
        testObjectReturnRemoveFromLastPosition();
        testBooleanReturnRemoveFromFirstPosition();
        testBooleanReturnRemoveFromMiddlePosition();
        testBooleanReturnRemoveFromLastPosition();
        testObjectReturnRemoveFromLastPosition();
    }

    private static void inicializeArrs(LinkedList linkedList, DoublyLinkedList doublyLinkedList) {
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        doublyLinkedList.add(1);
        doublyLinkedList.add(1);
        doublyLinkedList.add(1);
    }

    public static void testAddToTheEnd() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Collection linkedList = new LinkedList();
        inicializeArrs((LinkedList) linkedList, doublyLinkedList);

        start();
        for (int i = 0; i < 5000000; i++) {
            doublyLinkedList.add(i);
        }
        System.out.println(" doublyLinkedList.add(1000000) " + getElapsedTime());

        start();
        for (int i = 0; i < 5000000; i++) {
            linkedList.add(i);
        }
        System.out.println("linkedList.add(1000000) " + getElapsedTime());
    }

    public static void testAddInFirstPosition() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        List linkedList = new LinkedList();
        inicializeArrs((LinkedList) linkedList, doublyLinkedList);

        start();
        for (int i = 0; i < 3000000; i++) {
            doublyLinkedList.add(1, i);
        }
        System.out.println("doublyLinkedList.add(0, 100000) " + getElapsedTime());

        start();
        for (int i = 0; i < 3000000; i++) {
            linkedList.add(1, i);
        }
        System.out.println("linkedList.add(0, 100000) " + getElapsedTime());
    }

    public static void testAddInMiddlePosition() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        List linkedList = new LinkedList();
        inicializeArrs((LinkedList) linkedList, doublyLinkedList);

        start();
        for (int i = 0; i < 300000; i++) {
            doublyLinkedList.add(doublyLinkedList.size() >> 1, 100000);
        }
        System.out.println("doublyLinkedList.add(doublyLinkedList.size() >> 1, 100000) " + getElapsedTime());

        start();
        for (int i = 0; i < 300000; i++) {
            linkedList.add(linkedList.size() >> 1, 100000);
        }
        System.out.println("linkedList.add(linkedList.size() >> 1, 100000) " + getElapsedTime());
    }

    public static void testAddInLastPosition() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        List linkedList = new LinkedList();
        inicializeArrs((LinkedList) linkedList, doublyLinkedList);

        start();
        for (int i = 0; i < 30000000; i++) {
            doublyLinkedList.add(doublyLinkedList.size() - 1, i - 1);
        }
        System.out.println("doublyLinkedList.add(doublyLinkedList.size() - 1, i - 1) " + getElapsedTime());

        start();
        for (int i = 0; i < 30000000; i++) {
            linkedList.add(linkedList.size() - 1, i - 1);
        }
        System.out.println("linkedList.add(linkedList.size() - 1, i - 1) " + getElapsedTime());
    }

    public static void testObjectReturnRemoveFromFirstPosition() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Collection linkedList = new LinkedList();
        for (int i = 0; i < 300000; i++) {
            linkedList.add(1);
            doublyLinkedList.add(1);
        }

        start();
        for (int i = 0; i < 300000; i++) {
            doublyLinkedList.remove(0);
        }
        System.out.println("doublyLinkedList.remove(0) " + getElapsedTime());

        start();
        for (int i = 0; i < 300000; i++) {
            linkedList.remove(0);
        }
        System.out.println("linkedList.remove(0) " + getElapsedTime());
    }

    public static void testObjectReturnRemoveFromMiddlePosition() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Collection linkedList = new LinkedList();
        for (int i = 0; i < 50000; i++) {
            linkedList.add(1);
            doublyLinkedList.add(1);
        }

        start();
        for (int i = 0; i < 50000; i++) {
            doublyLinkedList.remove(doublyLinkedList.size() >> 1);
        }
        System.out.println("doublyLinkedList.remove(doublyLinkedList.size() >> 1) " + getElapsedTime());

        start();
        for (int i = 0; i < 50000; i++) {
            linkedList.remove(linkedList.size() >> 1);
        }
        System.out.println("linkedList.remove(linkedList.size() >> 1) " + getElapsedTime());
    }

    public static void testObjectReturnRemoveFromLastPosition() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Collection linkedList = new LinkedList();
        for (int i = 0; i < 3000000; i++) {
            linkedList.add(1);
            doublyLinkedList.add(1);
        }

        start();
        for (int i = 0; i < 3000000; i++) {
            doublyLinkedList.remove(doublyLinkedList.size() - 1);
        }
        System.out.println("doublyLinkedList.remove(doublyLinkedList.size() - 1) " + getElapsedTime());

        start();
        for (int i = 0; i < 3000000; i++) {
            linkedList.remove(linkedList.size() - 1);
        }
        System.out.println("linkedList.remove(linkedList.size() - 1) " + getElapsedTime());
    }

    public static void testBooleanReturnRemoveFromFirstPosition() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Collection linkedList = new LinkedList();
        Object obj = 1;
        for (int i = 0; i < 3000000; i++) {
            linkedList.add(obj);
            doublyLinkedList.add(obj);
        }

        start();
        for (int i = 0; i < 3000000; i++) {
            doublyLinkedList.remove(obj);
        }
        System.out.println("doublyLinkedList.remove(obj) " + getElapsedTime());

        start();
        for (int i = 0; i < 3000000; i++) {
            linkedList.remove(obj);
        }
        System.out.println("linkedList.remove(obj) " + getElapsedTime());
    }

    public static void testBooleanReturnRemoveFromMiddlePosition() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        List linkedList = new LinkedList();
        Object obj = 1;
        for (int i = 0; i < 500000; i++) {
            linkedList.add(1);
            doublyLinkedList.add(1);
        }

        start();
        for (int i = 0; i < 500000; i++) {
            doublyLinkedList.remove(obj);
            doublyLinkedList.add(doublyLinkedList.size() >> 1, obj);
        }
        System.out.println("doublyLinkedList.remove(obj) " + getElapsedTime());

        start();
        for (int i = 0; i < 500000; i++) {
            linkedList.remove(obj);
            linkedList.add(linkedList.size() >> 1, obj);
        }
        System.out.println("linkedList.remove(obj) " + getElapsedTime());
    }

    public static void testBooleanReturnRemoveFromLastPosition() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        List linkedList = new LinkedList();
        Object obj = 1;
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(1);
            doublyLinkedList.add(1);
        }

        start();
        for (int i = 0; i < 1000000; i++) {
            doublyLinkedList.remove(obj);
            doublyLinkedList.add(doublyLinkedList.size() - 1, obj);
        }
        System.out.println("doublyLinkedList.remove(obj) " + getElapsedTime());

        start();
        for (int i = 0; i < 1000000; i++) {
            linkedList.remove(obj);
            linkedList.add(linkedList.size() - 1, obj);
        }
        System.out.println("linkedList.remove(obj) " + getElapsedTime());
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