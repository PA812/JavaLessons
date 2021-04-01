package com.company.Lesson12;

import java.util.List;
import java.util.stream.Collectors;

public class Application {



    public int testMethod(int a, int b) {
        if (a != 0) {
            throw new NullPointerException();
        }
        return a + b;
    }

    public int sumArr(int[]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }


    public List<Human> filter(List<Human>humans){
       return humans.stream().filter(a-> a.name.charAt(0) == 'A')
                .collect(Collectors.toList());
    }
}


class Human{
    int id;
    String name;

    public Human() {
    }

    public Human(int id, String name) {
        this.id = id;
        this.name = name;
    }
}