package com.company.Lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.time.LocalTime;

public class SocketClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1000);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {

            String user = reader.readLine();//вывод информации от СЕРВЕРА
            System.out.println(user);
            while (true) {
                System.out.println(">>>");
                user = console.readLine();
                if(user == null || user.toLowerCase().equals("bye")){
                    break;
                }
                writer.println(user);//пишем сообщение серверу
                System.out.println(LocalTime.now() + " " + reader.readLine());//тут же от него получам ответ
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
