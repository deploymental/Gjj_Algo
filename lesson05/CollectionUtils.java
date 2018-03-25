package com.getjavajob.training.algo1702.gultiaeve.lesson05;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionUtils<E> {

    public static <E> boolean filter(Collection<E> collection, Predicate<E> predicate) {
        boolean result = false;
        for (final Iterator<E> iterator = collection.iterator(); iterator.hasNext(); ) {
            if (!predicate.evaluate(iterator.next())) {
                iterator.remove();
                result = true;
            }
        }
        return result;
    }

    public static <E, T> Collection transform(Collection<E> collection, Transformer<E, T> transformer) {
        Collection<T> result = new ArrayList();
        Iterator<E> inputIterator = collection.iterator();
        while (inputIterator.hasNext()) {
            E item = inputIterator.next();
            T value = transformer.transform(item);
            result.add(value);
        }
        return result;
    }


    public static <E, T> void transformInputCollection(Collection collection, Transformer<E, T> transformer) {
        Collection temp = new ArrayList();
        Iterator<E> inputIterator = collection.iterator();
        while (inputIterator.hasNext()) {
            E item = inputIterator.next();
            T value = transformer.transform(item);
            temp.add(value);
        }
        collection.clear();
        collection.addAll(temp);
    }

    public static <E> void forAllDo(Collection<E> collection, Closure<E> closure) {
        Iterator<E> iterator = collection.iterator();
        while (iterator.hasNext()) {
            E element = iterator.next();
            closure.execute(element);
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