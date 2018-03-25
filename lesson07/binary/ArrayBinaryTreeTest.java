package com.getjavajob.training.algo1702.gultiaeve.lesson07.binary;


import com.getjavajob.training.algo1702.gultiaeve.lesson07.Node;
import com.getjavajob.training.algo1702.gultiaeve.lesson07.Tree;

import java.util.ArrayList;
import java.util.List;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class ArrayBinaryTreeTest {

    public static void main(String[] args) {
        testLeftAndAddLeft();
        testRightAndAddRight();
        testRootAndAddRoot();
        testParent();
        testAdd();
        testSet();
        testRemove();
        testSize();
        testNodes();
        testPreOrder();
        testPostOrder();
        testToString();
    }

    public static void testLeftAndAddLeft() {
        BinaryTree<Integer> arrayBinaryTree = new ArrayBinaryTree(10);
        Node root = arrayBinaryTree.root();
        arrayBinaryTree.addLeft(root, 20);
        assertEquals("testLeftAndAddLeft", 20, arrayBinaryTree.left(root).getElement());
    }

    public static void testRightAndAddRight() {
        BinaryTree<Integer> arrayBinaryTree = new ArrayBinaryTree(10);
        Node root = arrayBinaryTree.root();
        arrayBinaryTree.addRight(root, 20);
        assertEquals("testRightAndAddRight", 20, arrayBinaryTree.right(root).getElement());
    }

    public static void testRootAndAddRoot() {
        Tree<Integer> arrayBinaryTree = new ArrayBinaryTree();
        arrayBinaryTree.addRoot(10);
        assertEquals("testRootAndAddRoot", new Integer(10), arrayBinaryTree.root().getElement());
    }

    public static void testParent() {
        BinaryTree<Integer> arrayBinaryTree = new ArrayBinaryTree();
        Node temp = arrayBinaryTree.addRoot(10);
        Node left = arrayBinaryTree.addLeft(temp, 20);
        assertEquals("testParent", temp, arrayBinaryTree.parent(left));
    }

    public static void testAdd() {
        BinaryTree<Integer> arrayBinaryTree = new ArrayBinaryTree(10);
        arrayBinaryTree.add(arrayBinaryTree.root(), new Integer(9));
        arrayBinaryTree.add(arrayBinaryTree.root(), new Integer(12));
        assertEquals("testAddForLeft", new Integer(9), arrayBinaryTree.left(arrayBinaryTree.root()).getElement());
        assertEquals("testAddForRight", new Integer(12), arrayBinaryTree.right(arrayBinaryTree.root()).getElement());
    }

    public static void testSet() {
        BinaryTree<Integer> arrayBinaryTree = new ArrayBinaryTree(10);
        Node root = arrayBinaryTree.root();
        Node left = arrayBinaryTree.addLeft(root, 20);
        arrayBinaryTree.set(left, 15);
        assertEquals("testLeftAndAddLeft", 15, arrayBinaryTree.left(root).getElement());
    }

    public static void testRemove() {
        BinaryTree<Integer> arrayBinaryTree = new ArrayBinaryTree(10);
        Node root = arrayBinaryTree.root();
        Node left = arrayBinaryTree.addLeft(root, 20);
        arrayBinaryTree.remove(left);
        assertEquals("testRemove", null, arrayBinaryTree.left(arrayBinaryTree.root()));
    }

    public static void testSize() {
        Tree<Integer> arrayBinaryTree = new ArrayBinaryTree(10);
        arrayBinaryTree.add(arrayBinaryTree.root(), new Integer(11));
        assertEquals("testSize", 2, arrayBinaryTree.size());
    }

    public static void testNodes() {
        Tree<Integer> arrayBinaryTree = new ArrayBinaryTree<>(10);
        ArrayBinaryTree.NodeImpl node = (ArrayBinaryTree.NodeImpl) arrayBinaryTree.nodes().toArray()[0];
        assertEquals("testNodes", 10, node.getElement());
    }

    public static void testPreOrder() {
        ArrayBinaryTree<Integer> arrayBinaryTree = new ArrayBinaryTree<>(10);
        arrayBinaryTree.add(arrayBinaryTree.root(), 11);
        List<ArrayBinaryTree.NodeImpl> arrayList = (ArrayList) arrayBinaryTree.preOrder();
        assertEquals("testPreOrder", arrayList.get(0).getElement(), arrayBinaryTree.root().getElement());
    }

    public static void testPostOrder() {
        ArrayBinaryTree<Integer> arrayBinaryTree = new ArrayBinaryTree<>(10);
        arrayBinaryTree.add(arrayBinaryTree.root(), 11);
        List<ArrayBinaryTree.NodeImpl> arrayList = (ArrayList) arrayBinaryTree.postOrder();
        assertEquals("testPostOrder", arrayList.get(1).getElement(), arrayBinaryTree.root().getElement());
    }

    public static void testToString() {
        Tree<Integer> arrayBinaryTree = new ArrayBinaryTree<>(5);
        Node temp = arrayBinaryTree.add(arrayBinaryTree.root(), 7);
        arrayBinaryTree.add(temp, 8);
        arrayBinaryTree.add(temp, 9);
        assertEquals("testToString", "5(7(8,9))", arrayBinaryTree.toString());
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