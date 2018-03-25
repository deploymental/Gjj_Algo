package com.getjavajob.training.algo1702.gultiaeve.lesson04;


import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import static com.getjavajob.training.algo1702.gultiaeve.util.StopWatch.getElapsedTime;
import static com.getjavajob.training.algo1702.gultiaeve.util.StopWatch.start;

public class JdkListsPerformanceTest {

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
    }

    private static void inicializeArrs(LinkedList linkedList, ArrayList arrayList) {
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
    }

    public static void testAddToTheEnd() {
        Collection arrayList = new ArrayList();
        Collection linkedList = new LinkedList();
        inicializeArrs((LinkedList) linkedList, (ArrayList) arrayList);

        start();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        System.out.println(" arrayList.add(1000000) " + getElapsedTime());

        start();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        System.out.println("linkedList.add(1000000) " + getElapsedTime());
    }

    public static void testAddInFirstPosition() {
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        inicializeArrs((LinkedList) linkedList, (ArrayList) arrayList);

        start();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(1, i);
        }
        System.out.println("arrayList.add(0, 100000) " + getElapsedTime());

        start();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(1, i);
        }
        System.out.println("linkedList.add(0, 100000) " + getElapsedTime());
    }

    public static void testAddInMiddlePosition() {
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        inicializeArrs((LinkedList) linkedList, (ArrayList) arrayList);

        start();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(arrayList.size() >> 1, 100000);
        }
        System.out.println("arrayList.add(arrayList.size() >> 1, 100000) " + getElapsedTime());

        start();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(linkedList.size() >> 1, 100000);
        }
        System.out.println("linkedList.add(linkedList.size() >> 1, 100000) " + getElapsedTime());
    }

    public static void testAddInLastPosition() {
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        inicializeArrs((LinkedList) linkedList, (ArrayList) arrayList);

        start();
        for (int i = 0; i < 10000000; i++) {
            arrayList.add(arrayList.size() - 1, i - 1);
        }
        System.out.println("arrayList.add(arrayList.size() - 1, i - 1) " + getElapsedTime());

        start();
        for (int i = 0; i < 10000000; i++) {
            linkedList.add(linkedList.size() - 1, i - 1);
        }
        System.out.println("linkedList.add(linkedList.size() - 1, i - 1) " + getElapsedTime());
    }

    public static void testObjectReturnRemoveFromFirstPosition() {
        Collection arrayList = new ArrayList();
        Collection linkedList = new LinkedList();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(1);
            arrayList.add(1);
        }

        start();
        for (int i = 0; i < 100000; i++) {
            arrayList.remove(0);
        }
        System.out.println("arrayList.remove(0) " + getElapsedTime());

        start();
        for (int i = 0; i < 100000; i++) {
            linkedList.remove(0);
        }
        System.out.println("linkedList.remove(0) " + getElapsedTime());
    }

    public static void testObjectReturnRemoveFromMiddlePosition() {
        Collection arrayList = new ArrayList();
        Collection linkedList = new LinkedList();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(1);
            arrayList.add(1);
        }

        start();
        for (int i = 0; i < 100000; i++) {
            arrayList.remove(arrayList.size() >> 1);
        }
        System.out.println("arrayList.remove(arrayList.size() >> 1) " + getElapsedTime());

        start();
        for (int i = 0; i < 100000; i++) {
            linkedList.remove(linkedList.size() >> 1);
        }
        System.out.println("linkedList.remove(linkedList.size() >> 1) " + getElapsedTime());
    }

    public static void testObjectReturnRemoveFromLastPosition() {
        Collection arrayList = new ArrayList();
        Collection linkedList = new LinkedList();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(1);
            arrayList.add(1);
        }

        start();
        for (int i = 0; i < 1000000; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        System.out.println("arrayList.remove(arrayList.size() - 1) " + getElapsedTime());

        start();
        for (int i = 0; i < 1000000; i++) {
            linkedList.remove(linkedList.size() - 1);
        }
        System.out.println("linkedList.remove(linkedList.size() - 1) " + getElapsedTime());
    }

    public static void testBooleanReturnRemoveFromFirstPosition() {
        Collection arrayList = new ArrayList();
        Collection linkedList = new LinkedList();
        Object obj = 1;
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(obj);
            arrayList.add(obj);
        }

        start();
        for (int i = 0; i < 1000000; i++) {
            arrayList.remove(obj);
        }
        System.out.println("arrayList.remove(obj) BooleanRemoveFromFirstPosition " + getElapsedTime());

        start();
        for (int i = 0; i < 1000000; i++) {
            linkedList.remove(obj);
        }
        System.out.println("linkedList.remove(obj) BooleanRemoveFromFirstPosition " + getElapsedTime());
    }

    public static void testBooleanReturnRemoveFromMiddlePosition() {
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        Object obj = 1;
        for (int i = 0; i < 100000; i++) {
            linkedList.add(1);
            arrayList.add(1);
        }

        start();
        for (int i = 0; i < 100000; i++) {
            arrayList.remove(obj);
            arrayList.add(arrayList.size() >> 1, obj);
        }
        System.out.println("arrayList.remove(obj) BooleanRemoveFromMiddlePosition " + getElapsedTime());

        start();
        for (int i = 0; i < 100000; i++) {
            linkedList.remove(obj);
            linkedList.add(linkedList.size() >> 1, obj);
        }
        System.out.println("linkedList.remove(obj) BooleanRemoveFromMiddlePosition " + getElapsedTime());
    }

    public static void testBooleanReturnRemoveFromLastPosition() {
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        Object obj = 1;
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(1);
            arrayList.add(1);
        }

        start();
        for (int i = 0; i < 1000000; i++) {
            arrayList.remove(obj);
            arrayList.add(arrayList.size() - 1, obj);
        }
        System.out.println("arrayList.remove(obj) BooleanRemoveFromLastPosition " + getElapsedTime());

        start();
        for (int i = 0; i < 1000000; i++) {
            linkedList.remove(obj);
            linkedList.add(linkedList.size() - 1, obj);
        }
        System.out.println("linkedList.remove(obj) BooleanRemoveFromLastPosition " + getElapsedTime());
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