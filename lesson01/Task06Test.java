package com.getjavajob.training.algo1702.gultiaeve.lesson01;


import static com.getjavajob.training.algo1702.gultiaeve.lesson01.Task06.getBitwiseInvolution;
import static com.getjavajob.training.algo1702.gultiaeve.lesson01.Task06.getBitwiseInvolutionSum;
import static com.getjavajob.training.algo1702.gultiaeve.lesson01.Task06.invertNthBit;
import static com.getjavajob.training.algo1702.gultiaeve.lesson01.Task06.outputBinRepresentation;
import static com.getjavajob.training.algo1702.gultiaeve.lesson01.Task06.resetNLowerBits;
import static com.getjavajob.training.algo1702.gultiaeve.lesson01.Task06.returnNLowerBits;
import static com.getjavajob.training.algo1702.gultiaeve.lesson01.Task06.returnNthBit;
import static com.getjavajob.training.algo1702.gultiaeve.lesson01.Task06.setNthBitWithOne;
import static com.getjavajob.training.algo1702.gultiaeve.lesson01.Task06.setNthBitWithZero;
import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class Task06Test {

    public static void main(String[] args) {
        testGetBitwiseInvolution();
        testGetBitwiseInvolutionSum();
        testResetLowerBits();
        testSetNthBitWithOne();
        testInvertNthBit();
        testSetNthBitWithZero();
        testReturnNLowerBits();
        testReturnNthBit();
        testOutputBinRepresentation();
    }

    public static void testGetBitwiseInvolution() {
        assertEquals("getBitwiseInvolution(5)", 32, getBitwiseInvolution(5));
        assertEquals("getBitwiseInvolution(30)", 1073741824, getBitwiseInvolution(30));
    }

    public static void testGetBitwiseInvolutionSum() {
        assertEquals("getBitwiseInvolutionSum(5,5)", 64, getBitwiseInvolutionSum(5, 5));
        assertEquals("getBitwiseInvolutionSum(30,30)", 2147483647, getBitwiseInvolutionSum(30, 30));
    }

    public static void testResetLowerBits() {
        assertEquals("resetLowerBits(31,3)", 24, resetNLowerBits(31, 3));
    }

    public static void testSetNthBitWithOne() {
        assertEquals("setNthBitWithOne(1,2)", 5, setNthBitWithOne(1, 2));
    }

    public static void testInvertNthBit() {
        assertEquals("invertNthBit(1,1)", 0, invertNthBit(1, 0));
    }

    public static void testSetNthBitWithZero() {
        assertEquals("setNthBitWithZero(1,1)", 0, setNthBitWithZero(1, 0));
    }

    public static void testReturnNLowerBits() {
        String expected = "101010";
        String actual = Integer.toBinaryString(returnNLowerBits(2730, 6));
        assertEquals("returnNLowerBits(2730,6)", expected, actual);
    }

    public static void testReturnNthBit() {
        assertEquals("returnNthBit(1,1)", 1, returnNthBit(1, 0));
    }

    public static void testOutputBinRepresentation() {
        String actual = outputBinRepresentation((byte) 125);
        assertEquals("outputBinRepresentation((byte)125)", "01111101", actual);
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