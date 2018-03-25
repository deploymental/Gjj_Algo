package com.getjavajob.training.algo1702.gultiaeve.lesson08;


import com.getjavajob.training.algo1702.gultiaeve.lesson07.Node;
import com.getjavajob.training.algo1702.gultiaeve.lesson07.binary.LinkedBinaryTree;

import java.util.Collection;
import java.util.Comparator;

/**
 * @author Vital Severyn
 * @since 31.07.15
 */
public class BinarySearchTree<E> extends LinkedBinaryTree<E> {
    private Comparator<E> comparator;

    public BinarySearchTree() {
    }

    public BinarySearchTree(Comparator<E> comparator) {
        this.comparator = comparator;
    }

    /**
     * Method for comparing two values
     *
     * @param val1
     * @param val2
     * @return
     */
    protected int compare(E val1, E val2) {
        if (comparator != null) {
            return comparator.compare(val1, val2);
        }
        return ((Comparable<E>) val1).compareTo(val2);
    }

    /**
     * Returns the node in n's subtree by val
     *
     * @param n
     * @param val
     * @return
     */
    public Node<E> treeSearch(Node<E> n, E val) {
        Collection<Node<E>> collection = this.nodes();
        for (Node<E> e : collection) {
            if (comparator != null) {
                if (compare(e.getElement(), val) == 0) {
                    return e;
                }
            } else {
                if (e.getElement().equals(val)) {
                    return e;
                }
            }
        }
        return null;
    }

    protected void afterElementRemoved(Node<E> n) {

    }

    protected void afterElementAdded(Node<E> n) {

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