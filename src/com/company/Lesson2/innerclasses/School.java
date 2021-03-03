package com.company.Lesson2.innerclasses;

public class School {
    static int id = 1;
    String name = "school";

    static class ClassRoom{
        int id = 11;
        String name = "classroom";

        public void showClass(int id, String name){
            this.id = id;
            this.name = name;
            System.out.println(id + name);
        }
    }
}

class Run{
    public static void main(String[] args) {
        School school = new School();
        School.ClassRoom classRoom = new School.ClassRoom();
    }
}
