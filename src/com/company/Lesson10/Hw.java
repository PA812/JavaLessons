package com.company.Lesson10;

public class Hw {

    static int max;
    static int min;

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " open");
        int[] arr = {12, 55, 63, 99, 31, 23};
         max = arr[0];
         min = arr[0];

        new Thread(() -> System.out.println(findMax(max, arr)+" "+ Thread.currentThread().getName())).start();

        new Thread(() -> System.out.println(findMin(min, arr) +" "+ Thread.currentThread().getName())).start();

        System.out.println(Thread.currentThread().getName()+" closed");

    }

    public static int findMax(int max, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int findMin(int min, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


}


