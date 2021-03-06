package com.getjavajob.training.algo1702.gultiaeve.lesson05;


import java.util.ArrayList;
import java.util.List;

public class LinkedListStack<E> implements Stack<E> {
    private int relinkCalls;
    private Node<E> head;
    private int size;

    public LinkedListStack() {
        this.head = null;
        this.size = 0;
    }

    public void add(E e) {
        add(e, size);
    }

    public void add(E e, int index) {
        checkPositionIndex(index);
        Node<E> temp = new Node(e);
        Node<E> curr = head;
        if (index == 0) {
            temp.next = head;
            head = temp;
        } else if (index == size) {
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
        } else {
            for (int i = 1; i < index; i++) {
                curr = curr.next;
            }
            temp.next = curr.next;
            curr.next = temp;
        }
        size++;
    }

    public void remove(int index) {
        checkPositionIndex(index);

        Node<E> curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;
    }

    public E get(int index) {
        checkPositionIndex(index);

        Node<E> curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public Node<E> getNode(int index) {
        checkPositionIndex(index);

        Node<E> curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr;
    }

    public int size() {
        return size;
    }

    public void reverse() {
        LinkedListStack<E> linkedListStack = this;
        Node<E> curr = head;
        for (int i = 0; i < size - 1; i++) {
            linkedListStack.add((E) curr, 0);
            curr = curr.next;
        }
        curr = head;
        Node<E> temp = linkedListStack.head;
        for (int i = 0; i < size - 1; i++) {
            Node<E> tmp = curr;
            curr = temp;
            curr.next = tmp.next;
            curr = curr.next;
            temp = temp.next;
        }
    }

    public List<E> asList() {
        List<E> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(get(i));
        }
        return arrayList;
    }

    @Override
    public void push(E e) {
        add(e, 0);
    }

    @Override
    public E pop() {
        Node<E> temp = head;
        head = head.next;
        return temp.val;
    }

    private void checkPositionIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index <= 0 || index >= size");
        }
    }

    private void relink(Node<E> firstNode, Node<E> next) {
        Node<E> temp = firstNode.next;
        firstNode.next = next.next;
        next.next = temp;
        relinkCalls++;
    }

    public String toString() {
        String string = "";
        Node<E> node = head;
        while (node != null) {
            string += node.val + " ";
            node = node.next;
        }
        return string;
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
Violation 2(redundant inicialisation) - found
Violation 3(wrong interface) - not found
Violation 4(bad naming) - not found
Violation 5(redundant this) - not found
Violation 6(bad casting) - not found
Violation 7(static import) - not found
*/