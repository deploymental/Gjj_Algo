package com.getjavajob.training.algo1702.gultiaeve.lesson10;


public class BubbleSort {

    public void bubbleSort(int[] originArray) {
        int bound = originArray.length;
        do {
            int newBound = 0;
            for (int i = 1; i <= bound - 1; i++) {
                if (originArray[i - 1]> originArray[i]) {
                    int temp = originArray[i];
                    originArray[i] = originArray[i - 1];
                    originArray[i - 1] = temp;
                    newBound = i;
                }
            }
            bound = newBound;
        } while (bound != 0);
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