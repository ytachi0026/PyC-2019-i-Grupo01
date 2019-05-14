package com.dev.ytachi.lesson03;

public class ShortCircuiting {

    static boolean test1(int val) {
        System.out.println("test1");
        return val < 1;
    }
    static boolean test2(int val) {
        System.out.println("test2");
        return val < 2;
    }
    static boolean test3(int val) {
        System.out.println("test3");
        return val < 3;
    }
  public static void main(String[] args) {
    boolean flag = test1(0) && test2(2) && test3(2);
    System.out.println("The expression is: " + flag);
  }
}
