package com.mufeng.test.genericity;

public class Genericity01<T> {
    private final T var;

    public Genericity01(T var) {
        this.var = var;
    }

    public T getVar() {
        return this.var;
    }

    public static <T> T test() {
        return null;
    }
}
