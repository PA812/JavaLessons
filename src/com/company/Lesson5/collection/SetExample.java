package com.company.Lesson5.collection;

import com.company.Lesson5.Developer;
import com.company.Lesson5.Student;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


class StudentPhone implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class SetExample {
    public static void main(String[] args) {
        Set<String>strs = new HashSet<>();
        strs.add("hello");
        strs.add("hello");
        strs.add("hello");
        strs.add("hello");
        strs.add("hello");

        for (String str : strs) {
            System.out.print(str);
        }
        System.out.println();

        Set<Student>students = new HashSet<>();
        students.add(new Student(1L, "Tom", "1115"));
        students.add(new Student(2L, "Mike", "1112"));
        students.add(new Student(3L, "Elon", "1113"));
        students.add(new Student(4L, "Jack", "1114"));


        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();

        //Comparator<Student> studentPhone = new StudentPhone();
        //                                                                  o -> o.getEmail
        Set<Developer>developerTreeSet = new TreeSet<>(Comparator.comparing(Developer::getName));
        developerTreeSet.add(new Developer(1L, "JavaDev", "java@com"));
        developerTreeSet.add(new Developer(2L, "CPPDev", "cpp@com"));
        developerTreeSet.add(new Developer(3L, "C#Dev", "c#@com"));
        developerTreeSet.add(new Developer(4L, "JSDev", "js@com"));
        developerTreeSet.add(new Developer(5L, "PHPDev", "php@com"));
        developerTreeSet.add(new Developer(6L, "PythonDev", "python@com"));


        for (Developer developer : developerTreeSet) {
            System.out.println(developer);
        }



    }
}
