package com.getjavajob.training.algo1702.gultiaeve.lesson03;


import java.util.ConcurrentModificationException;

import static java.util.Arrays.copyOf;

public class DynamicArray {
    private int size;
    private Object[] internalArray;
    private int modCount;

    public DynamicArray() {
        internalArray = new Object[10];
    }

    public DynamicArray(int size) {
        internalArray = new Object[size];
    }

    public boolean add(Object e) {
        validateSpace();
        modCount++;
        internalArray[size++] = e;
        return true;
    }

    public void add(int i, Object e) {
        rangeCheckForAdd(i);
        validateSpace();
        modCount++;
        System.arraycopy(internalArray, i, internalArray, i + 1, size - i);
        internalArray[i] = e;
        size++;
    }

    public Object set(int i, Object e) {
        rangeCheck(i);
        Object result = internalArray[i];
        internalArray[i] = e;
        return result;
    }

    public Object get(int i) {
        rangeCheck(i);
        return internalArray[i];
    }

    public Object remove(int i) {
        rangeCheck(i);
        modCount++;
        Object result = internalArray[i];
        int numMoved = size - i - 1;
        if (numMoved > 0) {
            System.arraycopy(internalArray, i + 1, internalArray, i, numMoved);
        }
        internalArray[--size] = null;
        return result;
    }

    public boolean remove(Object e) {
        if (e == null) {
            for (int i = 0; i < size; i++) {
                if (internalArray[i] == null) {
                    fastRemove(i);
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (internalArray[i].equals(e)) {
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
            System.arraycopy(internalArray, i + 1, internalArray, i, numMoved);
        }
        internalArray[--size] = null;
    }

    public int size() {
        return size;
    }

    public int indexOf(Object e) {
        for (int i = 0; i < internalArray.length; i++) {
            if (internalArray[i].equals(e)) {
                return i;
            }
        }
        return 0;
    }

    public boolean contains(Object e) {
        for (int i = 0; i < internalArray.length; i++) {
            if (internalArray[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    public Object[] toArray() {
        return copyOf(internalArray, size);
    }

    private void validateSpace() {
        if (internalArray.length < size + 1) {
            internalArray = copyOf(internalArray, internalArray.length + (internalArray.length >> 1));
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

    public ListIterator listIterator(int index) {
        return new ListIterator(index);
    }

    public class ListIterator {
        private int cursor;
        private int lastObj = -1;
        private int expectedModCount = modCount;

        public ListIterator(int index) {
            cursor = index;
        }

        public boolean hasNext() {
            return cursor + 1 < size();
        }

        public Object next() {
            checkForComodification();
            int i = cursor;
            rangeCheck(i);
            Object[] da = DynamicArray.this.internalArray;
            if (i >= da.length) {
                throw new ConcurrentModificationException();
            }
            cursor = i + 1;
            return da[lastObj = i];
        }

        public boolean hasPrevious() {
            return cursor > 0;
        }

        public Object previous() {
            checkForComodification();
            int i = cursor - 1;
            rangeCheck(i);
            Object[] elementData = DynamicArray.this.internalArray;
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

        public void set(Object e) {
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

        public void add(Object e) {
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