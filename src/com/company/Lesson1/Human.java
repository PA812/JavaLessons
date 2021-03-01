package com.company.Lesson1;


public interface Human {

    void learning();

    default void show() {
        System.out.println("show Human");
    }

    static void walk() {
        System.out.println("walking");
    }

}
