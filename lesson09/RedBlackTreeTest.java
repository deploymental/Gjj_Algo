package com.getjavajob.training.algo1702.gultiaeve.lesson09;


import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class RedBlackTreeTest {

    public static void main(String[] args) {
        testAdd();
        testRemove();
    }

    public static void testAdd() {
        RedBlackTree<Integer> redBlackTree = new RedBlackTree<>();
        redBlackTree.addRoot(1);
        assertEquals("testAdd", new Integer(1), redBlackTree.root().getElement());
    }

    public static void testRemove() {
        RedBlackTree<Integer> redBlackTree = new RedBlackTree<>();
        redBlackTree.addRoot(5);
        assertEquals("testRemove", new Integer(5), redBlackTree.root().getElement());
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