package com.getjavajob.training.algo1702.gultiaeve.lesson10;


import static com.getjavajob.training.algo1702.gultiaeve.lesson10.AnotherMergeSort.fasterMergeSort;
import static com.getjavajob.training.algo1702.gultiaeve.lesson10.MergeSort.mergeSort;
import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;
import static com.getjavajob.training.algo1702.gultiaeve.util.StopWatch.getElapsedTime;
import static com.getjavajob.training.algo1702.gultiaeve.util.StopWatch.start;

public class MergeSortTest {

    public static void main(String[] args) {
        testMergeSort();
        performanceTest();
    }

    public static void testMergeSort() {
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
        MergeSort sort = new MergeSort();
        mergeSort(origin);
        assertEquals("testMergeSort()", result, origin);
    }

    public static void performanceTest(){
        int[] temp = new int[10000000];
        for(int i = temp.length - 1; i > 0; i--){
            temp[10000000 - i - 1] = i;
        }
        start();
        mergeSort(temp);
        System.out.println(getElapsedTime());
        start();
        fasterMergeSort(temp);
        System.out.println(getElapsedTime());
    }
}
//not enough RAM for Integer.MAX_VALUE;
/*
Violation 1(redundant var) - not found
Violation 2(redundant inicialisation) - not found
Violation 3(wrong interface) - not found
Violation 4(bad naming) - not found
Violation 5(redundant this) - not found
Violation 6(bad casting) - not found
Violation 7(static import) - not found
*/