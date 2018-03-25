package com.getjavajob.training.algo1702.gultiaeve.lesson01;


import static com.getjavajob.training.algo1702.gultiaeve.lesson01.Task07.swapVarsFirstWay;
import static com.getjavajob.training.algo1702.gultiaeve.lesson01.Task07.swapVarsFourthWay;
import static com.getjavajob.training.algo1702.gultiaeve.lesson01.Task07.swapVarsSecondWay;
import static com.getjavajob.training.algo1702.gultiaeve.lesson01.Task07.swapVarsThirdWay;
import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class Task07Test {

    public static void main(String[] args) {
        testSwapVarsFirstWay();
        testSwapVarsSecondWay();
        testSwapVarsThirdWay();
        testSwapVarsFourthWay();
    }


    public static void testSwapVarsFirstWay() {
        swapVarsFirstWay(5, 9);
        assertEquals("testSwapVarsFirstWay()", new int[]{9, 5}, swapVarsFirstWay(5, 9));
        assertEquals("testSwapVarsFirstWay()", new int[]{9, 5}, swapVarsFirstWay(5, 9));
    }

    public static void testSwapVarsSecondWay() {
        swapVarsSecondWay(5, 9);
        assertEquals("testSwapVarsSecondWay()", new int[]{9, 5}, swapVarsFirstWay(5, 9));
        assertEquals("testSwapVarsSecondWay()", new int[]{9, 5}, swapVarsFirstWay(5, 9));
    }

    public static void testSwapVarsThirdWay() {
        swapVarsThirdWay(5, 9);
        assertEquals("testSwapVarsThirdWay()", new int[]{9, 5}, swapVarsFirstWay(5, 9));
        assertEquals("testSwapVarsThirdWay()", new int[]{9, 5}, swapVarsFirstWay(5, 9));
    }

    public static void testSwapVarsFourthWay() {
        swapVarsFourthWay(5, 9);
        assertEquals("testSwapVarsFourthWay()", new int[]{9, 5}, swapVarsFirstWay(5, 9));
        assertEquals("testSwapVarsFourthWay()", new int[]{9, 5}, swapVarsFirstWay(5, 9));
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