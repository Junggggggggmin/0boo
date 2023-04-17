package com.green.java.ch05;

import java.util.Arrays;

/*
    numArr 배열을 이용하여
    값 리터럴 적지 않는다.

    0번, 1번방 값 스와이핑
 */
public class ArrayQuiz9 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int a = numArr[0];          // 11(n0)값을 a에 부여
        numArr[0]=numArr[1];        // 14(n1)값을 n0에 부여
        numArr[1]=a;                // 11(a)값을 n1에 부여  >> n1 = 11


        System.out.println(Arrays.toString(numArr));
    }
}
