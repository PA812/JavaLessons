package com.company.Lesson3.interfaces;

public interface Animal extends Example {
    boolean TAIL = true;
    double PI = 3.14;

   private static void isAnimal(){
      if(TAIL){
         System.out.println("Animal");
      }
   }

    static void show(){
       System.out.println(TAIL + " " + PI);
       isAnimal();
   }

   default void method(){
       isAnimal();
   }


}
