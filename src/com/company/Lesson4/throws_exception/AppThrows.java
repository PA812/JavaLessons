package com.company.Lesson4.throws_exception;

public class AppThrows {

    public void sleepOneSec() throws InterruptedException {
        throw new InterruptedException();//throw - генерирует исключение
    }

}
