package com.mufeng.test.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputWriterTest {
    public static void main(String[] args) {
        try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("readme3.txt"))) {
            osw.write("Hello World");
            osw.flush();
        } catch (IOException e ) {
            e.printStackTrace();
        }
    }
}
