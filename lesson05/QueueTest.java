package com.getjavajob.training.algo1702.gultiaeve.lesson05;


import java.util.LinkedList;
import java.util.Queue;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;
import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.fail;

public class QueueTest {

    public static void main(String[] args) {
        queueAddTest();
        queueOfferTest();
        queueRemoveTest();
        queuePollTest();
        queueElementTest();
        queuePeekTest();
    }

    public static void queueAddTest() {
        Queue<Integer> queue = new LinkedList();
        assertEquals("queueAddTest()", true, queue.add(Integer.MAX_VALUE * Integer.MAX_VALUE));
    }

    public static void queueOfferTest() {
        Queue<Integer> queue = new LinkedList();
        assertEquals("queueOfferTest()", true, queue.offer(12));
    }

    public static void queueRemoveTest() {
        Queue<Integer> queue = new LinkedList();

        String msg = "NoSuchElementException";
        try {
            queue.remove();
            fail(msg);
        } catch (Exception e) {
            assertEquals("queueRemoveTestFail()", msg, e.getClass().getSimpleName());
        }

        queue.add(12);
        try {
            queue.remove();
            fail(msg);
        } catch (Exception e) {
            assertEquals("queueRemoveTestFail", msg, e.getClass().getSimpleName());
        } catch (AssertionError e) {
            assertEquals("queueRemoveTestOk()", "AssertionError", e.getClass().getSimpleName());
        }
    }

    public static void queuePollTest() {
        Queue<Integer> queue = new LinkedList();
        String msg = "NullPointerException";
        try {
            int temp = queue.poll();
            fail(msg);
        } catch (Exception e) {
            assertEquals("queuePollTest()", msg, e.getClass().getSimpleName());
        }
    }

    public static void queueElementTest() {
        Queue<Integer> queue = new LinkedList();
        String msg = "NoSuchElementException";
        try {
            int temp = queue.element();
            fail(msg);
        } catch (Exception e) {
            assertEquals("queueElementTestTest()", msg, e.getClass().getSimpleName());
        }
    }

    public static void queuePeekTest() {
        Queue<Integer> queue = new LinkedList();
        String msg = "NullPointerException";
        try {
            int temp = queue.peek();
            fail(msg);
        } catch (Exception e) {
            assertEquals("queuePeekTest()", msg, e.getClass().getSimpleName());
        }
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