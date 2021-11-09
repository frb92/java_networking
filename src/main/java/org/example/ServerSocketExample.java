package org.example;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketExample {
    public static void main(String[] args) throws Exception{
        ServerSocket srvSocket = new ServerSocket(300);
        Socket socket = srvSocket.accept();
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
        writer.println("HTTP/1.1 200 OK");
        writer.println("Content-type: text/html; charset=UTF-8");
        writer.println("Connection: Keep-Alive");
        writer.println();

        System.out.println("Write text: ");
        Scanner scaner = new Scanner(System.in);
        String str = null;
        while ( !(str = scaner.nextLine()).equals("Exit") ){
            writer.println(str);
        }
        scaner.close();
        socket.close();

    }
}
