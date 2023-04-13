package com.green.java.ch02;

public class VariableNumber2 {
    public static void main(String[] args) {
        //리터럴 Literal, 값 그 자체
        //int가 -128 ~ 127 표현가능 (overflow현상)
        byte b1 = 127;
        System.out.println(b1);

        int i1 = 129;
        int i2 = (int)b1;     //자동형변환 -> int i2 = b1;
        b1 = (byte)i1;   //강제형변환            (byte) 형변환한것
        System.out.println(b1);

        b1 = (byte)-129;   //underflow
        System.out.println(b1);
    }
}