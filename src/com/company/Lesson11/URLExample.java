package com.company.Lesson11;

import java.io.*;
import java.net.*;

public class URLExample {
    static URL itstep;
    public static void main(String[] args) throws IOException {

        try {
            itstep = new URL("https://itstep.dp.ua/news?hello");
        }catch (MalformedURLException e) {
            e.printStackTrace();
        }

        //openConnectionMethod();
        //openStreamMethod();
        //openStreamWriteMethod();
        //info();
    }



    //ctrl+alt+m
    private static void openConnectionMethod() throws IOException {
        InputStream inputStream = itstep.openConnection().getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        reader.readLine();
    }
    private static void openStreamMethod() throws IOException {
        InputStream inputStream = itstep.openStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        reader.readLine();
    }
    private static void openStreamWriteMethod() throws IOException {
        URL txt = new URL("file:///C:/Users/Evgeniy/PA812/index.txt");
        OutputStream outputStream = txt.openConnection().getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        writer.write("hello from openStreamWriteMethod");
    }

    public static void  info(){
        System.out.println(itstep.getHost());
        System.out.println(itstep.getQuery());
        System.out.println(itstep.getProtocol());
        System.out.println(itstep.getAuthority());
    }
}
