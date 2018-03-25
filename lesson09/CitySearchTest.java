package com.getjavajob.training.algo1702.gultiaeve.lesson09;


import java.util.TreeSet;

import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;


public class CitySearchTest {

    public static void main(String[] args) {
        testGetElementsWithPrefix();
    }

    public static void testGetElementsWithPrefix() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("ab" + Character.MAX_VALUE + Character.MAX_VALUE + "cd");
        CitySearch citySearch = new CitySearch();
        assertEquals("testGetElementsWithPrefix()", "[ab￿￿cd]", citySearch.getElementsWithPrefix(treeSet, "ab").toString());
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