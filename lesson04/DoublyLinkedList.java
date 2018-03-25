package com.getjavajob.training.algo1702.gultiaeve.lesson04;


import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class DoublyLinkedList<V> extends AbstractList<V> implements List<V> {
    private int size;
    private int modCount;
    private Element<V> first;
    private Element<V> last;

    public boolean add(V val) {
        final Element<V> l = last;
        final Element<V> newNode = new Element(l, val, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
        modCount++;
        return true;
    }

    public void add(int index, V val) {
        checkPositionIndex(index);
        if (index == size) {
            add(val);
        } else {
            addBefore(val, element(index));
        }
    }

    private void addBefore(V val, Element<V> element) {
        final Element<V> pred = element.prev;
        final Element<V> newNode = new Element(pred, val, element);
        element.prev = newNode;
        if (pred == null) {
            first = newNode;
        } else {
            pred.next = newNode;
        }
        size++;
        modCount++;
    }

    public boolean remove(Object o) {
        if (o == null) {
            for (Element<V> x = first; x != null; x = x.next) {
                if (x.val == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Element<V> x = first; x != null; x = x.next) {
                if (o.equals(x.val)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    public V remove(int index) {
        checkElementIndex(index);
        return unlink(element(index));
    }


    public V get(int index) {
        checkPositionIndex(index);
        return element(index).val;
    }

    public int size() {
        return size;
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        for (int i = 0; i < size; i++) {
            result[i] = get(i);
        }
        return result;
    }

    public Element<V> element(int index) {
        if (index < (size >> 1)) {
            Element<V> x = first;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
            return x;
        } else {
            Element<V> x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
        }
    }

    private V unlink(Element<V> x) {
        final V element = x.val;
        final Element<V> next = x.next;
        final Element<V> prev = x.prev;
        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.val = null;
        size--;
        modCount++;
        return element;
    }

    private void checkPositionIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index <= 0 || index >= size");
        }
    }

    private void checkElementIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index <= 0 || index > size");
        }
    }

    public ListIteratorImpl listIterator() {
        return new ListIteratorImpl(0);
    }

    public ListIterator<V> listIterator(int index) {
        checkPositionIndex(index);
        return new ListIteratorImpl(index);
    }

    private static class Element<V> {
        private V val;
        private Element<V> prev;
        private Element<V> next;

        Element(Element<V> prev, V element, Element<V> next) {
            this.val = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public class ListIteratorImpl implements java.util.ListIterator<V> {
        private Element<V> lastReturned;
        private Element<V> next;
        private int nextIndex;
        private int expectedModCount = modCount;

        public ListIteratorImpl(int index) {
            next = (index == size) ? null : element(index);
            nextIndex = index;
        }

        @Override
        public boolean hasNext() {
            return nextIndex < size;
        }

        @Override
        public V next() {
            checkForComodification();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.val;
        }

        @Override
        public boolean hasPrevious() {
            return nextIndex > 0;
        }

        @Override
        public V previous() {
            checkForComodification();
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            lastReturned = next = (next == null) ? last : next.prev;
            nextIndex--;
            return lastReturned.val;
        }

        @Override
        public int nextIndex() {
            return nextIndex;
        }

        @Override
        public int previousIndex() {
            return nextIndex - 1;
        }

        @Override
        public void remove() {
            checkForComodification();
            if (lastReturned == null) {
                throw new IllegalStateException();
            }
            Element<V> lastReturnedNext = lastReturned.next;
            unlink(lastReturned);
            if (next == lastReturned) {
                next = lastReturnedNext;
            } else {
                nextIndex--;
            }
            lastReturned = null;
            expectedModCount++;
        }

        @Override
        public void set(V v) {
            if (lastReturned == null) {
                throw new IllegalStateException();
            }
            checkForComodification();
            lastReturned.val = v;
        }

        @Override
        public void add(V v) {
            checkForComodification();
            lastReturned = null;
            if (next == null) {
                DoublyLinkedList.this.add(v);
            } else {
                addBefore(v, next);
            }
            nextIndex++;
            expectedModCount++;
        }

        private void checkForComodification() {
            if (modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }
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