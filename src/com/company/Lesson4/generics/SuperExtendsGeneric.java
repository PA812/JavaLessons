package com.company.Lesson4.generics;

public class SuperExtendsGeneric<T, V extends Number> { //   ↓= extends ↑
    private T object;
    private V number;


    //    ↑ super ↓=
    public void method(SuperExtendsGeneric<? super StringBuffer,?>superExtendsGeneric){
    }

    public T[] array(T...t){
        return t;
    }

}

class RunApp{
    public static void main(String[] args) {
        SuperExtendsGeneric<Boolean, Integer> generic = new SuperExtendsGeneric<>();
        SuperExtendsGeneric<StringBuffer, Integer> generic1 = new SuperExtendsGeneric<>();
        generic.method(generic1);
        Boolean[]arr = {true, false, false, true, true, false};
        Boolean[] array = generic.array(arr);
    }
}