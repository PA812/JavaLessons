package com.company.Lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;

public class EchoServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1000);
             Socket clientSocket = serverSocket.accept();
             BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)//flush - немедленная отправка данных
             ) {
            System.out.println("Connection at " + clientSocket.getRemoteSocketAddress());
            writer.println("This is echo server. Type Bye to exit");
            String inputLine;
            while ((inputLine = reader.readLine())!=null){
                System.out.println(LocalTime.now() +" "+ inputLine);
                writer.println(inputLine);
                if(inputLine.toLowerCase().equals("bye")){
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

