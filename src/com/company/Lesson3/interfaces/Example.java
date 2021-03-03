package com.company.Lesson3.interfaces;

public interface Example {

    void example(String str);

    default void meth(){
        System.out.println("default");
    }
}
