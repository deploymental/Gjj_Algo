package com.getjavajob.training.algo1702.gultiaeve.lesson06;


import java.util.HashMap;
import java.util.Map;

import static com.getjavajob.training.algo1702.gultiaeve.util.StopWatch.getElapsedTime;
import static com.getjavajob.training.algo1702.gultiaeve.util.StopWatch.start;

public class AssociativeArrayPerformanceTest {

    public static void main(String[] args) {
        testAdd();
        testGet();
        testRemove();
    }

    public static void testAdd() {
        Map<Integer, Integer> hashMap = new HashMap();
        AssociativeArray<Integer, Integer> associativeArray = new AssociativeArray();

        start();
        for (int i = 0; i < 1000000; i++) {
            hashMap.put(i, i);
        }
        System.out.println("hashMap.put " + getElapsedTime());

        start();
        for (int i = 0; i < 1000000; i++) {
            associativeArray.add(i, i);
        }
        System.out.println("associativeArray.add " + getElapsedTime());
    }

    public static void testGet() {
        Map<Integer, Integer> hashMap = new HashMap();
        AssociativeArray<Integer, Integer> associativeArray = new AssociativeArray();

        start();
        for (int i = 0; i < 2000000; i++) {
            hashMap.put(i, i);
        }
        System.out.println("put(2000000) " + getElapsedTime());

        start();
        for (int i = 0; i < 2000000; i++) {
            associativeArray.add(i, i);
        }
        System.out.println("add(2000000) " + getElapsedTime());

        start();
        for (int i = 0; i < 2000000; i++) {
            int j = hashMap.get(i);
            if (i != j) {
                System.out.println("fail");
            }
        }
        System.out.println("hashMap.get(2000000)" + getElapsedTime());

        start();
        for (int i = 0; i < 2000000; i++) {
            int j = associativeArray.get(i);
            if (i != j) {
                System.out.println("fail");
            }
        }
        System.out.println("associativeArray.get(2000000) " + getElapsedTime());
    }

    public static void testRemove() {
        Map<Integer, Integer> hashMap = new HashMap();
        AssociativeArray<Integer, Integer> associativeArray = new AssociativeArray();

        start();
        for (int i = 0; i < 4000000; i++) {
            hashMap.put(i, i);
        }

        start();
        for (int i = 0; i < 4000000; i++) {
            associativeArray.add(i, i);
        }

        start();
        for (int i = 0; i < 4000000; i++) {
            hashMap.remove(i);
        }
        System.out.println("doublyLinkedList.remove(2000000) " + getElapsedTime());

        start();
        for (int i = 0; i < 4000000; i++) {
            associativeArray.remove(i);
        }
        System.out.println("linkedList.remove(2000000) " + getElapsedTime());
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