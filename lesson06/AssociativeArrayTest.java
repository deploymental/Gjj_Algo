package com.getjavajob.training.algo1702.gultiaeve.lesson06;


import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class AssociativeArrayTest {

    public static void main(String[] args) {
        testAddAndGet();
        testAddAndGetWithNull();
        testRemove();
        testRehash();
    }

    public static void testAddAndGet() {
        AssociativeArray<String, Integer> associativeArray = new AssociativeArray<>();
        associativeArray.add("random", 1);
        associativeArray.add("polygenelubricants", 2);
        associativeArray.add("polygenelubricants", 3);
        assertEquals("testAddAndGet", new Integer(1), associativeArray.get("random"));
        assertEquals("testAddExisting", new Integer(3), associativeArray.get("polygenelubricants"));
    }

    public static void testAddAndGetWithNull() {
        AssociativeArray<String, Integer> associativeArray = new AssociativeArray<>();
        associativeArray.add(null, 2);
        associativeArray.add(null, 3);
        assertEquals("testAddAndGetWithNull", new Integer(3), associativeArray.get(null));
    }

    public static void testRemove() {
        AssociativeArray<String, Integer> associativeArray = new AssociativeArray<>();
        associativeArray.add("key", 1);
        assertEquals("testRemove", new Integer(1), associativeArray.remove("key"));
    }

    public static void testRehash() {
        AssociativeArray<String, Integer> associativeArray = new AssociativeArray<>(3);
        associativeArray.add("key", 1);
        associativeArray.add("key1", 2);
        associativeArray.add("key2", 3);
        associativeArray.add("key3", 4);
        associativeArray.add("key4", 5);
        assertEquals("testRehash", new Integer(4), associativeArray.get("key3"));
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