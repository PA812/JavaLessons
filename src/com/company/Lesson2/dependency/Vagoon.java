package com.company.Lesson2.dependency;

import com.company.Lesson2.JavaStudent;

public class Vagoon {
    int id;
    String name;
    int number;

    Train train;

    public Vagoon(int id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public Vagoon() {
    }


    public int countOfWheels(){
        return 10;
    }

    @Override
    public String toString() {
        return "Vagoon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
