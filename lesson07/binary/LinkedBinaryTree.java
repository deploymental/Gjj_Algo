package com.getjavajob.training.algo1702.gultiaeve.lesson07.binary;


import com.getjavajob.training.algo1702.gultiaeve.lesson07.Node;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Concrete implementation of a binary tree using a node-based, linked structure
 *
 * @param <E> element
 */
public class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {
    protected static final NodeImpl nil = new NodeImpl(null);
    protected NodeImpl<E> root = nil;
    private int size;

    public LinkedBinaryTree() {
    }

    public LinkedBinaryTree(E e) {
        addRoot(e);
    }

    /**
     * Validates the node is an instance of supported {@link NodeImpl} type and casts to it
     *
     * @param n node
     * @return casted {@link NodeImpl} node
     * @throws IllegalArgumentException
     */
    protected NodeImpl<E> validate(Node<E> n) throws IllegalArgumentException {
        if (n instanceof NodeImpl) {
            return (NodeImpl<E>) n;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Node<E> addRoot(E e) throws IllegalStateException {
        NodeImpl<E> r = new NodeImpl(e);
        r.parent = nil;
        root = r;
        return r;
    }

    @Override
    public Node<E> add(Node<E> n, E e) throws IllegalArgumentException {
        NodeImpl<E> r = new NodeImpl(e);
        NodeImpl<E> node = (NodeImpl<E>) n;
        if (node.left == nil) {
            node.left = r;
            node.left.parent = node;
            size++;
        } else if (node.right == nil) {
            node.right = r;
            node.right.parent = node;
            size++;
        } else {
            throw new IllegalArgumentException();
        }
        return r;
    }

    @Override
    public Node<E> addLeft(Node<E> n, E e) throws IllegalArgumentException {
        NodeImpl<E> node = validate(n);
        if (node.left != nil) {
            throw new IllegalArgumentException();
        }
        node.left = new NodeImpl<E>(e);
        node.left.parent = node;
        size++;
        return node.left;
    }

    @Override
    public Node<E> addRight(Node<E> n, E e) throws IllegalArgumentException {
        NodeImpl<E> node = validate(n);
        if (node.right != nil) {
            throw new IllegalArgumentException();
        }
        node.right = new NodeImpl<E>(e);
        node.right.parent = node;
        size++;
        return node.right;
    }

    /**
     * Replaces the element at {@link Node} <i>n</i> with <i>e</i>
     *
     * @param n node
     * @param e element
     * @return replace element
     * @throws IllegalArgumentException
     */
    @Override
    public E set(Node<E> n, E e) throws IllegalArgumentException {
        NodeImpl<E> currentNode = (NodeImpl<E>) n;
        if (currentNode == nil) {
            throw new IllegalArgumentException();
        }
        E retValue = currentNode.getElement();
        currentNode.value = e;
        return retValue;
    }

    /**
     * Replaces the element at {@link Node} <i>n</i> with <i>e</i>
     *
     * @param n node
     * @return replace element
     * @throws IllegalArgumentException
     */
    @Override
    public E remove(Node<E> n) throws IllegalArgumentException {
        NodeImpl<E> current = (NodeImpl<E>) n;
        if (current == nil) {
            throw new IllegalArgumentException();
        }

        if (current.parent != nil && current.parent.left != nil && current.parent.left == current) {
            current.parent.left = nil;
        } else if (current.parent != nil && current.parent.right == current) {
            current.parent.right = nil;
        }
        size--;
        return current.getElement();
    }

    @Override
    public Node<E> left(Node<E> p) throws IllegalArgumentException {
        NodeImpl<E> parent = validate(p);
        if (parent == nil) {
            throw new IllegalArgumentException();
        }
        return parent.left;
    }

    @Override
    public Node<E> right(Node<E> p) throws IllegalArgumentException {
        NodeImpl<E> parent = validate(p);
        if (parent == nil) {
            throw new IllegalArgumentException();
        }
        return parent.right;
    }

    @Override
    public Node<E> root() {
        return root;
    }

    @Override
    public Node<E> parent(Node<E> n) throws IllegalArgumentException {
        NodeImpl<E> child = validate(n);
        if (child.getElement() == null) {
            throw new IllegalArgumentException();
        }
        return child.parent;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        Collection<E> list = new LinkedList<>();
        for (Node<E> n : nodes()) {
            list.add(n.getElement());
        }
        return list.iterator();
    }

    @Override
    public Collection<Node<E>> nodes() {
        return this.breadthFirst();
    }

    @Override
    public String toString() {
        if (root != null) {
            return recursiveToString((NodeImpl<E>) root(), new StringBuilder().append(root.getElement())).toString();
        }
        throw new IllegalArgumentException();
    }

    public StringBuilder recursiveToString(NodeImpl<E> node, StringBuilder sb) {
        if (node.left == nil && node.right == nil) {
            return new StringBuilder();
        }
        sb.append("(");
        if (node.left != nil) {
            sb.append(node.left.getElement() + "");
            recursiveToString(node.left, sb);
        }
        if (node.right != nil) {
            sb.append("," + node.right.getElement() + "");
            recursiveToString(node.right, sb);
        }
        sb.append(")");
        return sb;
    }

    public static class NodeImpl<E> implements Node<E> {
        public NodeImpl<E> parent = nil;
        public NodeImpl<E> left = nil;
        public NodeImpl<E> right = nil;
        private E value;

        public NodeImpl(NodeImpl<E> parent, NodeImpl<E> left, NodeImpl<E> right, E value) {
            this.parent = parent;
            this.left = left;
            this.right = right;
            this.value = value;
        }

        public NodeImpl(E value) {
            this(nil, nil, value);
        }

        public NodeImpl(NodeImpl<E> left, NodeImpl<E> right, E val) {
            this.left = left;
            this.right = right;
            this.value = val;
        }

        @Override
        public E getElement() {
            return value;
        }
    }
}
/*
Violation 1(redundant var) - not found
Violation 2(redundant inicialisation) - found
Violation 3(wrong interface) - found
Violation 4(bad naming) - found
Violation 5(redundant this) - not found
Violation 6(bad casting) - not found
Violation 7(static import) - not found
*/
