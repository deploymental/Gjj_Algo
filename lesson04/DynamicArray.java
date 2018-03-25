package com.getjavajob.training.algo1702.gultiaeve.lesson04;


import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;

public class DynamicArray<V> extends AbstractList<V> implements List<V> {
    private int size;
    private V[] da;
    private int modCount;

    public DynamicArray() {
        this(10);
    }

    public DynamicArray(int size) {
        da = (V[]) new Object[size];
    }

    public boolean add(V e) {
        validateSpace();
        modCount++;
        da[size++] = e;
        return true;
    }

    public void add(int i, V e) {
        rangeCheckForAdd(i);
        validateSpace();
        modCount++;
        System.arraycopy(da, i, da, i + 1, size - i);
        da[i] = e;
        size++;
    }

    public V set(int i, V e) {
        rangeCheck(i);
        V result = da[i];
        da[i] = e;
        return result;
    }

    public V get(int i) {
        rangeCheck(i);
        return da[i];
    }

    public V remove(int i) {
        rangeCheck(i);
        modCount++;
        V result = da[i];
        int numMoved = size - i - 1;
        if (numMoved > 0) {
            System.arraycopy(da, i + 1, da, i, numMoved);
        }
        da[--size] = null;
        return result;
    }

    public boolean remove(Object e) {
        if (e == null) {
            for (int i = 0; i < size; i++) {
                if (da[i] == null) {
                    fastRemove(i);
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (da[i].equals(e)) {
                    fastRemove(i);
                    return true;
                }
            }
        }
        return false;
    }

    private void fastRemove(int i) {
        modCount++;
        int numMoved = size - i - 1;
        if (numMoved > 0) {
            System.arraycopy(da, i + 1, da, i, numMoved);
        }
        da[--size] = null;
    }

    public int size() {
        return size;
    }

    public int indexOf(Object e) {
        for (int i = 0; i < da.length; i++) {
            if (da[i].equals(e)) {
                return i;
            }
        }
        return 0;
    }

    public boolean contains(Object e) {
        for (int i = 0; i < da.length; i++) {
            if (da[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    public Object[] toArray() {
        return Arrays.copyOf(da, size);
    }

    private void validateSpace() {
        if (da.length < size + 1) {
            da = Arrays.copyOf(da, da.length + (da.length >> 1));
        }
    }

    private void rangeCheckForAdd(int i) {
        if (i < 0 || i > size) {
            throw new ArrayIndexOutOfBoundsException("i < 0 || i > da.size() - 1");
        }
    }

    private void rangeCheck(int i) {
        if (i < 0 || i > size - 1) {
            throw new ArrayIndexOutOfBoundsException("i < 0 || i > da.size() - 1");
        }
    }

    public ListIteratorImpl listIterator() {
        return new ListIteratorImpl(0);
    }

    public ListIteratorImpl listIterator(int index) {
        return new ListIteratorImpl(index);
    }

    public class ListIteratorImpl implements java.util.ListIterator<V> {

        private int cursor;
        private int lastObj = -1;
        private int expectedModCount = modCount;

        public ListIteratorImpl(int index) {
            cursor = index;
        }

        public boolean hasNext() {
            return cursor + 1 < size();
        }

        public V next() {
            checkForComodification();
            int i = cursor;
            rangeCheck(i);
            V[] da = DynamicArray.this.da;
            if (i >= da.length) {
                throw new ConcurrentModificationException();
            }
            cursor = i + 1;
            return da[lastObj = i];
        }

        public boolean hasPrevious() {
            return cursor > 0;
        }

        public V previous() {
            checkForComodification();
            int i = cursor - 1;
            rangeCheck(i);
            V[] elementData = DynamicArray.this.da;
            if (i >= elementData.length) {
                throw new ConcurrentModificationException();
            }
            cursor = i;
            return elementData[lastObj = i];
        }

        public int nextIndex() {
            return cursor;
        }

        public int previousIndex() {
            return cursor - 1;
        }

        public void remove() {
            if (lastObj < 0) {
                throw new IllegalStateException();
            }
            checkForComodification();
            try {
                DynamicArray.this.remove(lastObj);
                cursor = lastObj;
                lastObj = -1;
                expectedModCount = modCount;
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
        }

        public void set(V e) {
            if (lastObj < 0) {
                throw new IllegalStateException();
            }
            checkForComodification();
            try {
                DynamicArray.this.set(lastObj, e);
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
        }

        public void add(V e) {
            checkForComodification();
            try {
                int i = cursor;
                DynamicArray.this.add(i, e);
                cursor = i + 1;
                lastObj = -1;
                expectedModCount = modCount;
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
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