package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        int a = 10;
        Integer a2 = a;

        double d = 10.2;
        Double d2 = d;

        //generic 제네릭안에는 대문자로 시작하는 참조형
        //<String> 문자형
        //<Integer> 정수형
        // <Double> 실수형
        ArrayList<Integer> list = new ArrayList<>();
        //list.add("11");
        //list.add(10.1);
        //list.add(true);
        list.add(10);
        list.add(13);


        int n1 = list.get(0);
        System.out.println(list);//오버라이딩 되어있음

    }
}
