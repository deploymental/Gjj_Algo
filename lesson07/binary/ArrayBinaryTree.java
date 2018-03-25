package com.getjavajob.training.algo1702.gultiaeve.lesson07.binary;


import com.getjavajob.training.algo1702.gultiaeve.lesson07.Node;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Concrete implementation of a binary tree using a node-based, linked structure
 *
 * @param <E> element
 */
public class ArrayBinaryTree<E> extends AbstractBinaryTree<E> {
    private List<Node<E>> treesArray = new ArrayList<>();
    private NodeImpl<E> root;
    private int size;


    public ArrayBinaryTree() {
    }

    public ArrayBinaryTree(E e) {
        addRoot(e);
    }

    private NodeImpl<E> validate(Node e) {
        if (e instanceof NodeImpl) {
            return (NodeImpl<E>) e;
        } else {
            throw new IllegalArgumentException();
        }
    }

    private void checkArraySize() {
        if (treesArray.size() < size >> 1) {
            for (int i = 0; i < treesArray.size() >> 1; i++) {
                treesArray.add(null);
            }
        }
    }

    @Override
    public Node<E> left(Node<E> p) throws IllegalArgumentException {
        NodeImpl<E> temp = validate(p);
        return treesArray.get(2 * temp.position + 1);
    }

    @Override
    public Node<E> right(Node<E> p) throws IllegalArgumentException {
        NodeImpl<E> temp = validate(p);
        return treesArray.get(2 * temp.position + 2);
    }

    @Override
    public Node<E> addLeft(Node<E> n, E e) throws IllegalArgumentException {
        NodeImpl<E> temp = validate(n);
        int position = 2 * temp.position + 1;
        temp = new NodeImpl(position, e);
        treesArray.add(position, temp);
        size++;
        checkArraySize();
        return temp;
    }

    @Override
    public Node<E> addRight(Node<E> n, E e) throws IllegalArgumentException {
        NodeImpl<E> temp = validate(n);
        int position = 2 * temp.position + 2;
        temp = new NodeImpl(position, e);
        treesArray.add(position, temp);
        size++;
        checkArraySize();
        return temp;
    }

    @Override
    public Node<E> root() {
        return root;
    }

    @Override
    public Node<E> parent(Node<E> n) throws IllegalArgumentException {
        NodeImpl<E> temp = validate(n);
        return treesArray.get((temp.position - 1) / 2);
    }


    @Override
    public Node<E> addRoot(E e) throws IllegalStateException {
        if (root != null) {
            throw new IllegalStateException();
        }
        root = new NodeImpl<>(0, e);
        treesArray.add(0, root);
        size++;
        for (int i = 0; i < 10; i++) {
            treesArray.add(null);
        }
        return root;
    }

    @Override
    public Node<E> add(Node<E> n, E e) throws IllegalArgumentException {
        validate(n);
        int childrenNumber = childrenNumber(n);
        Node<E> result;
        if (childrenNumber == 2) {
            throw new IllegalArgumentException();
        } else if (childrenNumber == 0) {
            result = addLeft(n, e);
        } else {
            result = addRight(n, e);
        }
        return result;
    }

    @Override
    public E set(Node<E> n, E e) throws IllegalArgumentException {
        if (n == null) {
            throw new IllegalArgumentException();
        }
        NodeImpl<E> node = (NodeImpl<E>) n;
        E result = node.e;
        node.e = e;
        return result;
    }

    @Override
    public E remove(Node<E> n) throws IllegalArgumentException {
        if (childrenNumber(n) > 0) {
            throw new IllegalArgumentException();
        }
        NodeImpl<E> temp = (NodeImpl<E>) n;
        E result = temp.e;
        treesArray.remove(temp.position);
        return result;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        Collection collection = breadthFirst();
        return collection.iterator();
    }

    @Override
    public Collection<Node<E>> nodes() {
        return this.breadthFirst();
    }

    public String toString() {
        if (root != null) {
            return recursiveToString((NodeImpl<E>) root(), new StringBuilder().append(root.getElement())).toString();
        }
        throw new IllegalArgumentException();
    }

    public StringBuilder recursiveToString(NodeImpl<E> node, StringBuilder sb) {
        if (left(node) == null && right(node) == null) {
            return new StringBuilder();
        }
        sb.append("(");
        if (left(node) != null) {
            sb.append(left(node).getElement() + "");
            recursiveToString((NodeImpl<E>) left(node), sb);
        }
        if (right(node) != null) {
            sb.append("," + right(node).getElement() + "");
            recursiveToString((NodeImpl<E>) right(node), sb);
        }
        sb.append(")");
        return sb;
    }

    protected static class NodeImpl<E> implements Node<E> {
        private int position;
        private E e;

        public NodeImpl(int position, E e) {
            this.position = position;
            this.e = e;
        }

        @Override
        public E getElement() {
            return e;
        }
    }
}
/*
Violation 1(redundant var) - not found
Violation 2(redundant inicialisation) - not found
Violation 3(wrong interface) - not found
Violation 4(bad naming) - not found
Violation 5(redundant this) - found
Violation 6(bad casting) - not found
Violation 7(static import) - not found
*/