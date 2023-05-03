package com.green.java.Bobug;

import java.util.Arrays;

public class ArrayStudy5 {
    public static void main(String[] args) {
        int[] arr = new int[10];


        int num = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num++;
        }

        int[] arr2 = changeArrEvenMulti(arr, 3); //원본 수정x . 짝수인 값은 *3 처리


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }


    //deep copy 사용해서 arrㅇㅁㅊ나ㅓㅀ모나 ㅣ루ㅠㅇ너ㅗ퓨


    public static int[] changeArrEvenMulti(int[] arr, int num) {
        int arr2[] = new int[arr.length];   //shallow copy를 통해 arr1과 배열의 길이가 같은 arr2 생성
        for (int i = 0; i < arr2.length; i++) {// deep copy --> for문을 통해 arr2[i]에 arr[i]값을 넣는중
            arr2[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                arr2[i] *= num;
            }
        } return arr2;  //return type입니다.

        //3항식 사용해서 코드 짜보세요
    }
}
