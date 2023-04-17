package com.green.java.aazz;

/*
numArr 배열을 이용하여 각 방에 짝수값만 콘솔에 출력
14
2
36
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                System.out.printf("%d\n", numArr[i]);
            }
        }
    }
}