package com.green.java.ch05;

public class ArrayStudy5 {
    public static void main(String[] args) {

        int[] numArr = {10, 20, 30, 40, 50};
        int[] copyArr = new int[numArr.length];               //numArr과 같은 배열,  copy 종류 2개, deep copy, 모든 값에는 0이
        for(int i=0; i<copyArr.length; i++) {
            System.out.printf("copyArr[%d] : %d\n", i, copyArr[i]);
        }


    }
}
//deep copy는 배열 길이만 복사 ex) 0,0,0,0,0,0