package com.company;

/**
 * Created by N on 10.05.2017.
 */
public class MyHashMap {

private int capacity;
private



    static class Entry {
        final int hash;
        final int key;
        long value;
        Entry next;

        public Entry(int hash, int key, long value, Entry next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public int getKey() {
            return key;
        }

        public long getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "Entry" +
                    "key = " + key +
                    ", value = " + value +
                    '}';
        }
    }
}
