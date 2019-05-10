package com.dev.ytachi.lesson02;

public class PrimitiveData {

    boolean flag;
    byte bits;
    char character;
    short smallInteger;
    int integer;
    long longInteger;
    float decimalPointNumber;
    double longDecimalPointNumber;

    public static void main(String[] arg) {
        PrimitiveData test = new PrimitiveData();
        System.out.println(test);
    }

    @Override
    public String toString() {
        return "PrimitiveData{" +
                "flag=" + flag +
                ", bits=" + bits +
                ", character=" + character +
                ", smallInteger=" + smallInteger +
                ", integer=" + integer +
                ", longInteger=" + longInteger +
                ", decimalPointNumber=" + decimalPointNumber +
                ", longDecimalPointNumber=" + longDecimalPointNumber +
                '}';
    }
}
