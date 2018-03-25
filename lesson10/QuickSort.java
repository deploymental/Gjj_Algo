package com.getjavajob.training.algo1702.gultiaeve.lesson10;


public class QuickSort {
    public void quickSort(int a[]) {
        sort(a, 0, a.length - 1);
    }

    public void sort(int a[], int left, int right) {
        if (right > left) {
            int i = left;
            int j = right;
            int v = a[right];
            do {
                while (a[i] < v) {
                    i++;
                }
                while (a[j] > v) {
                    j--;
                }
                if (i <= j) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    i++;
                    j--;
                }
            } while (i <= j);
            if (left < j) {
                sort(a, left, j);
            }
            if (i < right) {
                sort(a, i, right);
            }
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