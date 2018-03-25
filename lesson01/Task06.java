package com.getjavajob.training.algo1702.gultiaeve.lesson01;


public class Task06 {

    /**
     * given n<31, calc 2^n
     *
     * @param exponent
     * @return result of bitwise involution
     */
    public static int getBitwiseInvolution(int exponent) {
        return 1 << exponent;
    }

    /**
     * given n,m<31, calc 2^n+2^m
     *
     * @param exponent1
     * @param exponent2
     * @return result of bitwise involution sum
     */
    public static int getBitwiseInvolutionSum(int exponent1, int exponent2) {
        int res = exponent1 == exponent2 ? 1 << exponent1 << 1 : 1 << exponent1 | 1 << exponent2;
        if (res < 0) {
            res = ~res;
        }
        return res;
    }

    /**
     * reset n lower bits (create mask with n lower bits reset)
     *
     * @param a
     * @param n
     * @return a with n lower bits reset
     */
    public static int resetNLowerBits(int a, int n) {
        return a & -1 << n;
    }

    /**
     * set a's n-th bit with 1
     *
     * @param a
     * @param n
     * @return a with n-th bit=1
     */
    public static int setNthBitWithOne(int a, int n) {
        return 1 << n | a;
    }

    /**
     * invert n-th bit (use 2 bit ops)
     *
     * @param a
     * @param n
     * @return a with inverted n-th bit
     */
    public static int invertNthBit(int a, int n) {
        return 1 << n ^ a;
    }

    /**
     * set a's n-th bit with 0
     *
     * @param a
     * @param n
     * @return
     */
    public static int setNthBitWithZero(int a, int n) {
        return ~(1 << n) & a;
    }

    /**
     * return n lower bits
     *
     * @param a
     * @param n
     * @return with n-th bit=0
     */
    public static int returnNLowerBits(int a, int n) {
        return a & ~(-1 << n);
    }

    /**
     * return n-th bit
     *
     * @param a
     * @param n
     * @return n-th bit
     */
    public static int returnNthBit(int a, int n) {
        int temp = setNthBitWithOne(0, n);
        if ((a & temp) > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * given byte a. output bin representation using bit ops (don't use jdk api).
     */
    public static String outputBinRepresentation(byte a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0b10000000; i > 0; i >>>= 1) {
            if ((a & i) > 0) {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        return sb.toString();
    }
}
/*
Violation 1(redundant var) - found
Violation 2(redundant inicialisation) - not found
Violation 3(wrong interface) - not found
Violation 4(bad naming) - not found
Violation 5(redundant this) - not found
Violation 6(bad casting) - not found
Violation 7(static import) - not found
*/