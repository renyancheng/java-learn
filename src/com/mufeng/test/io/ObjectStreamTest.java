package com.mufeng.test.io;

import java.io.*;

public class ObjectStreamTest {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test5.txt")); ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test5.txt"))) {
            Test test = new Test();
            oos.writeObject(test);
            Test test2 = (Test) ois.readObject();
            test2.print();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
