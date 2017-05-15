package com.company;

/**
 * Created by N on 11.05.2017.
 */
public class MyHashMap2<Key, Value> {

    private int capacity;
    private int size;
    Entry<Key, Value>[] table;

    public MyHashMap2(int capacity) {
        this.capacity = capacity;
        table = newTable();
        System.out.println(table.length);
    }

    public MyHashMap2() {
        this.capacity = 16;
        table = newTable();
        System.out.println(table.length);
    }
    public int size(){
        return size;
    }
    public int getCapacity() {
        return capacity;
    }

    static class Entry<Key, Value>{
        final int hash;
        final Key key;
        Value value;

        public Entry(int hash, Key key, Value value) {
            this.hash = hash;
            this.key = key;
            this.value = value;
        }

        public Key getKey() {
            return key;
        }

        public Value getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "Entry: w" +
                    "key = " + key +
                    ", value = " + value;
        }
    }
    public Value get(Key key) {
        Entry<Key,Value> entry;
        return (entry = getEntry(generateHash(key), key)) == null ? null : entry.value;
    }
    final Entry<Key, Value> getEntry(int hash, Key key){
        int hashNeeded;
        Entry<Key, Value> first;
        if (table!=null&&table.length!=0&&(first=table[hashNeeded=hash])!=null){
            if (first.hash==hash&&first.key==key||key!=null&&key.equals(first.key)){
                return first;
            }
        }
        return null;
    }
    public void put(Key key, Value value){
        putValue(generateHash(key), key, value);
        size++;
    }
    private Entry<Key, Value>[] newTable(){
        return (Entry<Key, Value>[])new Entry[capacity];
    }
    final void putValue(int hash, Key key, Value value){
        int hashForTable;
        Entry<Key, Value> check;
        if ((check = table[hashForTable = hash])==null){
            table[hashForTable] = newEntry(hash, key, value);
            System.out.println(table[hashForTable]);
        } else {
            Entry<Key, Value> possibleNew;
            if (check.hash==hash&&check.key==key||key!=null&&key.equals(check.key)){
                possibleNew = check;
            }
        }
    }

    Entry<Key, Value> newEntry(int hash, Key key, Value value){
        return new Entry<>(hash, key, value);
    }

     final int generateHash(Key key){
        return key == null ? 0 : key.hashCode() >= capacity ? (0 - (capacity-key.hashCode())+1):key.hashCode();
    }
}
