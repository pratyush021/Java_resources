package hashmap; 

import hashmap.TestList; 

class TestMap<T, V> {

    private T[] buckets;

    @SuppressWarnings({})
    TestMap() {
        double loadFactor = 0.75;
        int size = 16;

        buckets = (T[]) new Object[size + 1];
    }

    public void put(T t, V v) {
        // t -> key, v -> value
        int hashcode = t.hashCode();

    }

    public static void main(String[] args) {
        TestList list = new TestList("test");
        System.out.println("testing...");

    }

}
