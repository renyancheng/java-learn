package com.mufeng.test.io;

import java.io.*;

public class DateStreamTest {
    public static void main(String[] args) {

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("test4.txt"))) {
            dos.writeBoolean(true); // 写入的是二进制数据
            try (DataInputStream dis = new DataInputStream(new FileInputStream("test4.txt"))) {
                System.out.println(dis.readBoolean());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
