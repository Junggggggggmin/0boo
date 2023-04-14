package com.green.java.ch05;

public class ArrayStudy1 {
    public static void main(String[] args) {
        //what is 배열 : same type의 여러 값을 저장하기 위한 공간
        int n1=1, n2=2, n3=3;
        n1 = 2;
                   //   0   1    2  3
        int[] numArr = {10, 20, 30, 40};  //int형 배열, 배열은 for문과 잘어울림
        int numArr2[] = {10, 20};   //this case 별로 안씀

        numArr[0] = 11;
        int num = numArr[1];
        System.out.println("num: " + num);
    }
}
