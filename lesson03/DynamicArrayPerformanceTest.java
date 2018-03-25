package com.getjavajob.training.algo1702.gultiaeve.lesson03;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.getjavajob.training.algo1702.gultiaeve.util.StopWatch.getElapsedTime;
import static com.getjavajob.training.algo1702.gultiaeve.util.StopWatch.start;

public class DynamicArrayPerformanceTest {

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


    private static void inicializeArrs(ArrayList arrayList, DynamicArray dynamicArray) {
        dynamicArray.add(1);
        dynamicArray.add(1);
        dynamicArray.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
    }

    public static void testAddToTheEnd() {
        DynamicArray dynamicArray = new DynamicArray();
        Collection<Object> arrayList = new ArrayList();
        inicializeArrs((ArrayList) arrayList, dynamicArray);

        start();
        for (int i = 0; i < 10000000; i++) {
            dynamicArray.add(1000000);
        }
        System.out.println("dynamicArray.add(1000000) " + getElapsedTime());

        start();
        for (int i = 0; i < 10000000; i++) {
            arrayList.add(1000000);
        }
        System.out.println("arrayList.add(1000000) " + getElapsedTime());
    }

    public static void testAddInFirstPosition() {
        DynamicArray dynamicArray = new DynamicArray();
        List<Object> arrayList = new ArrayList();
        inicializeArrs((ArrayList) arrayList, dynamicArray);

        start();
        for (int i = 0; i < 300000; i++) {
            dynamicArray.add(0, 100000);
        }
        System.out.println("dynamicArray.add(0, 100000) " + getElapsedTime());

        start();
        for (int i = 0; i < 300000; i++) {
            arrayList.add(0, 100000);
        }
        System.out.println("arrayList.add(0, 100000) " + getElapsedTime());
    }

    public static void testAddInMiddlePosition() {
        DynamicArray dynamicArray = new DynamicArray();
        List<Object> arrayList = new ArrayList();
        inicializeArrs((ArrayList) arrayList, dynamicArray);

        start();
        for (int i = 0; i < 300000; i++) {
            dynamicArray.add(dynamicArray.size() >> 1, 100000);
        }
        System.out.println("dynamicArray.add(dynamicArray.size() >> 1, 100000) " + getElapsedTime());

        start();
        for (int i = 0; i < 300000; i++) {
            arrayList.add(arrayList.size() >> 1, 100000);
        }
        System.out.println("arrayList.add(arrayList.size() >> 1, 100000) " + getElapsedTime());
    }

    public static void testAddInLastPosition() {
        DynamicArray dynamicArray = new DynamicArray();
        List<Object> arrayList = new ArrayList();
        inicializeArrs((ArrayList) arrayList, dynamicArray);

        start();
        for (int i = 0; i < 30000000; i++) {
            dynamicArray.add(dynamicArray.size() - 1, i - 1);
        }
        System.out.println("dynamicArray.add(dynamicArray.size() - 1, i - 1) " + getElapsedTime());

        start();
        for (int i = 0; i < 30000000; i++) {
            arrayList.add(arrayList.size() - 1, i - 1);
        }
        System.out.println("arrayList.add(arrayList.size() - 1, i - 1) " + getElapsedTime());
    }

    public static void testObjectReturnRemoveFromFirstPosition() {
        DynamicArray dynamicArray = new DynamicArray();
        Collection<Object> arrayList = new ArrayList();
        for (int i = 0; i < 300000; i++) {
            arrayList.add(1);
            dynamicArray.add(1);
        }

        start();
        for (int i = 0; i < 300000; i++) {
            dynamicArray.remove(0);
        }
        System.out.println("dynamicArray.remove(0) " + getElapsedTime());

        start();
        for (int i = 0; i < 300000; i++) {
            arrayList.remove(0);
        }
        System.out.println("arrayList.remove(0) " + getElapsedTime());
    }

    public static void testObjectReturnRemoveFromMiddlePosition() {
        DynamicArray dynamicArray = new DynamicArray();
        Collection<Object> arrayList = new ArrayList();
        for (int i = 0; i < 300000; i++) {
            arrayList.add(1);
            dynamicArray.add(1);
        }

        start();
        for (int i = 0; i < 300000; i++) {
            dynamicArray.remove(dynamicArray.size() >> 1);
        }
        System.out.println("dynamicArray.remove(dynamicArray.size() >> 1) " + getElapsedTime());

        start();
        for (int i = 0; i < 300000; i++) {
            arrayList.remove(arrayList.size() >> 1);
        }
        System.out.println("arrayList.remove(arrayList.size() >> 1) " + getElapsedTime());
    }

    public static void testObjectReturnRemoveFromLastPosition() {
        DynamicArray dynamicArray = new DynamicArray();
        Collection<Object> arrayList = new ArrayList();
        for (int i = 0; i < 30000000; i++) {
            arrayList.add(1);
            dynamicArray.add(1);
        }

        start();
        for (int i = 0; i < 30000000; i++) {
            dynamicArray.remove(dynamicArray.size() - 1);
        }
        System.out.println("dynamicArray.remove(dynamicArray.size() - 1) " + getElapsedTime());

        start();
        for (int i = 0; i < 30000000; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        System.out.println("arrayList.remove(arrayList.size() - 1) " + getElapsedTime());
    }

    public static void testBooleanReturnRemoveFromFirstPosition() {
        DynamicArray dynamicArray = new DynamicArray();
        Collection<Object> arrayList = new ArrayList();
        Object obj = 1;
        for (int i = 0; i < 300000; i++) {
            arrayList.add(obj);
            dynamicArray.add(obj);
        }

        start();
        for (int i = 0; i < 300000; i++) {
            dynamicArray.remove(obj);
        }
        System.out.println("dynamicArray.remove(obj) " + getElapsedTime());

        start();
        for (int i = 0; i < 300000; i++) {
            arrayList.remove(obj);
        }
        System.out.println("arrayList.remove(obj) " + getElapsedTime());
    }

    public static void testBooleanReturnRemoveFromMiddlePosition() {
        DynamicArray dynamicArray = new DynamicArray();
        List<Object> arrayList = new ArrayList();
        Object obj = 1;
        for (int i = 0; i < 100000; i++) {
            arrayList.add(1);
            dynamicArray.add(1);
        }

        start();
        for (int i = 0; i < 100000; i++) {
            dynamicArray.remove(obj);
            dynamicArray.add(dynamicArray.size() >> 1, obj);
        }
        System.out.println("dynamicArray.remove(obj) " + getElapsedTime());

        start();
        for (int i = 0; i < 100000; i++) {
            arrayList.remove(obj);
            arrayList.add(arrayList.size() >> 1, obj);
        }
        System.out.println("arrayList.remove(obj) " + getElapsedTime());
    }

    public static void testBooleanReturnRemoveFromLastPosition() {
        DynamicArray dynamicArray = new DynamicArray();
        List<Object> arrayList = new ArrayList();
        Object obj = 1;
        for (int i = 0; i < 100000; i++) {
            arrayList.add(1);
            dynamicArray.add(1);
        }

        start();
        for (int i = 0; i < 100000; i++) {
            dynamicArray.remove(obj);
            dynamicArray.add(dynamicArray.size() - 1, obj);
        }
        System.out.println("dynamicArray.remove(obj) " + getElapsedTime());

        start();
        for (int i = 0; i < 100000; i++) {
            arrayList.remove(obj);
            arrayList.add(arrayList.size() - 1, obj);
        }
        System.out.println("arrayList.remove(obj) " + getElapsedTime());
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