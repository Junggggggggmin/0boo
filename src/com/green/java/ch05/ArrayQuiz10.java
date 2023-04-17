package com.green.java.ch05;

/*
    numArr 배열을 이용하여
    배열에서 가장 작은 숫자를 찾아내어 출력해 주세요.

    min: 2
 */
public class ArrayQuiz10 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35, 1};
        int a = 0;


        for (int i = 0; i < numArr.length; i++) {
            if (i == 0) {
                a = numArr[i];}        //11의 값을 a번에 부여

            if (a > numArr[i]) {        //a는 11             14>2
                a = numArr[i];}
        }
        System.out.printf("min: %d", a);
    }
}
