package com.company.Lesson4.throws_exception;

public class Main {
    public static void main(String[] args) throws InterruptedException, MyExceptionClass {
        AppThrows app = new AppThrows();

        System.out.println("Start test");

        try {
            app.sleepOneSec();
        } catch (InterruptedException e) {
            System.out.println("Main catch exception");
        }finally {
            System.out.println("Test ok");
        }

        throw new MyExceptionClass();
    }
}
