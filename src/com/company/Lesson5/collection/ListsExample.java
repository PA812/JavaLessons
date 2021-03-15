package com.company.Lesson5.collection;

import java.time.LocalTime;
import java.util.*;

public class ListsExample {
    public static void main(String[] args) {
        //Списки
        List<Integer> integers = new ArrayList<>();

        //Множества
        Set<String>sets =new HashSet<>();

        //Map
        //    key    value
        Map<String, Integer> maps = new HashMap<>();


        //HashCode
        System.out.println("A".hashCode());//utf-8
        System.out.println("HellO".hashCode());
        System.out.println("h".hashCode());
        System.out.println("hello".hashCode());


        //============== Практика ===============
        ArrayList<String> strings = new ArrayList<>(List.of("A","B", "C"));
        strings.add("D");
        strings.add("D");
        strings.add("D");
        strings.add("D");
        strings.add("D");
        strings.add("D");
        strings.add("D");
        strings.add("D");
        strings.add("D");
        strings.add("E");
        strings.add("F");
        //...
        strings.add("Z");
        strings.remove("Z");
        strings.remove(strings.size()-1);
        //System.out.println(strings.get(100));
        strings.add(0, "Y");

        //сортировка
        strings.sort(String::compareTo);

        for (String string : strings) {
            System.out.print(string);
        }

        System.out.println();

        LinkedList<String>linkedList = new LinkedList<>(List.of("c","d", "e"));
        linkedList.addFirst("a");
        linkedList.addFirst("z");
        //linkedList.add(6, "y");
        System.out.println(linkedList.get(4));
        for (String s : linkedList) {
            System.out.print(s);
        }
    }
}
