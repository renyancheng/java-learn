package com.mufeng.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("test.properties"));
        properties.put("lbw", "nb");
        properties.list(new PrintStream(System.out));

//        System.out.println(properties.get("lbw"));
    }
}
