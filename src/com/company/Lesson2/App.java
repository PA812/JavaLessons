package com.company.Lesson2;

import com.company.Lesson1.Human;
import com.company.Lesson1.Student;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Tom");
        Student student2 = new Student(2, "Jek");
        Student student3 = new Student(3, "Nik");

        JavaStudent javaStudent1 = new JavaStudent("", student1);//создание экземпляра класса
        JavaStudent javaStudent2 = new JavaStudent("", student2);

        javaStudent1.setEmail("Email1");
        javaStudent2.setEmail("Email2");

        System.out.println("javaStudent1 = " + javaStudent1);
        System.out.println("javaStudent2 = " + javaStudent2);

        Human javaStudent3 = new JavaStudent("email3", student3);
        javaStudent3.learning();
        javaStudent3.show();

        Human student = new Student(4, "Fix");
        student.learning();
        student.show();


        //Копия массива
        System.out.println("=========Arrays===========");

        int[] arr1 = {1, 2, 3};
        System.out.println("first =" + Arrays.toString(arr1));
        int[]arr2 = {0,0,0,4,5,6};
        int[]arr3 = Arrays.copyOf(arr1, 6);
        System.out.println("second =" + Arrays.toString(arr2));
        System.out.println("third =" + Arrays.toString(arr3));
        int[] arr4 = Arrays.copyOfRange(arr2, 3, arr2.length);
        System.out.println("arr4 =" + Arrays.toString(arr4));
        //Arrays.binarySearch(arr4, 5);//бинарный поиск






    }
}
