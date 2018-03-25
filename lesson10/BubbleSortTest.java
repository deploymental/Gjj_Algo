package com.getjavajob.training.algo1702.gultiaeve.lesson10;


import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class BubbleSortTest {

    public static void main(String[] args) {
        testBubbleSort();
    }

    public static void testBubbleSort() {
        int[] origin = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BubbleSort bubble = new BubbleSort();
        bubble.bubbleSort(origin);
        assertEquals("testBubbleSort()", result, origin);
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