package com.getjavajob.training.algo1702.gultiaeve.lesson07.binary;


import com.getjavajob.training.algo1702.gultiaeve.lesson07.Node;
import com.getjavajob.training.algo1702.gultiaeve.lesson07.Tree;

/**
 * An interface for a binary tree, in which each node has at most two children
 *
 * @param <E> element
 */
public interface BinaryTree<E> extends Tree<E> {

    /**
     * @param p node
     * @return the node of <i>node</i>'s left child (of null if no child exists)
     * @throws IllegalArgumentException
     */
    Node<E> left(Node<E> p) throws IllegalArgumentException;

    /**
     * @param p node
     * @return the node of <i>node</i>'s right child (of null if no child exists)
     * @throws IllegalArgumentException
     */
    Node<E> right(Node<E> p) throws IllegalArgumentException;

    /**
     * @param p node
     * @return the node of <i>node</i>'s sibling (of null if no sibling exists)
     * @throws IllegalArgumentException
     */
    Node<E> sibling(Node<E> p) throws IllegalArgumentException;

    /**
     * Creates a new left child of {@link Node} <i>n</i> storing element <i>e</i>
     *
     * @param n node
     * @param e element
     * @return created node
     * @throws IllegalArgumentException if <i>node</i> already has a left child
     */
    Node<E> addLeft(Node<E> n, E e) throws IllegalArgumentException;

    /**
     * Creates a new right child of {@link Node} <i>n</i> storing element <i>e</i>
     *
     * @param n node
     * @param e element
     * @return created node
     * @throws IllegalArgumentException if <i>n</i> already has a right child
     */
    Node<E> addRight(Node<E> n, E e) throws IllegalArgumentException;
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