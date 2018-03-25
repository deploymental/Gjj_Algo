package com.getjavajob.training.algo1702.gultiaeve.util;


public class StopWatch {
    private static long start;

    public static long start() {
        start = System.currentTimeMillis();
        return start;
    }

    public static long getElapsedTime() {
        long stop = System.currentTimeMillis();
        return stop - start;
    }
}