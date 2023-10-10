package com.mufeng.test.io;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        /*File f1 = new File("test.txt");
        System.out.println(f1.getAbsoluteFile());
        String parentDir = f1.getParent();
        File parentDirFile = f1.getParentFile();*/
        File dir1 = new File("d:/Download");
        readFolder(dir1);
        /*String[] files = dir1.list();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                if (i != files.length - 1) {
                    System.out.println(files[i]);
                } else {
                    System.out.print(files[i]);
                }
            }
        }*/
    }


    // 递归遍历文件夹的所有文件
    public static void readFolder(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            File currFile;
            for (int i = 0; i < files.length; i++) {
                currFile = files[i];
                if (currFile.isDirectory()) readFolder(currFile);
                else if (currFile.isFile()) System.out.println(currFile.getName());
            }
        }
    }

}
