package com.green.java.ch05;
/*
    numArr배열을 이용하여
    배열에 들어있는 값 평균값을 구해주세요.

    avg: ??
 */
public class ArrayQuiz11 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        float a = 0;

        for (int i = 0; i < numArr.length; i++) {
            a += numArr[i];}
        System.out.printf("avg: %.2f", a/ numArr.length);
    }
}
