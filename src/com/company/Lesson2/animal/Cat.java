package com.company.Lesson2.animal;



public class Cat implements Animal{
    String name;

    public void say(){
        System.out.println("Cat say my");
    }

}

class Dog implements Animal{
    String name;

    public void say(){
        System.out.println("Dog say gav");
    }

}

class Fish implements Animal{
    String name;

    public void say(){
        System.out.println("Fish say ... ");
    }

}

class Main{
    public static void main(String[] args) {
        //Динамическая диспетчеризация
        Animal animal = new Cat();

        animal.say();

        animal = new Dog();

        animal.say();

        animal =new Fish();

        animal.say();

    }
}