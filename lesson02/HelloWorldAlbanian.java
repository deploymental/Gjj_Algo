package com.getjavajob.training.algo1702.gultiaeve.lesson02;


import java.io.UnsupportedEncodingException;

/**
 * @author Vital Severyn
 */
public class HelloWorldAlbanian {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String helloWorld = "P�rsh�ndetje bot�!";
        System.out.println(new String(helloWorld.getBytes(), "UTF-8").replace("\ufffd", "\u0451"));
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