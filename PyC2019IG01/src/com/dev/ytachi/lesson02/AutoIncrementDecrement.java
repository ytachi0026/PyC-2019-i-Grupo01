package com.dev.ytachi.lesson02;

public class AutoIncrementDecrement {

    public static void main(String[] args) {

        int i = 1;

        System.out.println("i : " + i);
        System.out.println("++i : " + ++i); // Pre-increment print("i++ : " + 1++)
        System.out.println("i++ : " + i++); // Post-increment print("i :"+i);
        System.out.println("i : " + i);
        System.out.println("--i : " + --i); // Pre-decrement print("i-- : " + i--)
        System.out.println("i-- : " + i--); // Post-decrement print("i : " + i);
        System.out.println("i : " + i);

    }
}
