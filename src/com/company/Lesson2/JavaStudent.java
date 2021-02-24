package com.company.Lesson2;

import com.company.Lesson1.Student;

public class JavaStudent extends Student {

    String email;

    public JavaStudent() {
    }

    public JavaStudent(int id, String name, String email) {
        super(id, name);
        this.email = email;
    }

    public void  show(){

    }

}
