package com.green.java.Bobug;

import java.util.Arrays;

public class ArrayStudy6 {
    public static void main(String[] args) {
        //                  배열크기, 랜덤값 최소값, 랜덤값 최대값
        int[] arr = getRandomArr(7, 6, 9);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = getRandomNoDuplicatedArr(6, 1, 45);
        System.out.println(Arrays.toString(arr2));
    }

    private static int[] getRandomNoDuplicatedArr(int len, int sVal, int eVal) {
        int[] arr2 = new int[len];
        int i = 0;
        Loop1:
        while (i < len){
            int idx = (int)(Math.random() * (eVal - sVal + 1)) + sVal;
            for (int z = 0; z < i; z++) {
                if(arr2[z] == idx) {
                    continue Loop1;
                }
            }
            arr2[i++] = idx;
        }


        return arr2;
    }

    public static int[] getRandomArr(int a, int sVal, int eVal) {
        int[] arr = new int[a]; //길이가 a인 배열 arr 생성

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (eVal - sVal + 1)) + sVal;
        }
        return arr;
    }
}
