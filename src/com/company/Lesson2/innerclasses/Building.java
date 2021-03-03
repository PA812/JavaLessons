package com.company.Lesson2.innerclasses;

public class Building {
    static int id = 11;
    String name = "Name 1";

    public Building() {
    }

    class Room{
        int id = 22;
        String name = "Name 2";

      public void show(){
            System.out.println(id +" " + name);
            System.out.println(Building.id +" " + Building.this.name);
        }

    }
}

class Main{
    public static void main(String[] args) {
        Building building = new Building();
        Building building1 = new Building();
        Building.Room room = building.new Room();
        Building.Room room1 = building1.new Room();
        Building.id = 33;
        room.show();
        room1.show();

    }
}
