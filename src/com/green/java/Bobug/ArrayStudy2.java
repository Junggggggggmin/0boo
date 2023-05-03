package com.green.java.Bobug;

import java.util.Arrays;

public class ArrayStudy2 {
    public static void main(String[] args) {
        String[] strArr = {"비행기", "기차", "배"};

        //[ 비행기, 기차, 배]
        //* 비행기, 기차, 배 *


        System.out.printf("[ %s", strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            System.out.print(", " + strArr[i]);
        }
        System.out.println("]");


        System.out.println("------------------------");


        String str = Arrays.toString(strArr).replace("[","*").replace("]","*");
        System.out.println(str);
    }
}
