package com.company.Lesson9;

public class ThreadRunnableExample {

    static class HelloTread extends Thread {
        public HelloTread() {
        }

        @Override
        public void run() {
            System.out.println("Hello from thread " + getName() + " " + getId());
        }
    }

    static class HelloRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("Hello from runnable " + Thread.currentThread().getName() + " "
            + Thread.currentThread().getId());
        }
    }


    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            HelloTread helloTread = new HelloTread();
            helloTread.start();//запуск процессов

            HelloRunnable helloRunnable = new HelloRunnable();
            Thread thread = new Thread(helloRunnable);
            thread.start();


            new Thread(() -> System.out.println("Runnable lambda " + Thread.currentThread().getName() + " " +
                    Thread.currentThread().getId())).start();


        }
    }
}
