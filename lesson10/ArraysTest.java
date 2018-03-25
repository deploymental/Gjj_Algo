package com.getjavajob.training.algo1702.gultiaeve.lesson10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;
import static java.util.Arrays.*;

public class ArraysTest {

    public static void main(String[] args) {
        testFill();
        testDeepEquals();
        testEquals();
        testCopyOf();
        testCopyOfRange();
        testBinarySearch();
        testAsList();
        testSort();
        testRangeSort();
        testParallelSort();
        testParallelRangeSort();
        testDeepToString();
    }

    public static void testFill() {
        boolean[] origin = new boolean[2];
        boolean[] expected = {true, true};
        fill(origin, true);
        assertEquals("testFillBoolean()", expected, origin);
    }

    public static void testDeepEquals() {
        Collection originArray = new ArrayList();
        Collection originArray1 = new ArrayList();
        Object[] first = {originArray, originArray1};
        Object[] second = {originArray, originArray1};
        assertEquals("testDeepEquals()", true, deepEquals(first, second));
    }

    public static void testEquals() {
        Collection originArray = new ArrayList();
        Collection originArray1 = new ArrayList();
        Object[] first = {originArray, originArray1};
        Object[] second = {originArray, originArray1};
        assertEquals("testDeepEquals()", true, Arrays.equals(first, second));
    }

    public static void testDeepToString() {
        Object[] origin = {"lol"};
        assertEquals("testDeepToString()", "[lol]", deepToString(origin));
    }

    public static void testCopyOf() {
        byte[] originChar = {1, 2, 3, 4, 5, 6};
        byte[] result = {1, 2, 3, 4};
        assertEquals("testCopyOfByte()", result, copyOf(originChar, 4));
        boolean[] originChar1 = {true, false, true, true, false, false};
        boolean[] result1 = {true, false, true, true};
        assertEquals("testCopyOfBoolean()", result1, copyOf(originChar1, 4));
        char[] originChar3 = {'S', 'R', 'Q', 'G', 'F', 'E', 'D', 'C', 'B', 'A'};
        char[] result3 = {'S', 'R', 'Q', 'G'};
        assertEquals("testCopyOfChar()", result3, copyOf(originChar3, 4));
        double[] originChar4 = {1, 2, 3, 4, 5, 6};
        double[] result4 = {1, 2, 3, 4};
        assertEquals("testCopyOfDouble()", result4, copyOf(originChar4, 4));
        float[] originChar5 = {1, 2, 3, 4, 5, 6};
        float[] result5 = {1, 2, 3, 4};
        assertEquals("testCopyOfFloat()", result5, copyOf(originChar5, 4));
        int[] originChar6 = {1, 2, 3, 4, 5, 6};
        int[] result6 = {1, 2, 3, 4};
        assertEquals("testCopyOfInt()", result6, copyOf(originChar6, 4));
        long[] originChar7 = {1, 2, 3, 4, 5, 6};
        long[] result7 = {1, 2, 3, 4};
        assertEquals("testCopyOfLong()", result7, copyOf(originChar7, 4));
        short[] originChar8 = {1, 2, 3, 4, 5, 6};
        short[] result8 = {1, 2, 3, 4};
        assertEquals("testCopyOfShort()", result8, copyOf(originChar8, 4));
        Collection[] originChar9 = {new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
        Collection[] result9 = {new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
        assertEquals("testCopyOfT[]()", result9, copyOf(originChar9, 4));
    }

    public static void testCopyOfRange() {
        byte[] originChar = {1, 2, 3, 4, 5, 6};
        byte[] result = {1, 2, 3, 4};
        assertEquals("testCopyOfByte()", result, copyOfRange(originChar, 0, 4));
        boolean[] originChar1 = {true, false, true, true, false, false};
        boolean[] result1 = {true, false, true, true};
        assertEquals("testCopyOfBoolean()", result1, copyOfRange(originChar1, 0, 4));
        char[] originChar3 = {'S', 'R', 'Q', 'G', 'F', 'E', 'D', 'C', 'B', 'A'};
        char[] result3 = {'S', 'R', 'Q', 'G'};
        assertEquals("testCopyOfChar()", result3, copyOfRange(originChar3, 0, 4));
        double[] originChar4 = {1, 2, 3, 4, 5, 6};
        double[] result4 = {1, 2, 3, 4};
        assertEquals("testCopyOfDouble()", result4, copyOfRange(originChar4, 0, 4));
        float[] originChar5 = {1, 2, 3, 4, 5, 6};
        float[] result5 = {1, 2, 3, 4};
        assertEquals("testCopyOfFloat()", result5, copyOfRange(originChar5, 0, 4));
        int[] originChar6 = {1, 2, 3, 4, 5, 6};
        int[] result6 = {1, 2, 3, 4};
        assertEquals("testCopyOfInt()", result6, copyOfRange(originChar6, 0, 4));
        long[] originChar7 = {1, 2, 3, 4, 5, 6};
        long[] result7 = {1, 2, 3, 4};
        assertEquals("testCopyOfLong()", result7, copyOfRange(originChar7, 0, 4));
        short[] originChar8 = {1, 2, 3, 4, 5, 6};
        short[] result8 = {1, 2, 3, 4};
        assertEquals("testCopyOfShort()", result8, copyOfRange(originChar8, 0, 4));
        Collection[] originChar9 = {new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
        Collection[] result9 = {new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
        assertEquals("testCopyOfT[]()", result9, copyOfRange(originChar9, 0, 4));
    }

    public static void testBinarySearch() {
        byte[] test = {1, 2, 3, 4, 5, 6};
        assertEquals("testBinaryByteSearch()", 4, binarySearch(test, (byte) 5));
        assertEquals("testBinaryRangeByteSearch()", 4, binarySearch(test, 3, 6, (byte) 5));
        char[] originChar1 = {'1', '2', '3', '4', '5', '6'};
        assertEquals("testBinaryCharSearch()", 4, binarySearch(originChar1, '5'));
        assertEquals("testBinaryRangeCharSearch()", 4, binarySearch(originChar1, 3, 6, '5'));
        double[] originChar2 = {1, 2, 3, 4, 5, 6};
        assertEquals("testBinaryDoubleSearch()", 4, binarySearch(originChar2, 5));
        assertEquals("testBinaryRangeDoubleSearch()", 4, binarySearch(originChar2, 3, 6, 5));
        float[] originChar3 = {1, 2, 3, 4, 5, 6};
        assertEquals("testBinaryFloatSearch()", 4, binarySearch(originChar3, 5));
        assertEquals("testBinaryRangeFloatSearch()", 4, binarySearch(originChar3, 3, 6, 5));
        int[] originChar4 = {1, 2, 3, 4, 5, 6};
        assertEquals("testBinaryIntSearch()", 4, binarySearch(originChar4, 5));
        assertEquals("testBinaryRangeIntSearch()", 4, binarySearch(originChar4, 3, 6, 5));
        long[] originChar5 = {1, 2, 3, 4, 5, 6};
        assertEquals("testBinaryLongSearch()", 4, binarySearch(originChar5, 5));
        assertEquals("testBinaryRangeLongSearch()", 4, binarySearch(originChar5, 3, 6, 5));
        short[] originChar6 = {1, 2, 3, 4, 5, 6};
        assertEquals("testBinaryShortSearch()", 4, binarySearch(originChar6, (short) 5));
        assertEquals("testBinaryRangeShortSearch()", 4, binarySearch(originChar6, 3, 6, (short) 5));
        Object[] originChar7 = {1, 2, 3, 4, 5, 6};
        assertEquals("testBinaryObjectSearch()", 4, binarySearch(originChar7, 5));
        assertEquals("testBinaryRangeObjectSearch()", 4, binarySearch(originChar7, 3, 6, 5));
        String[] originChar8 = {"A", "Bb", "Ccc", "Dddd", "Eeeee", "Ffffff", "Ggggggg", "Qqqqqqqq", "Rrrrrrrrr", "Ssssssssss"};
        assertEquals("testBinaryStringSearch()", 3, binarySearch(originChar8, "Dddd", String.CASE_INSENSITIVE_ORDER));
        assertEquals("testBinaryStringSearch()", 3, binarySearch(originChar8, 0, 5, "Dddd", String.CASE_INSENSITIVE_ORDER));
    }

    public static void testAsList() {
        Object[] origin = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertEquals("testAsList()", origin, asList(origin).toArray());
    }

    public static void testSort() {
        int[] origin = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sort(origin);
        assertEquals("testSortInt()", result, origin);
        long[] originLong = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        long[] resultLong = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sort(originLong);
        assertEquals("testSortLong()", resultLong, originLong);
        short[] originShort = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        short[] resultShort = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sort(originShort);
        assertEquals("testSortShort()", resultShort, originShort);
        char[] originChar = {'S', 'R', 'Q', 'G', 'F', 'E', 'D', 'C', 'B', 'A'};
        char[] resultChar = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'Q', 'R', 'S'};
        sort(originChar);
        assertEquals("testSortChar()", resultChar, originChar);
        byte[] originByte = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        byte[] resultByte = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sort(originByte);
        assertEquals("testSortByte()", resultByte, originByte);
        float[] originFloat = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        float[] resultFloat = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sort(originFloat);
        assertEquals("testSortFloat()", resultFloat, originFloat);
        double[] originDouble = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        double[] resultDouble = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sort(originDouble);
        assertEquals("testSortDouble()", resultDouble, originDouble);
        Object[] originObject = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Object[] resultObject = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sort(originObject);
        assertEquals("testSortObject()", resultObject, originObject);
        String[] originString = {"Ssssssssss", "Rrrrrrrrr", "Qqqqqqqq", "Ggggggg", "Ffffff", "Eeeee", "Dddd", "Ccc", "Bb", "A"};
        String[] resultString = {"A", "Bb", "Ccc", "Dddd", "Eeeee", "Ffffff", "Ggggggg", "Qqqqqqqq", "Rrrrrrrrr", "Ssssssssss"};
        sort(originString, String.CASE_INSENSITIVE_ORDER);
        assertEquals("testSortString()", resultString, originString);
    }

    public static void testRangeSort() {
        int[] origin = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] result = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        sort(origin, 1, 9);
        assertEquals("testRangeSortInt()", result, origin);
        long[] originLong = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        long[] resultLong = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        sort(originLong, 1, 9);
        assertEquals("testRangeSortLong()", resultLong, originLong);
        long[] originShort = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        long[] resultShort = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        sort(originShort, 1, 9);
        assertEquals("testRangeSortLong()", resultShort, originShort);
        char[] originChar = {'A', 'R', 'Q', 'G', 'F', 'E', 'D', 'C', 'B', 'S'};
        char[] resultChar = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'Q', 'R', 'S'};
        sort(originChar, 1, 9);
        assertEquals("testRangeSortChar()", resultChar, originChar);
        byte[] originByte = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        byte[] resultByte = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        sort(originByte, 1, 9);
        assertEquals("testRangeSortByte()", resultByte, originByte);
        float[] originFloat = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        float[] resultFloat = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        sort(originFloat, 1, 9);
        assertEquals("testRangeSortFloat()", resultFloat, originFloat);
        double[] originDouble = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        double[] resultDouble = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        sort(originDouble, 1, 9);
        assertEquals("testRangeSortDouble()", resultDouble, originDouble);
        Object[] originObject = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Object[] resultObject = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        sort(originObject, 1, 9);
        assertEquals("testRangeSortObject()", resultObject, originObject);
        String[] originString = {"A", "Rrrrrrrrr", "Qqqqqqqq", "Ggggggg", "Ffffff", "Eeeee", "Dddd", "Ccc", "Bb", "Ssssssssss"};
        String[] resultString = {"A", "Bb", "Ccc", "Dddd", "Eeeee", "Ffffff", "Ggggggg", "Qqqqqqqq", "Rrrrrrrrr", "Ssssssssss"};
        sort(originString, 1, 9, String.CASE_INSENSITIVE_ORDER);
        assertEquals("testRangeSortString()", resultString, originString);
    }

    public static void testParallelSort() {
        int[] origin = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        parallelSort(origin);
        assertEquals("testParallelSortInt()", result, origin);
        long[] originLong = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        long[] resultLong = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        parallelSort(originLong);
        assertEquals("testParallelSortLong()", resultLong, originLong);
        short[] originShort = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        short[] resultShort = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        parallelSort(originShort);
        assertEquals("testParallelSortShort()", resultShort, originShort);
        char[] originChar = {'S', 'R', 'Q', 'G', 'F', 'E', 'D', 'C', 'B', 'A'};
        char[] resultChar = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'Q', 'R', 'S'};
        parallelSort(originChar);
        assertEquals("testParallelSortChar()", resultChar, originChar);
        byte[] originByte = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        byte[] resultByte = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        parallelSort(originByte);
        assertEquals("testParallelSortByte()", resultByte, originByte);
        float[] originFloat = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        float[] resultFloat = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        parallelSort(originFloat);
        assertEquals("testParallelSortFloat()", resultFloat, originFloat);
        double[] originDouble = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        double[] resultDouble = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        parallelSort(originDouble);
        assertEquals("testParallelSortDouble()", resultDouble, originDouble);
        String[] originString = {"Ssssssssss", "Rrrrrrrrr", "Qqqqqqqq", "Ggggggg", "Ffffff", "Eeeee", "Dddd", "Ccc", "Bb", "A"};
        String[] resultString = {"A", "Bb", "Ccc", "Dddd", "Eeeee", "Ffffff", "Ggggggg", "Qqqqqqqq", "Rrrrrrrrr", "Ssssssssss"};
        parallelSort(originString, String.CASE_INSENSITIVE_ORDER);
        assertEquals("testParallelSortString()", resultString, originString);
    }

    public static void testParallelRangeSort() {
        int[] origin = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] result = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        parallelSort(origin, 1, 9);
        assertEquals("testParallelSortInt()", result, origin);
        long[] originLong = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        long[] resultLong = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        sort(originLong, 1, 9);
        assertEquals("testParallelSortLong()", resultLong, originLong);
        long[] originShort = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        long[] resultShort = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        parallelSort(originShort, 1, 9);
        assertEquals("testParallelSortLong()", resultShort, originShort);
        char[] originChar = {'A', 'R', 'Q', 'G', 'F', 'E', 'D', 'C', 'B', 'S'};
        char[] resultChar = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'Q', 'R', 'S'};
        parallelSort(originChar, 1, 9);
        assertEquals("testParallelSortChar()", resultChar, originChar);
        byte[] originByte = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        byte[] resultByte = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        parallelSort(originByte, 1, 9);
        assertEquals("testParallelSortByte()", resultByte, originByte);
        float[] originFloat = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        float[] resultFloat = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        parallelSort(originFloat, 1, 9);
        assertEquals("testParallelSortFloat()", resultFloat, originFloat);
        double[] originDouble = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        double[] resultDouble = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        parallelSort(originDouble, 1, 9);
        assertEquals("testParallelSortDouble()", resultDouble, originDouble);
        String[] originString = {"A", "Rrrrrrrrr", "Qqqqqqqq", "Ggggggg", "Ffffff", "Eeeee", "Dddd", "Ccc", "Bb", "Ssssssssss"};
        String[] resultString = {"A", "Bb", "Ccc", "Dddd", "Eeeee", "Ffffff", "Ggggggg", "Qqqqqqqq", "Rrrrrrrrr", "Ssssssssss"};
        parallelSort(originString, 1, 9, String.CASE_INSENSITIVE_ORDER);
        assertEquals("testParallelSortString()", resultString, originString);
    }
}
/*
Violation 1(redundant var) - not found
Violation 2(redundant inicialisation) - not found
Violation 3(wrong interface) - found
Violation 4(bad naming) - not found
Violation 5(redundant this) - not found
Violation 6(bad casting) - not found
Violation 7(static import) - not found
*/