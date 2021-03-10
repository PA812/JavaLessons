package com.company.Lesson3.exaptions;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) throws InterruptedException{

        String str = "";


            Thread.sleep(1000);


        try (TestCloseApp app = new TestCloseApp()) {
            app.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //try с ресурсами - не нужно закрывать потоки
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите первое число");
            int first = scanner.nextInt();
            System.out.println("Введите второе число");
            int second = scanner.nextInt();
            int[] arr = new int[first];
            for (int i = 0; i < arr.length + 1; i++) {
                arr[i] = second + i;
                System.out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

            Thread.sleep(100);

        System.out.println("Ok");
    }
}
