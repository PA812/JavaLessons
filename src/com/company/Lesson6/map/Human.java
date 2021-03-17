package com.company.Lesson6.map;

import java.util.Objects;

public class Human {
   String name;
   int INN;

    public Human() {
    }

    public Human(String name, int INN) {
        this.name = name;
        this.INN = INN;
    }

    public String getName() {
        return name;
    }

    public int getINN() {
        return INN;
    }

    void funcMethod(MyFuncInter<?>inter){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return INN == human.INN;
    }

    @Override
    public int hashCode() {
        return Objects.hash(INN);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", INN=" + INN +
                '}';
    }
}
