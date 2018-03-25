package com.getjavajob.training.algo1702.gultiaeve.lesson04;


import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;
import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.fail;

public class DoublyLinkedListTest {

    public static void main(String[] args) {
        testAddElementToTheEnd();
        testAddElementToTheIndiceWithException();
        testAddElementToTheFirstIndice();
        testAddElementToTheLastIndice();
        testAddElementToTheMiddleIndice();
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
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Object obj1 = new Object();
        doublyLinkedList.add(obj1);
        Object[] expected = new Object[1];
        expected[0] = obj1;
        assertEquals("testAddElementToTheEnd", expected, doublyLinkedList.toArray());
    }

    public static void testAddElementToTheIndiceWithException() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        String msg = "index <= 0 || index >= size";
        try {
            doublyLinkedList.add(5, new Object());
            fail(msg);
        } catch (Exception e) {
            assertEquals("testAddElementToTheIndice", msg, e.getMessage());
        }
    }

    public static void testAddElementToTheFirstIndice() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        doublyLinkedList.add(obj2);
        doublyLinkedList.add(obj3);
        doublyLinkedList.add(obj4);
        doublyLinkedList.add(0, obj1);
        Object[] expected = new Object[4];
        expected[0] = obj1;
        expected[1] = obj2;
        expected[2] = obj3;
        expected[3] = obj4;
        assertEquals("testAddElementToTheFirstIndice", expected, doublyLinkedList.toArray());
    }

    public static void testAddElementToTheLastIndice() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        doublyLinkedList.add(obj1);
        doublyLinkedList.add(obj2);
        doublyLinkedList.add(obj4);
        doublyLinkedList.add(2, obj3);
        Object[] expected = new Object[4];
        expected[0] = obj1;
        expected[1] = obj2;
        expected[2] = obj3;
        expected[3] = obj4;
        assertEquals("testAddElementToTheLastIndice", expected, doublyLinkedList.toArray());
    }

    public static void testAddElementToTheMiddleIndice() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        doublyLinkedList.add(obj1);
        doublyLinkedList.add(obj3);
        doublyLinkedList.add(obj4);
        doublyLinkedList.add(1, obj2);
        Object[] expected = new Object[4];
        expected[0] = obj1;
        expected[1] = obj2;
        expected[2] = obj3;
        expected[3] = obj4;
        assertEquals("testAddElementToTheMiddleIndice", expected, doublyLinkedList.toArray());
    }

    public static void testGetElementWithException() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        String msg = "index <= 0 || index >= size";
        try {
            doublyLinkedList.get(0);
            fail(msg);
        } catch (Exception e) {
            assertEquals("testGetElementWithException", msg, e.getMessage());
        }
    }

    public static void testGet() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Object obj = new Object();
        doublyLinkedList.add(obj);
        assertEquals("testGet", obj, doublyLinkedList.get(0));
    }

    public static void testRemoveReturnableElementWithException() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        String msg = "index <= 0 || index > size";
        try {
            doublyLinkedList.remove(5);
            fail(msg);
        } catch (Exception e) {
            assertEquals("testRemoveReturnableElementWithException", msg, e.getMessage());
        }
    }

    public static void testRemoveReturnableElementFromTheFirstIndice() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        doublyLinkedList.add(obj1);
        doublyLinkedList.add(obj2);
        doublyLinkedList.add(obj3);
        assertEquals("testRemoveReturnableElementFromTheFirstIndiceReturn", obj1, doublyLinkedList.remove(0));
        Object[] expected = new Object[2];
        expected[0] = obj2;
        expected[1] = obj3;
        assertEquals("testRemoveReturnableElementFromTheFirstIndice", expected, doublyLinkedList.toArray());
    }

    public static void testRemoveReturnableElementFromTheMiddleIndice() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        doublyLinkedList.add(obj1);
        doublyLinkedList.add(obj2);
        doublyLinkedList.add(obj3);
        assertEquals("testRemoveReturnableElementFromTheMiddleIndiceReturn", obj2, doublyLinkedList.remove(1));
        Object[] expected = new Object[2];
        expected[0] = obj1;
        expected[1] = obj3;
        assertEquals("testRemoveReturnableElementFromTheMiddleIndice", expected, doublyLinkedList.toArray());
    }

    public static void testRemoveReturnableElementFromTheLastIndice() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        doublyLinkedList.add(obj1);
        doublyLinkedList.add(obj2);
        doublyLinkedList.add(obj3);
        Object actual = doublyLinkedList.remove(2);
        assertEquals("testRemoveReturnableElementFromTheLastIndiceReturn", obj3, actual);
        Object[] expected = new Object[2];
        expected[0] = obj1;
        expected[1] = obj2;
        assertEquals("testRemoveReturnableElementFromTheLastIndice", expected, doublyLinkedList.toArray());
    }

    public static void testRemoveElementWithException() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        String msg = "index <= 0 || index > size";
        try {
            doublyLinkedList.remove(1);
            fail(msg);
        } catch (Exception e) {
            assertEquals("testRemoveElementWithException", msg, e.getMessage());
        }
    }

    public static void testRemoveNonexistantElementFromTheFirstIndice() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object nonexistant = new Object();
        doublyLinkedList.add(obj1);
        doublyLinkedList.add(obj2);
        doublyLinkedList.add(obj3);
        assertEquals("testRemoveNonexistantElementFromTheFirstIndice", false, doublyLinkedList.remove(nonexistant));
    }

    public static void testRemoveElementFromTheFirstIndice() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        doublyLinkedList.add(obj1);
        doublyLinkedList.add(obj2);
        doublyLinkedList.add(obj3);
        Object[] expected = new Object[2];
        expected[0] = obj2;
        expected[1] = obj3;
        assertEquals("testRemoveElementFromTheFirstIndiceReturn", true, doublyLinkedList.remove(obj1));
        assertEquals("testRemoveElementFromTheFirstIndice", expected, doublyLinkedList.toArray());
    }

    public static void testRemoveElementFromTheMiddleIndice() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        doublyLinkedList.add(obj1);
        doublyLinkedList.add(obj2);
        doublyLinkedList.add(obj3);
        Object[] expected = new Object[2];
        expected[0] = obj1;
        expected[1] = obj3;
        assertEquals("testRemoveElementFromTheMiddleIndiceReturn", true, doublyLinkedList.remove(obj2));
        assertEquals("testRemoveElementFromTheMiddleIndice", expected, doublyLinkedList.toArray());
    }

    public static void testRemoveElementFromTheLastIndice() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        doublyLinkedList.add(obj1);
        doublyLinkedList.add(obj2);
        doublyLinkedList.add(obj3);
        Object[] expected = new Object[2];
        expected[0] = obj1;
        expected[1] = obj2;
        assertEquals("testRemoveElementFromTheLastIndiceReturn", true, doublyLinkedList.remove(obj3));
        assertEquals("testRemoveElementFromTheLastIndice", expected, doublyLinkedList.toArray());
    }

    public static void testSize() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.add(new Object());
        doublyLinkedList.add(new Object());
        doublyLinkedList.add(new Object());
        assertEquals("testSize", 3, doublyLinkedList.size());
    }

    public static void testToArray() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.add(obj1);
        doublyLinkedList.add(obj2);
        doublyLinkedList.add(obj3);
        Object[] expected = new Object[3];
        expected[0] = obj1;
        expected[1] = obj2;
        expected[2] = obj3;
        assertEquals("testToArray", expected, doublyLinkedList.toArray());
    }

    public static void testListIteratorsHasNext() {
        DoublyLinkedList dynamicArray = new DoublyLinkedList();
        dynamicArray.add(1);
        DoublyLinkedList.ListIteratorImpl listIterator = (DoublyLinkedList.ListIteratorImpl) dynamicArray.listIterator(0);
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