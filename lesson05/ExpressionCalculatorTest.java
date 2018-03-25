package com.getjavajob.training.algo1702.gultiaeve.lesson05;


import static com.getjavajob.training.algo1702.gultiaeve.lesson05.ExpressionCalculator.calculator;
import static com.getjavajob.training.algo1702.gultiaeve.lesson05.ExpressionCalculator.convert;
import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;

public class ExpressionCalculatorTest {

    public static void main(String[] args) {
        convertTest();
        calculatorTest();
    }

    public static void convertTest() {
        assertEquals("convertTest", "35+72-*", convert("(3+5)*(7-2)"));
    }

    public static void calculatorTest() {
        try {
            assertEquals("calculatorTest", 40, calculator("(3+5)*(7-2)"));
        } catch (Exception e) {
            e.printStackTrace();
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