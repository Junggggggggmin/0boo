package com.green.java.aazz;
/*
홀수값만 전부 더해서 출력
old-sum: ??
 */
public class ArrayTest5 {
    public static void main(String[] args) {
        int sum = 0;
        int[] numArr = {11, 14, 2, 7, 36, 35};
        for (int i = 0; i < numArr.length; i++) {
            if(numArr[i]%2 == 1){
             sum += numArr[i];
            }
        }
        System.out.println(sum);
    }
}
