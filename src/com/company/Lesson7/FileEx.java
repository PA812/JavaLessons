package com.company.Lesson7;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileEx {
    public static void main(String[] args) {
        Path pathToFile = Paths.get("C:\\Users\\Lukashyk\\Desktop\\desktop.txt");
        System.out.println("pathToFile = " + pathToFile);
        File file = new File("C:\\Users\\Lukashyk\\Desktop\\desktop.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            System.out.println("reader.readLine() = " + reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
