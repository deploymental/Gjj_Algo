package com.getjavajob.training.algo1702.gultiaeve.lesson05;


import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class UnmodifiableCollection<E> extends AbstractCollection<E> {
    private List<E> arrayList;

    public UnmodifiableCollection() {
        this.arrayList = new ArrayList();
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public E remove(int index) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator iterator() {
        return arrayList.iterator();
    }

    @Override
    public int size() {
        return arrayList.size();
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