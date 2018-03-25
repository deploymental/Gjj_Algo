package com.getjavajob.training.algo1702.gultiaeve.lesson06;


import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class IntegerMatrixTest {

    public static void main(String[] args) {
        testBigMatrix();
    }

    public static void testBigMatrix() {
        IntegerMatrix integerMatrix = new IntegerMatrix();
        for (int i = 0; i < 1000000; i++) {
            integerMatrix.set(i, 1000000, i);
        }
        assertEquals("testBigMatrix", new Integer(100), integerMatrix.get(100, 1000000));
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