package com.mufeng.test;

public class SparseArray {
    public static void main(String[] args) {
        // 创建一个二维数组
        int[][] array = new int[10][10];


        //在数组中定义几个具体的数
        array[4][4] = 32;
        array[5][1] = 16;
        array[7][2] = 22;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        // 记录有效值的个数
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 0) sum++;
            }
        }
        System.out.println("有效个数有：" + sum + "个");
        // 保存在稀疏数组中
        int[][] sparseArray = new int[sum + 1][3];
        sparseArray[0][0] = 10;
        sparseArray[0][1] = 10;
        sparseArray[0][2] = sum;


        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 0) {
                    sparseArray[count + 1][0] = i;
                    sparseArray[count + 1][1] = j;
                    sparseArray[count + 1][2] = array[i][j];
                    count++;
                }
            }
        }
        // 打印稀疏数组
        for (int i = 1; i < sparseArray.length; i++) {
            for (int j = 0; j < sparseArray[i].length; j++) {
                System.out.print(sparseArray[i][j] + "\t");
            }
            System.out.println();
        }
        // 用稀疏数组还原二维数组
        int[][] array2 = new int[sparseArray[0][0]][sparseArray[0][1]];
        for (int i = 1; i < sparseArray.length; i++) {
            array2[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }

        // 打印出还原的数组
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
