package com.company.Lesson4.generics;

import java.util.List;

//пример дженерезированного класса
public class TestGeneric<T> {

    public void show(T t){
        System.out.println("Тип данных " + t.getClass().getName());
    }

    public void show(){
        System.out.println("test");
    }

}


class Application{

    public void showGeneric(TestGeneric<?>test){
        test.show();
    }

}



class Run{
    public static void main(String[] args) {
        TestGeneric<String> test = new TestGeneric<>();

        Application app = new Application();
        app.showGeneric(test);
    }
}
