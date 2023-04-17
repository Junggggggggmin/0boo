package com.green.java.aazz;
/*
모든 방의 값을 더해서 출력해주세요.
 */
public class ArrayTest4 {
    public static void main(String[] args) {
        int sum = 0;
        int[] numArr = {11, 14, 2, 7, 36, 35};
        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        System.out.println(sum);
    }
}
