package com.getjavajob.training.algo1702.gultiaeve.lesson07.binary;


import com.getjavajob.training.algo1702.gultiaeve.lesson07.Node;
import com.getjavajob.training.algo1702.gultiaeve.lesson07.Tree;

import java.util.ArrayList;
import java.util.List;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class LinkedBinaryTreeTest {

    public static void main(String[] args) {
        testAddRoot();
        testAddLeftAndLeft();
        testAddRightAndRight();
        testSet();
        testRemove();
        testSize();
        testNodes();
        testPreOrder();
        testPostOrder();
        testToString();
    }

    public static void testAddRoot() {
        Tree<Integer> linkedBinaryTree = new LinkedBinaryTree();
        linkedBinaryTree.addRoot(10);
        assertEquals("testAddRoot", new Integer(10), linkedBinaryTree.root().getElement());
    }

    public static void testAddLeftAndLeft() {
        BinaryTree<Integer> linkedBinaryTree = new LinkedBinaryTree(10);
        linkedBinaryTree.addLeft(linkedBinaryTree.root(), 11);
        assertEquals("testAddLeft", new Integer(11), linkedBinaryTree.left(linkedBinaryTree.root()).getElement());
    }

    public static void testAddRightAndRight() {
        BinaryTree<Integer> linkedBinaryTree = new LinkedBinaryTree(10);
        linkedBinaryTree.addRight(linkedBinaryTree.root(), 12);
        assertEquals("testAddRight", new Integer(12), linkedBinaryTree.right(linkedBinaryTree.root()).getElement());
    }

    public static void testSet() {
        Tree<Integer> linkedBinaryTree = new LinkedBinaryTree(10);
        linkedBinaryTree.set(linkedBinaryTree.root(), 11);
        assertEquals("testSet", new Integer(11), linkedBinaryTree.root().getElement());
    }

    public static void testRemove() {
        Tree<Integer> linkedBinaryTree = new LinkedBinaryTree(10);
        Node node = linkedBinaryTree.add(linkedBinaryTree.root(), 11);
        linkedBinaryTree.remove(node);
        assertEquals("testRemove", 11, node.getElement());
    }

    public static void testSize() {
        Tree<Integer> linkedBinaryTree = new LinkedBinaryTree<>(10);
        linkedBinaryTree.add(linkedBinaryTree.root(), new Integer(11));
        assertEquals("testSize", 1, linkedBinaryTree.size());
    }

    public static void testNodes() {
        Tree<Integer> linkedBinaryTree = new LinkedBinaryTree(10);
        LinkedBinaryTree.NodeImpl node = (LinkedBinaryTree.NodeImpl) linkedBinaryTree.nodes().toArray()[0];
        assertEquals("testNodes", 10, node.getElement());
    }

    public static void testPreOrder() {
        LinkedBinaryTree<Integer> linkedBinaryTree = new LinkedBinaryTree<>(10);
        linkedBinaryTree.add(linkedBinaryTree.root(), 11);
        List<LinkedBinaryTree.NodeImpl> arrayList = (ArrayList) linkedBinaryTree.preOrder();
        assertEquals("testPreOrder", arrayList.get(0).getElement(), linkedBinaryTree.root().getElement());
    }

    public static void testPostOrder() {
        LinkedBinaryTree<Integer> linkedBinaryTree = new LinkedBinaryTree<>(10);
        linkedBinaryTree.add(linkedBinaryTree.root(), 11);
        List<LinkedBinaryTree.NodeImpl> arrayList = (ArrayList) linkedBinaryTree.postOrder();
        assertEquals("testPostOrder", arrayList.get(1).getElement(), linkedBinaryTree.root().getElement());
    }

    public static void testToString() {
        Tree<Integer> linkedBinaryTree = new LinkedBinaryTree<>(10);
        linkedBinaryTree.add(linkedBinaryTree.root(), 11);
        linkedBinaryTree.add(linkedBinaryTree.root(), 12);
        assertEquals("testToString", "10(11,12)", linkedBinaryTree.toString());
    }
}
/*
Violation 1(redundant var) - not found
Violation 2(redundant inicialisation) - not found
Violation 3(wrong interface) - found
Violation 4(bad naming) - not found
Violation 5(redundant this) - not found
Violation 6(bad casting) - not found
Violation 7(static import) - not found
*/