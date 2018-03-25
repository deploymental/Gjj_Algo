package com.getjavajob.training.algo1702.gultiaeve.lesson01;


public class Task07 {

    public static int[] swapVarsFirstWay(int a, int b) {
        a = new Integer(a ^ b);
        b = new Integer(a ^ b);
        a = new Integer(a ^ b);
        return new int[]{a, b};
    }

    public static int[] swapVarsSecondWay(int a, int b) {
        a = (a & b) | ~(a & b);
        b = (b & a) | ~(b & a);
        a = (a & b) | ~(a & b);
        return new int[]{a, b};
    }

    public static int[] swapVarsThirdWay(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }

    public static int[] swapVarsFourthWay(int a, int b) {
        a = a * b;
        b = a / b;
        a = a / b;
        return new int[]{a, b};
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