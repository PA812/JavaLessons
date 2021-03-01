package com.company.Lesson2.reflection;

import com.company.Lesson2.JavaStudent;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionApp {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        //Рефлексия
        Class<JavaStudent> javaStudentClass = JavaStudent.class;
        Field[] fields = javaStudentClass.getDeclaredFields();//получаем доступ к приватным полям

        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
            System.out.println(fields[i].getType());
            if(fields[i].getType() == String.class){
                fields[i].setAccessible(true);
            }
        }
        Method[] declaredMethods = javaStudentClass.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            System.out.println(declaredMethods[i].getName());
            System.out.println(declaredMethods[i].getGenericReturnType());
            System.out.println("---------------------");
        }
    }
}
