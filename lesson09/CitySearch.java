package com.getjavajob.training.algo1702.gultiaeve.lesson09;


import java.util.SortedSet;


public class CitySearch {

    public static SortedSet<String> getElementsWithPrefix(SortedSet<String> allElements, String prefix) {
        String endpoint = incrementPrefix(prefix);
        return allElements.subSet(prefix, endpoint);
    }

    private static String incrementPrefix(final String prefix) {
        StringBuilder sb = new StringBuilder(prefix);
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == Character.MAX_VALUE) {
            sb.setLength(sb.length() - 1);
        }
        sb.setCharAt(sb.length() - 1, (char) (sb.charAt(sb.length() - 1) + 1));
        return sb.toString();
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