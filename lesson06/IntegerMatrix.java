package com.getjavajob.training.algo1702.gultiaeve.lesson06;


import java.util.HashMap;
import java.util.Map;

public class IntegerMatrix implements Matrix<Integer> {

    private Map<MapsKey, Integer> hashMap = new HashMap<>();

    @Override
    public Integer get(int i, int j) {
        return hashMap.get(new MapsKey(i, j));
    }

    @Override
    public void set(int i, int j, Integer value) {
        hashMap.put(new MapsKey(i, j), value);
    }

    private static class MapsKey {
        private int key;
        private int value;

        public MapsKey(int i, int j) {
            this.key = i;
            this.value = j;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            MapsKey mapsKey = (MapsKey) o;

            if (key != mapsKey.key) {
                return false;
            }
            return value == mapsKey.value;
        }

        @Override
        public int hashCode() {
            int result = key;
            result = 31 * result + value;
            return result;
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