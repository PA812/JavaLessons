package com.company.Lesson6.map;

import java.util.*;

class HumanNameSorted implements Comparator<Human>{

    @Override
    public int compare(Human o1, Human o2) {
        return o1.name.compareTo(o2.name);
    }
}

class HumanINNSorted implements Comparator<Human>{

    @Override
    public int compare(Human o1, Human o2) {
        return o1.INN - o2.INN;
    }
}

public class TreeMapExample {
    public static void main(String[] args) {
        //HumanNameSorted humanNameSorted = new HumanNameSorted();
        //HumanINNSorted humanINNSorted = new HumanINNSorted();
        //Анонимный класс
/*        Map<Human, Integer>humanMap = new TreeMap<>(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.name.compareTo(o2.name);
            }
        });*/

        //Анонимный класс
        Map<Human, Integer>humanMap = new TreeMap<>(Comparator.comparing(Human::getName)
                .thenComparing(Human::getINN));
        humanMap.put(new Human("Junior", 123), 123);
        humanMap.put(new Human("Jack", 125), 123);
        humanMap.put(new Human("Jack", 122), 123);
        humanMap.put(new Human("Jack", 123), 123);
        humanMap.put(new Human("Jack", 127), 123);
        humanMap.put(new Human("Jack", 120), 123);
        humanMap.put(new Human("Jack", 129), 123);
        humanMap.put(new Human("Jacd", 130), 123);
        for (Human human : humanMap.keySet()) {
            System.out.println(human);
        }

        List<Human> humans = new ArrayList<>();
    }
}
