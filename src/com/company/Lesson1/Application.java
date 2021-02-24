package com.company.Lesson1;

import com.company.Lesson2.JavaStudent;

public class Application {
    public static void main(String[] args) {
        System.out.print("\tHello world\n");
        System.out.println(" my name is Jack");
        String str = "world";
        System.out.printf("Hello %s", str);

        //Примитивные типы

        //целочисленный тип данных
        byte b = 127;
        short sh = 45;
        int in = 34;
        long lon = 76;
        //с плавающей точкой
        float f = 12.9f;
        double d = 12.2;
        //символы
        char ch = 'e';
        //логический тип
        boolean bool = true;

        //Ссылочные типы
        String string = "simple string";
        String string1 = string.concat(" new");
        System.out.println(string1);

        double random = Math.random() * 10;
        System.out.println(random);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число от 0 до 5");
//        int num = scanner.nextInt();


        //логические операторы
//        if (num > 0 && num <= 5) {
//            System.out.println("Ваше число = " + num);
//        } else
//            System.out.println("Не выреный ввод");


        //циклы
        int count = 0;
        for (int i = 0; i < 10; i++){
            System.out.print(count++ + " ");
        }

//        while (true){
//            System.out.println("Enter YES");
//            String s = scanner.next();//вводим строку
//            if(s.equals("YES")){
//                break;
//            }
//            System.out.println("Вы ввели " + s + " попробуйте еще");
//        }

        //массивы
        int[]arr = new int[10];
        String[]strings = new String[10];
        //1 - все эл-ты одного типа
        //2 - массивы не изменяемы
        //3 - new заполняет массивы значениями по умолчанию

        char[] chars = {'a', 74, 82, 65, 87, 'z'};

        System.out.println();

        for(int a : arr){
            System.out.print(a + " ");
        }

        System.out.println();

        for (String s : strings){
            System.out.print(s + " ");
        }

        System.out.println();

        for (char c : chars){
            System.out.print(c + " ");
        }

        System.out.println();

        Student[] students = new Student[10];


        for(int i = 0; i < students.length; i++){
            students[i] = new Student(i+1, "Student" + (i + 1));
            System.out.print(students[i] + " \n");
        }

        JavaStudent javaStudent = new JavaStudent();

    }
}

