package com.getjavajob.training.algo1702.gultiaeve.lesson08.balanced;


import com.getjavajob.training.algo1702.gultiaeve.lesson07.Node;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;


public class BalanceableTreeTest {

    public static void main(String[] args) {
        testRotate();
        testReduceSubtreeHeight();
    }

    public static void testRotate() {
        BTRealisation btRealisation = new BTRealisation();
        btRealisation.add(15);
        Node n2 = btRealisation.add(10);
        Node n1 = btRealisation.add(7);
        btRealisation.add(11);
        btRealisation.add(6);
        btRealisation.add(9);
        System.out.println(btRealisation);
        btRealisation.rotate(n1);
        assertEquals("testRightRotate", btRealisation.toString(), "15(7(6,10(9,11)))");
        btRealisation.rotate(n2);
        assertEquals("testLeftRotate", btRealisation.toString(), "15(10(7(6,9),11))");
    }

    public static void testReduceSubtreeHeight() {
        BTRealisation btRealisation = new BTRealisation();
        btRealisation.add(3);
        btRealisation.add(4);
        btRealisation.add(6);
        Node n1 = btRealisation.add(5);
        System.out.println(btRealisation);
        btRealisation.reduceSubtreeHeight(n1);
        assertEquals("testReduceSubtreeHeight-right, right", btRealisation.toString(), "3(,5(4,6))");
        btRealisation = new BTRealisation();
        btRealisation.add(3);
        btRealisation.add(4);
        btRealisation.add(6);
        Node n2 = btRealisation.add(7);
        btRealisation.reduceSubtreeHeight(n2);
        assertEquals("testReduceSubtreeHeight-right, left", btRealisation.toString(), "3(,6(4,7))");
        btRealisation = new BTRealisation();
        btRealisation.add(6);
        btRealisation.add(5);
        btRealisation.add(4);
        Node n3 = btRealisation.add(3);
        btRealisation.reduceSubtreeHeight(n3);
        assertEquals("testReduceSubtreeHeight-left, left", btRealisation.toString(), "6(4(3,5))");
        btRealisation = new BTRealisation();
        btRealisation.add(7);
        btRealisation.add(6);
        btRealisation.add(4);
        Node n4 = btRealisation.add(5);
        btRealisation.reduceSubtreeHeight(n4);
        assertEquals("testReduceSubtreeHeight-left, right", btRealisation.toString(), "7(5(4,6))");
    }

    private static class BTRealisation extends BalanceableTree {

        public Node add(Integer e) {
            Node<Integer> temp = root();
            if (root().getElement() == null) {
                return addRoot(e);
            }
            while (true) {
                if (temp.getElement() > e && left(temp).getElement() == null) {
                    return addLeft(temp, e);
                } else if (temp.getElement() > e) {
                    temp = left(temp);
                }
                if (temp.getElement() < e && right(temp).getElement() == null) {
                    return addRight(temp, e);
                } else if (temp.getElement() < e) {
                    temp = right(temp);
                }
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