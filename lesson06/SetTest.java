package com.getjavajob.training.algo1702.gultiaeve.lesson06;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class SetTest {

    public static void main(String[] args) {
        testAdd();
        testAddAll();
    }

    public static void testAdd() {
        Set hashSet = new HashSet();
        assertEquals("testAddTrue", true, hashSet.add(1));
        assertEquals("testAddFalse", false, hashSet.add(1));
    }

    public static void testAddAll() {
        Set hashSet = new HashSet();
        List arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        assertEquals("testAddAllTrue", true, hashSet.addAll(arrayList));
        arrayList.clear();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
            arrayList.add(i);
        }
        assertEquals("testAddAllFalse", false, hashSet.addAll(arrayList));
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