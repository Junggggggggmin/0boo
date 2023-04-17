package com.green.java.ch05;

public class ArrayStudy4 {
    public static void main(String[] args) {

        int[] numArr = {10, 20, 30, 40, 50};
        int[] copyArr = numArr;                     //numArr과 같은 배열,    copy 종류 2개

        numArr[0] = 123;
        System.out.println(numArr[0]);

        for(int i=0; i<copyArr.length; i++) {
            System.out.printf("copyArr[%d] : %d\n", i, copyArr[i]);
        }
    }
}
