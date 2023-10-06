package com.mufeng.test.data;

public class HashTable<E> {
    private final int TABLE_SIZE = 10;
    private final Node<E>[] Table = new Node[TABLE_SIZE];

    public HashTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            Table[i] = new Node<E>(null);
        }
    }

    public void insert(E obj) {
        int index = hash(obj);
        Node<E> head = Table[index];
        Node<E> node = new Node<>(obj);
        node.next = head.next;
        head.next = node;
    }

    public boolean contains(E obj) {
        int index = hash(obj);
        Node<E> node = Table[index].next;
        while (node != null) {
            if (node.element == obj) return true;
            node = node.next;
        }
        return false;
    }

    public void remove(int index) {
        if (Table[index] != null)
            Table[index] = null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < TABLE_SIZE; i++) {
           Node<E> node = Table[i].next;
           while(node != null) {
               stringBuilder.append(node.element).append("->");
               node = node.next;
           }
           stringBuilder.delete(stringBuilder.length()-2, stringBuilder.length()).append("\n");
        }
        return stringBuilder.toString();
    }

    private int hash(E obj) {
        return obj.hashCode() % TABLE_SIZE;
    }

    private static class Node<E> {
        private Node<E> next;
        private final E element;

        private Node(E element) {
            this.element = element;
        }
    }
}
