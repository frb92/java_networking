package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerSocketMultiThread {
    public static void main(String[] args) throws Exception{
        ServerSocket srvSocket = new ServerSocket(300);
        ExecutorService executor = Executors.newFixedThreadPool(10);
        while (true){
            final Socket socket = srvSocket.accept();
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                try {
                    BufferedWriter writer = new BufferedWriter(
                            new OutputStreamWriter(socket.getOutputStream())
                    );
                    writer.write("Hello from Srv!");
                    writer.flush();
                    socket.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
                }
            };
            executor.submit(runnable);
        }
    }
}
