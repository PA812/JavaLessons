package com.company.Lesson8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    static List<String> stringCollection = new ArrayList<>();

    static {
        stringCollection.add("ddd2");
        stringCollection.add("aaa5");
        stringCollection.add("aaa1");
        stringCollection.add("bbb1");
        stringCollection.add("aaa2");
        stringCollection.add("ccc3");
        stringCollection.add("ccc");
        stringCollection.add("zzz7");
        stringCollection.add("ddd1");
    }

    static List<Human> humans = new
            ArrayList<>(List.of(
            new Human(12, "Tom"),
            new Human(34, "Jack"),
            new Human(34, "Forest1"),
            new Human(34, "Forest2"),
            new Human(34, "Forest3"),
            new Human(44, "Mike")));

    public static void main(String[] args) {
        //streamArr();
        //streamCollection();
        //filterExample();
        //List<Integer> integers = mapExample();
        //minMaxExample(integers);
        objectStreamEx();


    }

    private static void objectStreamEx() {
        List<Human> humanAges = new ArrayList<>();
        Optional<Human> reduce = humans.stream()
                .reduce((a, b) -> {
                    if (a.age == b.age) {
                        humanAges.add(a);
                    }
                    return b;
                });

        //reduce.ifPresent(System.out::println);

        humanAges.forEach(System.out::println);

        //.filter(s->s.age == 34)
        //.forEach(System.out::println);

    }

    private static void minMaxExample(List<Integer> integers) {
        //Optional<Integer>optional = Optional.of(1);

        Optional<Integer> maxOptional = integers.stream()
                .max(Comparator.comparingInt(a -> a));

        //1 вариант
        int max;
        if (maxOptional.isPresent()) {
            max = maxOptional.get();
        }
        //2 вариант
        Integer max1 = maxOptional.orElse(0);

        //3 вариант
        int min = integers.stream()
                .mapToInt(Integer::valueOf)
                .min()
                //.getAsInt()
                .orElse(0);

        maxOptional.ifPresent(integer -> System.out.println("max = " + integer));
        System.out.println("min = " + min);


    }

    private static List<Integer> mapExample() {
        System.out.println("mapExample()");
        List<Integer> integerCollection = stringCollection.stream()
                .filter(s -> s.length() == 4)
                .map(s -> s.substring(3))
                .map(Integer::parseInt)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        integerCollection.forEach(System.out::println);

        return integerCollection;

    }

    private static void filterExample() {
        //List<String> res = new ArrayList<>();
//        for (String s : stringCollection) {
//            if(s.startsWith("a")){
//                res.add(s);
//            }
//        }
//        for (String re : res) {
//            System.out.println("re = " + re);
//        }
        List<String> res = stringCollection.stream()
                .filter(s -> s.startsWith("a"))
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        res.forEach(System.out::println);
    }

    private static void streamCollection() {
        System.out.println("stringCollection");
//        for (String s : stringCollection) {
//            System.out.println("s = " + s);
//        }

        stringCollection.forEach(System.out::println);

    }

    private static void streamArr() {
        int[] arr = {1, 2, 3, 4, 5, 6, 2, 3, 4};
        for (int item : arr) {
            System.out.println("item = " + item);
        }
        System.out.println("====================");
        long count = Arrays.stream(arr).count();
        System.out.println("count = " + count);

        Stream.of("First", "Second", "Third", 12.0, 'x')
                .forEach(System.out::println);
        System.out.println("-----------------------------------");
        IntStream.of(arr)
                .distinct()//уникальные значения
                .map(item -> item * 2)
                .asLongStream()
                .forEach(System.out::println);
    }


}
