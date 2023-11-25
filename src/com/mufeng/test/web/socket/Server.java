package com.mufeng.test.web.socket;

import com.sun.security.jgss.GSSUtil;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("等待连接服务器....");
            Socket socket = serverSocket.accept();
            System.out.println("连接成功:" + socket.getInetAddress().getHostAddress());
            InputStream inputStream = socket.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream("files/socket/test.txt");
            byte[] bytes = new byte[1024];
            int i;
            while ((i = inputStream.read(bytes)) != -1){
                fileOutputStream.write(bytes, 0, i);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            System.out.println("文件传输成功！");
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
