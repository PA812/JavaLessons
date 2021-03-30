package com.company.Lesson10;

import java.util.concurrent.atomic.AtomicLong;

public class WaitNotifyExample {
    public static void main(String[] args) throws InterruptedException {

        Account1 account = new Account1(0);

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                account.deposit(1);
            }
        });
        thread.start();
        //thread.join();

        //account.withdraw(50000);
        account.waitAndWithdraw(5);

        System.out.println("account = " + account.getBalance());

    }
}

class Account1 {

    private long balance;


    public Account1(long balance) {
        this.balance = balance;

    }

    public long isBalance() {
        return balance;

    }

    public void setBalance(long balance) {
        this.balance = balance;

    }

    public long getBalance() {
        return balance;

    }

    public synchronized void deposit(long amount) {
        balance += amount;
        notify();

    }

    public void withdraw(long amount) {
        checkNonNegativeAmount(amount);
        balance -= amount;

    }

    public synchronized void waitAndWithdraw(long amount) throws InterruptedException {
        checkNonNegativeAmount(amount);
        while (balance<amount){
            wait();
        }
        withdraw(amount);


    }

    public void checkNonNegativeAmount(long amount) {
        if (amount < 0) {
            System.err.println("Negative amount");
        }
    }
}

