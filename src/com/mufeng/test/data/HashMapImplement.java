package com.mufeng.test.data;

import java.util.List;
import java.util.ArrayList;

// 基于数组对哈希表的实现
public class HashMapImplement {
    private List<Pair> buckets;

    public HashMapImplement(int size) {
        buckets = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            buckets.add(null);
        }
    }

    private int hashFunction(int key) {
        return key % buckets.size();
    }

    public void put(int key, String value) {
        int index = hashFunction(key);
        Pair pair = new Pair(key, value);
        buckets.set(index, pair);
    }

    public Pair get(int key) {
        int index = hashFunction(key);
        Pair pair = buckets.get(index);
        if (pair == null)
            return null;
        return pair;
    }

    public void remove(int key) {
        int index = hashFunction(key);
        buckets.set(index, null);
    }

    public List<Pair> pairSet() {
        ArrayList<Pair> pairs = new ArrayList<>();
        for (Pair pair : buckets) {
            if (pair != null)
                pairs.add(pair);
        }
        return pairs;
    }

    public List<Integer> keySet() {
        ArrayList<Integer> keys = new ArrayList<>();
        for (Pair pair : buckets) {
            if (pair != null)
                keys.add(pair.getKey());
        }
        return keys;
    }

    public List<String> valueSet() {
        ArrayList<String> values = new ArrayList<>();
        for (Pair pair : buckets) {
            if (pair != null)
                values.add(pair.getValue());
        }
        return values;
    }

    public void print(){
        for (Pair pair : pairSet()) {
            System.out.println(pair.getKey() + "->" + pair.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapImplement hs = new HashMapImplement(10);
        hs.put(1, "A");
        hs.put(2, "B");
        hs.put(3, "C");
        hs.remove(3);
        System.out.println(hs.keySet());
        System.out.println(hs.valueSet());
        System.out.println(hs.pairSet());;
        hs.print();
    }

}
