package com.company.Lesson2.innerclasses;

public class Building {
    int id = 11;
    String name = "Name 1";

    public Building() {
    }

    class Room{
        int id1 = 22;
        String name1 = "Name 2";

        public void show(){
            System.out.println(id +" " + name);
            System.out.println(id1+" " + name1);
        }

    }
}


class Main{
    public static void main(String[] args) {
        Building building = new Building();
        Building.Room room = building.new Room();
        room.show();
    }
}
