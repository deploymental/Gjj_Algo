package com.getjavajob.training.algo1702.gultiaeve.lesson06;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class LinkedHashSetTest {

    public static void main(String[] args) {
        testAdd();
        testAddAll();
    }

    public static void testAdd() {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(100);
        assertEquals("testAdd", new Integer(100), linkedHashSet.iterator().next());
    }

    public static void testAddAll() {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        List<Integer> arrayList = new ArrayList();
        arrayList.add(100);
        linkedHashSet.addAll(arrayList);
        assertEquals("testAddAll", new Integer(100), linkedHashSet.iterator().next());
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