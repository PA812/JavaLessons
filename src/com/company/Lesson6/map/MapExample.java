package com.company.Lesson6.map;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Set<Human> humanSet = new HashSet<>();
        humanSet.add(new Human("Jim1", 123));
        humanSet.add(new Human("Jom2", 123));
        humanSet.add(new Human("Jum3", 123));
        for (Human human : humanSet) {
            System.out.println("Set = " + human);
        }

        Map<Human, String>humanMap = new HashMap<>();
        humanMap.put(new Human("Tom", 123), "Hardi1");
        humanMap.put(new Human("Tom", 123), "Hardi2");
        humanMap.put(new Human("Tom", 123), "Hardi3");
        humanMap.put(new Human("Tom", 123), "Jerry");
        humanMap.put(new Human("Jack", 456), "Daniels");


/*        for (Human human : humanMap.keySet()) {
            System.out.println(human.hashCode());
            System.out.println(human);
        }

        for (String value : humanMap.values()) {
            System.out.println(value);
        }*/

        //Entry хранит в себе и ключ и значение
        for (Map.Entry<Human, String> entry : humanMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + " value = " + entry.getValue());
        }


        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("0", "value");
        stringMap.put("idx", "index");
        for (String s : stringMap.keySet()) {
            System.out.println(s);
        }

        Human human = new Human();

        human.funcMethod(new MyFuncInter<String>() {
            @Override
            public String myMethod(String s) {
                return "Hello from my method";
            }
        });
    }
}
