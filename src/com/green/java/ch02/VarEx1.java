package com.green.java.ch02;

public class VarEx1 {
    public static void main(String[] args) {
        int year = 0;     //변수선언 (최초 1회만)
        int age = 14;     //int 타입, 변수명 age, 14값 대입  (초기화)

        System.out.println(year);
        System.out.println(age);

        year = age + 2000;
        age = age + 1;

        System.out.println(year);
        System.out.println(age);
    }
}
