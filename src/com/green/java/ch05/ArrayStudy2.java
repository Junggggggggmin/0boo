package com.green.java.ch05;

public class ArrayStudy2 {
    public static void main(String[] args) {
        int[] numArr = new int[5];

        for(int i=0; i<numArr.length; i++){
            System.out.println(numArr[i]);
        }

        //boolean 은 default값이 false


        boolean[] boolArr = new boolean[4];
        for(int i=0; i<boolArr.length; i++){
            System.out.println(boolArr[i]);
        }

        String[] strArr = new String[3];
        for(int i=0; i<strArr.length; i++){
            System.out.println(strArr[i]);
        }
    }
}
