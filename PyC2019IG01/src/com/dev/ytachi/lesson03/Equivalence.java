package com.dev.ytachi.lesson03;

public class Equivalence {

  public static void main(String[] args) {
    int a = 10;
    int b = 15;
    int c = b;
    int d = a + 100;

    System.out.println(a == b);
    System.out.println(a != b);
    System.out.println(c);
    System.out.println(d);
  }
}
