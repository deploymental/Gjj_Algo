package com.getjavajob.training.algo1702.gultiaeve.lesson10;


import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class QuickSortTest {

    public static void main(String[] args) {
        testQuickSort();
    }

    public static void testQuickSort() {
        int[] origin = new int[Byte.MAX_VALUE];
        int[] result = new int[Byte.MAX_VALUE];
        int resultTemp = 1;
        int originTemp = Byte.MAX_VALUE;
        for (int i = 0; i < Byte.MAX_VALUE; i++) {
            result[i] = resultTemp;
            resultTemp++;
        }
        for (int i = 0; i < Byte.MAX_VALUE; i++) {
            origin[i] = originTemp;
            originTemp--;
        }
        QuickSort sort = new QuickSort();
        sort.quickSort(origin);
        assertEquals("testQuickSort", result, origin);
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