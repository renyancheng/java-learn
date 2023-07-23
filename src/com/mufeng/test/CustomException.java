package com.mufeng.test;

public class CustomException extends Exception {
    private int detail;

    public CustomException(int num) {
        this.detail = num;
    }

    @Override
    public String toString() {
        return "CustomException{" + "detail=" + detail + '}';
    }
}
