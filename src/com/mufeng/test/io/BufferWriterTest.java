package com.mufeng.test.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterTest {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("readme3.txt"))) {
            bw.newLine(); // 开新的一行, 即第二行
            bw.write("彳亍彳亍彳亍");
            bw.flush();
            System.out.println("写入成功");
        } catch (IOException e ) {
            e.printStackTrace();
        }
    }
}
