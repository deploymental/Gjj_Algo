package com.getjavajob.training.algo1702.gultiaeve.lesson05;


import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ExpressionCalculator {
    private Stack stack;
    private String input;
    private String output = "";

    public ExpressionCalculator(String in) {
        input = in;
        int stackSize = input.length();
        stack = new Stack(stackSize);
    }

    public static String convert(String input) {
        String output;
        ExpressionCalculator theTrans = new ExpressionCalculator(input);
        output = theTrans.doTrans();
        return output;
    }


    public static int calculator(String expression) throws Exception {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        return (int) engine.eval(expression);
    }

    private String doTrans() {
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '+':
                case '-':
                    gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }
        while (!stack.isEmpty()) {
            output = output + stack.pop();
        }
        System.out.println(output);
        return output;
    }

    private void gotOper(char opThis, int prec1) {
        while (!stack.isEmpty()) {
            char opTop = stack.pop();
            if (opTop == '(') {
                stack.push(opTop);
                break;
            } else {
                int prec2;
                if (opTop == '+' || opTop == '-') {
                    prec2 = 1;
                } else {
                    prec2 = 2;
                }
                if (prec2 < prec1) {
                    stack.push(opTop);
                    break;
                } else {
                    output = output + opTop;
                }
            }
        }
        stack.push(opThis);
    }

    private void gotParen(char ch) {
        while (!stack.isEmpty()) {
            char chx = stack.pop();
            if (chx == '(') {
                break;
            } else {
                output = output + chx;
            }
        }
    }

    private class Stack {
        private int maxSize;
        private char[] stackArray;
        private int top;

        public Stack(int max) {
            maxSize = max;
            stackArray = new char[maxSize];
            top = -1;
        }

        public void push(char j) {
            stackArray[++top] = j;
        }

        public char pop() {
            return stackArray[top--];
        }

        public char peek() {
            return stackArray[top];
        }

        public boolean isEmpty() {
            return (top == -1);
        }
    }
}
/*
Violation 1(redundant var) - not found
Violation 2(redundant inicialisation) - not found
Violation 3(wrong interface) - not found
Violation 4(bad naming) - found
Violation 5(redundant this) - not found
Violation 6(bad casting) - not found
Violation 7(static import) - not found
*/