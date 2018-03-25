package com.getjavajob.training.algo1702.gultiaeve.lesson05;

import java.util.Collection;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.fail;

public class UnmodifiableCollectionTest {
    public static void main(String[] args) {
        unmodifiableCollectionTest();
    }

    public static void unmodifiableCollectionTest() {
        Collection collection = new UnmodifiableCollection();
        try {
            collection.add(5);
            fail("");
        } catch (UnsupportedOperationException e) {
            System.out.println("unmodifiableCollectionTest passed");
        }
    }
}
