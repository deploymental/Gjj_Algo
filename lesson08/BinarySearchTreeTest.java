package com.getjavajob.training.algo1702.gultiaeve.lesson08;


import com.getjavajob.training.algo1702.gultiaeve.lesson07.Node;

import java.util.Comparator;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class BinarySearchTreeTest {

    public static void main(String[] args) {
        testCompare();
        testTreeSearch();
    }

    public static void testCompare() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree(new IntComparator());
        assertEquals("testCompare", binarySearchTree.compare(500, 500), 0);
    }

    public static void testTreeSearch() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree(new IntComparator());
        Node node = binarySearchTree.addRoot(10);
        binarySearchTree.addRight(node, 11);
        Node node2 = binarySearchTree.addLeft(node, 9);
        binarySearchTree.addLeft(node2, 8);
        binarySearchTree.addRight(node2, 7);
        assertEquals("testTreeSearch", 7, binarySearchTree.treeSearch(node2, 7).getElement());
    }

    private static class IntComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o1, o2);
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