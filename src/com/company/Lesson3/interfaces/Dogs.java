package com.company.Lesson3.interfaces;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Dogs implements Animal, Serializable {

    public void showDog(){
        Animal.show();
        System.out.println(" Dod");
    }

    public void switchEx(String choice){
        switch (choice) {
            case "one" -> System.out.println("one");
            case "two" -> System.out.println("two");
        }
    }

    public Function<String, Integer> lambdaExample(Function<String,Integer> function){
        return function;
    }

    @Override
    public void example(String str) {
        System.out.println(str);
    }
}


class FuncImpl implements Function<String, Integer>{
    @Override
    public Integer apply(String s) {
        return Integer.parseInt(s);
    }
}

class Run{
    public static void main(String[] args) {
        Dogs dogs = new Dogs();
        FuncImpl func = new FuncImpl();
        //реализация функциионального интерфейсв через анонимные кассы
        dogs.lambdaExample(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        });
        //то же самое но через лямбда
        dogs.lambdaExample(s -> Integer.parseInt(s));
        //через преобразование методов
        dogs.lambdaExample(Integer::parseInt);


    }
}
