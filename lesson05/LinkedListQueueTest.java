package com.getjavajob.training.algo1702.gultiaeve.lesson05;


import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class LinkedListQueueTest {

    public static void main(String[] args) {
        testAdd();
        testRemove();
    }

    public static void testRemove() {
        LinkedListQueue<Integer> linkQueue = new LinkedListQueue<>();
        linkQueue.add(13);
        linkQueue.add(12);
        linkQueue.add(11);
        linkQueue.remove();
        assertEquals("testRemove()", "12 11 ", linkQueue.toString());
    }

    public static void testAdd() {
        LinkedListQueue<Integer> linkQueue = new LinkedListQueue<>();
        linkQueue.add(13);
        linkQueue.add(12);
        linkQueue.add(11);
        assertEquals("testAdd()", "13 12 11 ", linkQueue.toString());
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