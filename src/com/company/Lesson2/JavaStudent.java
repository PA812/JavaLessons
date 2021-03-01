package com.company.Lesson2;

import com.company.Lesson1.Student;

public class JavaStudent extends Student {

    private String email = "255";

    public JavaStudent() {
    }

    public JavaStudent(String email, Student student) {
        super(student.getId(), student.getName());
        this.email = email;
    }

    private String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void learning() {
        System.out.println("Java learning");
    }

    @Override
    public void show() {
        System.out.println("Show Java Student");
    }

    @Override
    public String toString() {
        return "JavaStudent{" +
                "email='" + email + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
