package com.getjavajob.training.algo1702.gultiaeve.lesson05;


import java.util.NoSuchElementException;

public class LinkedListQueue<E> extends AbstractQueue<E> {
    private Node<E> head;
    private int size;

    @Override
    public boolean add(E e) {
        Node<E> curr = new Node<>(e);
        if (size == 0) {
            head = curr;
        } else {
            Node<E> temp = get(size - 1);
            temp.next = curr;
        }
        size++;
        return true;
    }

    @Override
    public E remove() {
        Node<E> result = head;
        if (size == 0) {
            throw new NoSuchElementException();
        } else if (size == 1) {
            result = head;
            head = null;
        } else {
            head = head.next;
        }
        size--;
        return result.val;
    }

    @Override
    public String toString() {
        String string = "";
        Node<E> node = head;

        while (node != null) {
            string += node.val + " ";
            node = node.next;
        }
        return string;
    }

    private Node<E> get(int index) {
        Node<E> curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr;
    }

    private static class Node<E> {
        private Node<E> next;
        private E val;

        public Node(E val) {
            this(val, null);
        }

        public Node(E val, Node<E> next) {
            this.next = next;
            this.val = val;
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