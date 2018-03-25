package com.getjavajob.training.algo1702.gultiaeve.lesson10;


public class MergeSort {

    public static void mergeSort(int[] originArray) {
        if (originArray.length < 2) {
            return;
        }
        int mid = originArray.length / 2;
        int left[] = new int[mid];
        int right[] = new int[originArray.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = originArray[i];
        }
        for (int i = 0; i < originArray.length - mid; i++) {
            right[i] = originArray[mid + i];
        }
        mergeSort(left);
        mergeSort(right);
        sort(left, right, originArray);
    }

    private static void sort(int[] a, int[] b, int[] all) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                all[k] = a[i];
                i++;
            } else {
                all[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            all[k++] = a[i++];
        }
        while (j < b.length) {
            all[k++] = b[j++];
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