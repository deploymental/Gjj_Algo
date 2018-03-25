package com.getjavajob.training.algo1702.gultiaeve.lesson04;


import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;
import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.fail;

public class DynamicArrayTest {

    public static void main(String[] args) {
        testAddElementToTheEnd();
        testAddElementToTheIndiceWithException();
        testAddElementToTheFirstIndice();
        testAddElementToTheLastIndice();
        testAddElementToTheMiddleIndice();
        testSetElementWithException();
        testSet();
        testGetElementWithException();
        testGet();
        testRemoveReturnableElementWithException();
        testRemoveReturnableElementFromTheFirstIndice();
        testRemoveReturnableElementFromTheMiddleIndice();
        testRemoveReturnableElementFromTheLastIndice();
        testRemoveElementWithException();
        testRemoveNonexistantElementFromTheFirstIndice();
        testRemoveElementFromTheFirstIndice();
        testRemoveElementFromTheMiddleIndice();
        testRemoveElementFromTheLastIndice();
        testSize();
        testIndexOf();
        testContains();
        testToArray();
        testListIteratorsHasNext();
        testListIteratorsNext();
        testListIteratorsHasPrevious();
        testListIteratorsPrevious();
        testListIteratorsNextIndex();
        testListIteratorsPreviousIndex();
        testListIteratorsRemove();
        testListIteratorSet();
        testListIteratorsAdd();
    }

    public static void testAddElementToTheEnd() {
        DynamicArray dynamicArray = new DynamicArray(1);
        Object obj1 = new Object();
        dynamicArray.add(obj1);
        Object[] expected = new Object[1];
        expected[0] = obj1;
        assertEquals("testAddElementToTheEnd", expected, dynamicArray.toArray());
    }

    public static void testAddElementToTheIndiceWithException() {
        DynamicArray dynamicArray = new DynamicArray(1);
        String msg = "i < 0 || i > da.size() - 1";
        try {
            dynamicArray.add(5, new Object());
            fail(msg);
        } catch (Exception e) {
            assertEquals("testAddElementToTheIndice", msg, e.getMessage());
        }
    }

    public static void testAddElementToTheFirstIndice() {
        DynamicArray dynamicArray = new DynamicArray(3);
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        dynamicArray.add(obj2);
        dynamicArray.add(obj3);
        dynamicArray.add(obj4);
        dynamicArray.add(0, obj1);
        Object[] expected = new Object[4];
        expected[0] = obj1;
        expected[1] = obj2;
        expected[2] = obj3;
        expected[3] = obj4;
        assertEquals("testAddElementToTheFirstIndice", expected, dynamicArray.toArray());
    }

    public static void testAddElementToTheLastIndice() {
        DynamicArray dynamicArray = new DynamicArray(3);
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        dynamicArray.add(obj1);
        dynamicArray.add(obj2);
        dynamicArray.add(obj4);
        dynamicArray.add(2, obj3);
        Object[] expected = new Object[4];
        expected[0] = obj1;
        expected[1] = obj2;
        expected[2] = obj3;
        expected[3] = obj4;
        assertEquals("testAddElementToTheLastIndice", expected, dynamicArray.toArray());
    }

    public static void testAddElementToTheMiddleIndice() {
        DynamicArray dynamicArray = new DynamicArray(3);
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        dynamicArray.add(obj1);
        dynamicArray.add(obj3);
        dynamicArray.add(obj4);
        dynamicArray.add(1, obj2);
        Object[] expected = new Object[4];
        expected[0] = obj1;
        expected[1] = obj2;
        expected[2] = obj3;
        expected[3] = obj4;
        assertEquals("testAddElementToTheMiddleIndice", expected, dynamicArray.toArray());
    }

    public static void testSetElementWithException() {
        DynamicArray dynamicArray = new DynamicArray(1);
        String msg = "i < 0 || i > da.size() - 1";
        try {
            dynamicArray.set(5, new Object());
            fail(msg);
        } catch (Exception e) {
            assertEquals("testSetElementWithException", msg, e.getMessage());
        }
    }

    public static void testSet() {
        DynamicArray dynamicArray = new DynamicArray(1);
        Object obj = new Object();
        Object obj1 = new Object();
        dynamicArray.add(obj1);
        assertEquals("testSetReturn", obj1, dynamicArray.set(0, obj));
        Object[] expected = new Object[1];
        expected[0] = obj;
        assertEquals("testSet", expected, dynamicArray.toArray());
    }

    public static void testGetElementWithException() {
        DynamicArray dynamicArray = new DynamicArray(1);
        String msg = "i < 0 || i > da.size() - 1";
        try {
            dynamicArray.set(5, new Object());
            fail(msg);
        } catch (Exception e) {
            assertEquals("testGetElementWithException", msg, e.getMessage());
        }
    }

    public static void testGet() {
        DynamicArray dynamicArray = new DynamicArray(1);
        Object obj = new Object();
        dynamicArray.add(obj);
        assertEquals("testGet", obj, dynamicArray.get(0));
    }

    public static void testRemoveReturnableElementWithException() {
        DynamicArray dynamicArray = new DynamicArray(1);
        String msg = "i < 0 || i > da.size() - 1";
        try {
            dynamicArray.remove(5);
            fail(msg);
        } catch (Exception e) {
            assertEquals("testRemoveReturnableElementWithException", msg, e.getMessage());
        }
    }

    public static void testRemoveReturnableElementFromTheFirstIndice() {
        DynamicArray dynamicArray = new DynamicArray(3);
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        dynamicArray.add(obj1);
        dynamicArray.add(obj2);
        dynamicArray.add(obj3);
        assertEquals("testRemoveReturnableElementFromTheFirstIndiceReturn", obj1, dynamicArray.remove(0));
        Object[] expected = new Object[2];
        expected[0] = obj2;
        expected[1] = obj3;
        assertEquals("testRemoveReturnableElementFromTheFirstIndice", expected, dynamicArray.toArray());
    }

    public static void testRemoveReturnableElementFromTheMiddleIndice() {
        DynamicArray dynamicArray = new DynamicArray(3);
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        dynamicArray.add(obj1);
        dynamicArray.add(obj2);
        dynamicArray.add(obj3);
        assertEquals("testRemoveReturnableElementFromTheMiddleIndiceReturn", obj2, dynamicArray.remove(1));
        Object[] expected = new Object[2];
        expected[0] = obj1;
        expected[1] = obj3;
        assertEquals("testRemoveReturnableElementFromTheMiddleIndice", expected, dynamicArray.toArray());
    }

    public static void testRemoveReturnableElementFromTheLastIndice() {
        DynamicArray dynamicArray = new DynamicArray(3);
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        dynamicArray.add(obj1);
        dynamicArray.add(obj2);
        dynamicArray.add(obj3);
        Object actual = dynamicArray.remove(2);
        assertEquals("testRemoveReturnableElementFromTheLastIndiceReturn", obj3, actual);
        Object[] expected = new Object[2];
        expected[0] = obj1;
        expected[1] = obj2;
        assertEquals("testRemoveReturnableElementFromTheLastIndice", expected, dynamicArray.toArray());
    }

    public static void testRemoveElementWithException() {
        DynamicArray dynamicArray = new DynamicArray(1);
        String msg = "i < 0 || i > da.size() - 1";
        try {
            dynamicArray.set(5, new Object());
            fail(msg);
        } catch (Exception e) {
            assertEquals("testRemoveElementWithException", msg, e.getMessage());
        }
    }

    public static void testRemoveNonexistantElementFromTheFirstIndice() {
        DynamicArray dynamicArray = new DynamicArray(3);
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object nonexistant = new Object();
        dynamicArray.add(obj1);
        dynamicArray.add(obj2);
        dynamicArray.add(obj3);
        assertEquals("testRemoveNonexistantElementFromTheFirstIndice", false, dynamicArray.remove(nonexistant));
    }

    public static void testRemoveElementFromTheFirstIndice() {
        DynamicArray dynamicArray = new DynamicArray(3);
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        dynamicArray.add(obj1);
        dynamicArray.add(obj2);
        dynamicArray.add(obj3);
        Object[] expected = new Object[2];
        expected[0] = obj2;
        expected[1] = obj3;
        assertEquals("testRemoveElementFromTheFirstIndiceReturn", true, dynamicArray.remove(obj1));
        assertEquals("testRemoveElementFromTheFirstIndice", expected, dynamicArray.toArray());
    }

    public static void testRemoveElementFromTheMiddleIndice() {
        DynamicArray dynamicArray = new DynamicArray(3);
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        dynamicArray.add(obj1);
        dynamicArray.add(obj2);
        dynamicArray.add(obj3);
        Object[] expected = new Object[2];
        expected[0] = obj1;
        expected[1] = obj3;
        assertEquals("testRemoveElementFromTheMiddleIndiceReturn", true, dynamicArray.remove(obj2));
        assertEquals("testRemoveElementFromTheMiddleIndice", expected, dynamicArray.toArray());
    }

    public static void testRemoveElementFromTheLastIndice() {
        DynamicArray dynamicArray = new DynamicArray(3);
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        dynamicArray.add(obj1);
        dynamicArray.add(obj2);
        dynamicArray.add(obj3);
        Object[] expected = new Object[2];
        expected[0] = obj1;
        expected[1] = obj2;
        assertEquals("testRemoveElementFromTheLastIndiceReturn", true, dynamicArray.remove(obj3));
        assertEquals("testRemoveElementFromTheLastIndice", expected, dynamicArray.toArray());
    }

    public static void testSize() {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(new Object());
        dynamicArray.add(new Object());
        dynamicArray.add(new Object());
        assertEquals("testSize", 3, dynamicArray.size());
    }

    public static void testIndexOf() {
        DynamicArray dynamicArray = new DynamicArray(3);
        Object obj = new Object();
        dynamicArray.add(new Object());
        dynamicArray.add(new Object());
        dynamicArray.add(obj);
        assertEquals("testIndexOf", 2, dynamicArray.indexOf(obj));
    }

    public static void testContains() {
        DynamicArray dynamicArray = new DynamicArray(3);
        Object obj = new Object();
        Object obj1 = new Object();
        dynamicArray.add(new Object());
        dynamicArray.add(new Object());
        dynamicArray.add(obj);
        assertEquals("testContainsTrue", true, dynamicArray.contains(obj));
        assertEquals("testContainsFalse", false, dynamicArray.contains(obj1));
    }

    public static void testToArray() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        DynamicArray dynamicArray = new DynamicArray(3);
        dynamicArray.add(obj1);
        dynamicArray.add(obj2);
        dynamicArray.add(obj3);
        Object[] expected = new Object[3];
        expected[0] = obj1;
        expected[1] = obj2;
        expected[2] = obj3;
        assertEquals("testToArray", expected, dynamicArray.toArray());
    }

    public static void testListIteratorsHasNext() {
        DynamicArray dynamicArray = new DynamicArray();
        DynamicArray.ListIteratorImpl listIterator = dynamicArray.listIterator(0);
        dynamicArray.add(1);
        assertEquals("testListIteratorsHasNextFalse", false, listIterator.hasNext());
        dynamicArray.add(1);
        assertEquals("testListIteratorsHasNextTrue", true, listIterator.hasNext());
    }

    public static void testListIteratorsNext() {
        DynamicArray dynamicArray = new DynamicArray();
        Object obj = new Object();
        dynamicArray.add(obj);
        DynamicArray.ListIteratorImpl listIterator = dynamicArray.listIterator(0);
        assertEquals("testListIteratorsHasNext", obj, listIterator.next());
    }

    public static void testListIteratorsHasPrevious() {
        DynamicArray dynamicArray = new DynamicArray();
        DynamicArray.ListIteratorImpl listIterator = dynamicArray.listIterator(0);
        assertEquals("testListIteratorsHasPreviousFalse", false, listIterator.hasPrevious());
        listIterator.add(1);
        assertEquals("testListIteratorsHasPreviousTrue", true, listIterator.hasPrevious());
    }

    public static void testListIteratorsPrevious() {
        DynamicArray dynamicArray = new DynamicArray();
        Object obj = new Object();
        dynamicArray.add(obj);
        DynamicArray.ListIteratorImpl listIterator = dynamicArray.listIterator(1);
        assertEquals("testListIteratorsPrevious", obj, listIterator.previous());
    }

    public static void testListIteratorsNextIndex() {
        DynamicArray dynamicArray = new DynamicArray();
        DynamicArray.ListIteratorImpl listIterator = dynamicArray.listIterator(0);
        listIterator.add(1);
        listIterator.add(1);
        assertEquals("testListIteratorsNextIndex", 2, listIterator.nextIndex());
    }

    public static void testListIteratorsPreviousIndex() {
        DynamicArray dynamicArray = new DynamicArray();
        DynamicArray.ListIteratorImpl listIterator = dynamicArray.listIterator(0);
        listIterator.add(1);
        listIterator.add(1);
        assertEquals("testListIteratorsPreviousIndex", 1, listIterator.previousIndex());
    }

    public static void testListIteratorsRemove() {
        DynamicArray dynamicArray = new DynamicArray();
        Object obj = new Object();
        Object obj1 = new Object();
        dynamicArray.add(obj);
        dynamicArray.add(obj1);
        DynamicArray.ListIteratorImpl listIterator = dynamicArray.listIterator(0);
        listIterator.next();
        listIterator.remove();
        assertEquals("testListIteratorsRemove", obj1, listIterator.next());
    }

    public static void testListIteratorSet() {
        DynamicArray dynamicArray = new DynamicArray();
        Object obj = new Object();
        Object obj1 = new Object();
        dynamicArray.add(new Object());
        dynamicArray.add(obj);
        DynamicArray.ListIteratorImpl listIterator = dynamicArray.listIterator(0);
        listIterator.next();
        listIterator.set(obj1);
        assertEquals("testListIteratorSet", obj1, listIterator.previous());
    }

    public static void testListIteratorsAdd() {
        DynamicArray dynamicArray = new DynamicArray();
        Object obj = new Object();
        DynamicArray.ListIteratorImpl listIterator = dynamicArray.listIterator(0);
        listIterator.add(obj);
        assertEquals("testListIteratorsAdd", obj, listIterator.previous());
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