package com.company.Lesson2.dependency;

public class Train implements Vehicle {

    int id;
    String name;
    String engine;

    Vagoon vagoon;

    public Train() {
    }

    public Train(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int countOfWheels(){
        return vagoon.countOfWheels() * 7;
    }


    @Override
    public void speedUp() {
        System.out.println("Train is speed up");
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
