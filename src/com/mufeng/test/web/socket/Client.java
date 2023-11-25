package com.mufeng.test.web.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080)) {
            System.out.println("连接成功！");
            System.out.println(socket.getInetAddress().getHostAddress());
            Scanner sc = new Scanner(System.in);
            OutputStream outputStream = socket.getOutputStream();
            try (FileInputStream fileInputStream = new FileInputStream("readme3.txt")) {
                byte[] bytes = new byte[1024];
                int i;
                while((i = fileInputStream.read(bytes))!=-1){
                    outputStream.write(bytes, 0, i);
                }
                fileInputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.out.println("连接失败！");
            e.printStackTrace();
        }
    }
}
