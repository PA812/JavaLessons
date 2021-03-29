package com.company.Lesson9;

import java.time.LocalTime;

public class InterruptExample {

    static class WorkedThread extends Thread {

        public WorkedThread() {
            super(WorkedThread.class.getSimpleName());
        }

        @Override
        public void run() {
            SleepThread sleepThread  = new SleepThread();
            //sleepThread.setDaemon(true);
           sleepThread.start();
//            try {
//                //sleepThread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            int sum = 0;
            System.out.println(getName() + "Start thread " + LocalTime.now());
            for (int i = 0; i < 2000000000; i++) {
                sum += i;
                //System.out.println("i = " + i);
//                if(i%100 == 0 && isInterrupted()){
//                    System.out.println("Loop is interrupted at i=" + i + " " + LocalTime.now());
//                    break;
//                }
            }
//                System.out.println("sum = " + sum);
            System.out.println(getName() +"End thread " + LocalTime.now());
        }
    }

    static class SleepThread extends Thread{

        public SleepThread() {
            super(SleepThread.class.getSimpleName());
        }

        @Override
        public void run() {
            System.out.println(getName() + "Start thread " + LocalTime.now());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() +"End thread " + LocalTime.now());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WorkedThread workedThread = new WorkedThread();
        SleepThread sleepThread = new SleepThread();

        //sleepThread.setDaemon(true);
        //workedThread.setDaemon(true);

        //запуск
        //System.out.println("Запуск потоков: " + LocalTime.now());
        workedThread.start();
        //sleepThread.start();
        //Thread.sleep(2000);



        Thread.sleep(100);

        //присоединяем наши потоки к методу main
        //System.out.println("join threads");
        //workedThread.join();
        //sleepThread.join();

        //System.out.println("Interrupting threads " + LocalTime.now());
        //workedThread.interrupt();
        //sleepThread.interrupt();
        System.out.println(Thread.currentThread().getName() +" done " + LocalTime.now());


    }
}
