package com.getjavajob.training.algo1702.gultiaeve.lesson05;


import java.util.ArrayDeque;
import java.util.Deque;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class DequeTest {

    public static void main(String[] args) {
        testAddAddFirstAndRemoveFirst();
        testAddLastAndRemoveLast();
        testOfferFirst();
        testOfferLast();
        testPoll();
        testGetFirst();
        testGetLast();
        testPeekFirst();
        testPeekLast();
        testRemoveFirstOccurrence();
        testRemoveLastOccurrence();
        testOffer();
        testElement();
        testPeek();
        testPush();
        testPop();
        testContains();
        testSize();
    }

    public static void testAddAddFirstAndRemoveFirst() {
        Deque<Integer> deque = new ArrayDeque();
        deque.addFirst(123);
        assertEquals("testAddFirstRemoveFirst", new Integer(123), deque.removeFirst());
        deque.add(234);
        assertEquals("testAddRemove", new Integer(234), deque.remove());
    }

    public static void testAddLastAndRemoveLast() {
        Deque<Integer> deque = new ArrayDeque(1);
        deque.addLast(123);
        deque.addLast(234);
        assertEquals("testAddLastRemoveLast", new Integer(234), deque.removeLast());
    }

    public static void testOfferFirst() {
        Deque<Integer> deque = new ArrayDeque(1);
        deque.offerFirst(123);
        deque.offerFirst(234);
        assertEquals("testOfferFirst", new Integer(234), deque.removeFirst());
    }

    public static void testOfferLast() {
        Deque<Integer> deque = new ArrayDeque(1);
        deque.offerLast(123);
        deque.offerLast(234);
        assertEquals("testOfferFirst", new Integer(234), deque.removeLast());
    }

    public static void testPoll() {
        Deque<Integer> deque = new ArrayDeque();
        deque.addFirst(123);
        assertEquals("testPoll", new Integer(123), deque.poll());
        assertEquals("testPollIfItIsNull", null, deque.poll());
    }

    public static void testGetFirst() {
        Deque<Integer> deque = new ArrayDeque();
        deque.addFirst(123);
        assertEquals("testGetFirst", new Integer(123), deque.getFirst());
    }

    public static void testGetLast() {
        Deque<Integer> deque = new ArrayDeque();
        deque.addLast(123);
        assertEquals("testGetFirst", new Integer(123), deque.getLast());
    }

    public static void testPeekFirst() {
        Deque<Integer> deque = new ArrayDeque();
        deque.addFirst(123);
        assertEquals("testPeekFirst", new Integer(123), deque.peekFirst());
        deque.removeFirst();
        assertEquals("testPeekFirstWithEmptyDeque", null, deque.peekFirst());
    }

    public static void testPeekLast() {
        Deque<Integer> deque = new ArrayDeque();
        deque.addLast(123);
        assertEquals("PeekLast", new Integer(123), deque.peekLast());
        deque.removeLast();
        assertEquals("PeekLastWithEmptyDeque", null, deque.peekLast());
    }

    public static void testRemoveFirstOccurrence() {
        Deque<Integer> deque = new ArrayDeque();
        deque.addFirst(123);
        deque.addLast(234);
        deque.addLast(123);
        deque.removeFirstOccurrence(123);
        assertEquals("testRemoveFirstOccurrence", new Integer(123), deque.getLast());
    }

    public static void testRemoveLastOccurrence() {
        Deque<Integer> deque = new ArrayDeque();
        deque.addFirst(123);
        deque.addLast(234);
        deque.addLast(123);
        deque.removeLastOccurrence(123);
        assertEquals("testRemoveLastOccurrence", new Integer(123), deque.getFirst());
    }

    public static void testOffer() {
        Deque<Integer> deque = new ArrayDeque(1);
        deque.offer(123);
        deque.offer(234);
        assertEquals("testOffer", new Integer(234), deque.removeLast());
    }

    public static void testElement() {
        Deque<Integer> deque = new ArrayDeque();
        deque.addFirst(123);
        assertEquals("testElement", deque.element(), deque.getFirst());
    }

    public static void testPeek() {
        Deque<Integer> deque = new ArrayDeque();
        deque.addFirst(123);
        assertEquals("testElement", deque.element(), deque.getFirst());
        deque.removeFirst();
        assertEquals("testElementWithEmptyDeque", null, deque.peek());
    }

    public static void testPush() {
        Deque<Integer> deque = new ArrayDeque(1);
        deque.push(123);
        assertEquals("testPush", new Integer(123), deque.removeLast());
    }

    public static void testPop() {
        Deque<Integer> deque = new ArrayDeque();
        deque.addFirst(123);
        assertEquals("testAddFirstRemoveFirst", new Integer(123), deque.pop());
    }

    public static void testContains() {
        Deque<Integer> deque = new ArrayDeque();
        deque.addFirst(123);
        assertEquals("testContains", true, deque.contains(123));
    }

    public static void testSize() {
        Deque<Integer> deque = new ArrayDeque();
        deque.addFirst(123);
        assertEquals("testSize", 1, deque.size());
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