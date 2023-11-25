package com.mufeng.test.io;

import java.io.File;

public class FileExercise {
    public static void main(String[] args) {
        File dir = new File("c:/Windows");
        File[] files = dir.listFiles();
        long maxByte = 0L;
        int maxIdx = 0;
        long minByte = 100 * 100 * 100 * 100 * 9999999L;
        int minIdx = 0;
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                long space = files[i].getTotalSpace();
                if (space > maxByte) {
                    maxByte = space;
                    maxIdx = i;
                }
                if (space < minByte) {
                    minByte = space;
                    minIdx = i;
                }
            }
            for (File file :
                    files) {
                System.out.println(file.getName());
            }
            System.out.println("最大的文件是" + files[maxIdx].getName() + "有" + maxByte + "b大");
            System.out.println("最小的文件是" + files[minIdx].getName() + "有" + minByte + "b大");
        }
    }
}
