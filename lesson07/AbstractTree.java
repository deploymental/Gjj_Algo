package com.getjavajob.training.algo1702.gultiaeve.lesson07;


import java.util.*;

/**
 * An abstract base class providing some functionality of the Tree interface
 *
 * @param <E> element
 */
public abstract class AbstractTree<E> implements Tree<E> {

    @Override
    public boolean isInternal(Node<E> n) throws IllegalArgumentException {
        return childrenNumber(n) > 0;
    }

    @Override
    public boolean isExternal(Node<E> n) throws IllegalArgumentException {
        return childrenNumber(n) == 0;
    }

    @Override
    public boolean isRoot(Node<E> n) throws IllegalArgumentException {
        return n.equals(root());
    }

    @Override
    public boolean isEmpty() {
        return nodes().isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    /**
     * @return an iterable collection of nodes of the tree in preorder
     */
    public Collection<Node<E>> preOrder() {
        Collection<Node<E>> result = new ArrayList<>();
        preOrderRecursive(root(), result);
        return result;
    }

    /**
     * @return an iterable collection of nodes of the tree in postorder
     */
    public Collection<Node<E>> postOrder() {
        Collection<Node<E>> result = new ArrayList<>();
        postOrderRecursive(root(), result);
        return result;
    }

    /**
     * @return an iterable collection of nodes of the tree in breadth-first order
     */
    public Collection<Node<E>> breadthFirst() {
        Deque<Node<E>> queue = new ArrayDeque<>();
        queue.add(root());
        int count = 0;
        while (count < queue.size()) {
            queue.addAll(children(queue.iterator().next()));
            count++;
        }
        return queue;
    }

    private void preOrderRecursive(Node<E> node, Collection<Node<E>> collection) {
        if (node != null) {
            collection.add(node);
            Collection arrayList =  children(node);
            for (int i = 0; i < childrenNumber(node); i++) {
                Node temp = (Node) arrayList.iterator().next();
                preOrderRecursive(temp, collection);
            }
        }
    }

    private void postOrderRecursive(Node<E> node, Collection<Node<E>> collection) {
        if (node != null) {
            Collection arrayList = (ArrayList) children(node);
            for (int i = 0; i < childrenNumber(node); i++) {
                Node temp = (Node) arrayList.iterator().next();
                preOrderRecursive(temp, collection);
            }
            collection.add(node);
        }
    }

    /**
     * Adapts the iteration produced by {@link Tree#nodes()}
     */
    private class ElementIterator implements Iterator<E> {
        private Iterator<Node<E>> it = nodes().iterator();

        @Override
        public boolean hasNext() {
            return it.hasNext();
        }

        @Override
        public E next() {
            return it.next().getElement();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
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