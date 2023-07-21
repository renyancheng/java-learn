package com.mufeng.test;

public class ExceptionTest {


    public static void main(String[] args) throws CustomException {
        /*int a = 0;
        int b = 1;
        // ctrl + alt + t
        try {
            System.out.println(b / a);
        } catch (Exception e) {
            System.out.println("exception: " + e);
        } finally {
            System.out.println("finally");
        }*/
        try {
            test(13);
        } catch (CustomException e) {
            throw new CustomException(13);
        }
    }

    public static void test(int num) throws CustomException{
        if (num>10) throw new CustomException(num);
    }
}
