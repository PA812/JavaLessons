package com.company.Lesson10;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class StruggleForResources {
    public static void main(String[] args) throws InterruptedException {
        race();



        StringBuilder str1 = new StringBuilder();//не многопоточный
        StringBuffer str2 = new StringBuffer();//многопоточный!!!
        str1.append("");
        str2.append("");

    }

    public static void race() throws InterruptedException {
        long start = System.currentTimeMillis();

        Account account = new Account(1000000);
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 20000; i++) {
                account.deposit(1);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 20000; i++) {
                account.withdraw(1);
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

//        for (int i = 0; i < 20000; i++) {
//                account.deposit(1);
//           }
//
//        for (int i = 0; i < 20000; i++) {
//                account.withdraw(1);
//            }


        long finish = System.currentTimeMillis();

        System.out.println("account = " + account.getBalance() + " " + (finish-start)+"mc");

    }
}


class Account {

    AtomicLong balance = new AtomicLong();

    //private long balance;

    Object locker = new Object();

    public Account(long balance) {
        //this.balance = balance;
        this.balance.getAndAdd(balance);
    }

    public long isBalance() {
        //return balance;
        return balance.get();
    }

    public void setBalance(long balance) {
        //this.balance = balance;
        this.balance.set(balance);
    }

    public long getBalance() {
        //return balance;
        return balance.get();
    }

    public synchronized void deposit(long amount) {
       // synchronized (locker) {//Синхронизация блоков
            //balance += amount;
            balance.getAndAdd(amount);
        //}

    }

    public synchronized void withdraw(long amount) {
        //synchronized (locker) {//Синхронизация блоков
            //balance -= amount;
            balance.getAndAdd(-amount);
        //}
    }


}