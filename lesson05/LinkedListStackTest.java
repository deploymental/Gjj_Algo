package com.getjavajob.training.algo1702.gultiaeve.lesson05;


import java.util.ArrayList;
import java.util.List;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class LinkedListStackTest {

    public static void main(String[] args) {
        testAddAndPush();
        testRemove();
        testGet();
        testSize();
        testReverseAndAsList();
        testPop();
    }

    public static void testRemove() {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        stack.push(13);
        stack.push(12);
        stack.push(11);
        stack.pop();
        assertEquals("testRemove()", "12 13 ", stack.toString());
    }

    public static void testAddAndPush() {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        stack.add(13);
        stack.add(12);
        stack.add(11, 2);
        assertEquals("testAddAndPush()", "13 12 11 ", stack.toString());
    }

    public static void testGet() {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        stack.add(13);
        assertEquals("testGet()", 13, Math.toIntExact(stack.get(0)));
    }

    public static void testSize() {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        stack.add(13);
        assertEquals("testSize()", 1, stack.size());
    }

    public static void testReverseAndAsList() {
        LinkedListStack<Integer> origin = new LinkedListStack<>();
        origin.push(11);
        origin.push(12);
        origin.push(13);
        List arraylist = new ArrayList();
        arraylist.add(13);
        arraylist.add(12);
        arraylist.add(11);
        assertEquals("testReverseAndAsList()", origin.asList(), arraylist);
    }

    public static void testPop() {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        stack.add(13);
        stack.add(12);
        stack.pop();
        assertEquals("testPop()", 12, Math.toIntExact(stack.get(0)));
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