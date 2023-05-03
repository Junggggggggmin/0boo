package com.green.java.Bobug;

import java.util.Arrays;

public class ArrayStudy4 {
    public static void main(String[] args) {
        int[] arr = new int[10];


        int num = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num++;
        }

        changeArrEvenMulti(arr, 3); //원본 수정. 짝수인 값은 *3 처리


        System.out.println(Arrays.toString(arr));
    }

    public static void changeArrEvenMulti(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
          if(arr[i] % 2 == 0) {
              arr[i] *= num;    //
          }
        }
    }
}
