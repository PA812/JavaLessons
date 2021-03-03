package com.company.Lesson3.exaptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Введите первое число");
            int first = scanner.nextInt();
            System.out.println("Введите второе число");
            int second = scanner.nextInt();
            int res = first / second;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("на ноль делить нельзя " + e.getMessage());
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("Scanner closed");
            }
        }
        System.out.println("Test passed");
    }
}
