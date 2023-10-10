package com.mufeng.test.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class BufferReaderTest {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("readme2.txt"))) {
//            System.out.println(br.readLine());
            // stream操作
            List<Integer> list =  br.lines().mapToInt(String::length).boxed().collect(Collectors.toList());
            System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
