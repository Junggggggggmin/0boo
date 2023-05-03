package com.green.java.Bobug;

public class ArrayStudy1 {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30};

        int arr2[] = {100, 200, 300};

        int val = arr[0];
        arr[0] = 50;
        System.out.println("val : "+ val);
        System.out.println("val : "+ arr[0]);


        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            System.out.println("num : " + num);
        }

        System.out.println("--------------");
        //arr2 for문 use해서 2,4,6
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 2 * i+1;
            System.out.println(arr2[i]);
        }
    }
}