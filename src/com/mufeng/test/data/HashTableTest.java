package com.mufeng.test.data;

public class HashTableTest {
    public static void main(String[] args) {
        HashTable<Integer> hashTable = new HashTable<>();
        for (int i = 0; i < 100; i++) {
            hashTable.insert(i);
        }
        System.out.println(hashTable);
    }
}
