package com.green.java.aazz;
/*
    rNumArr은 10칸 가지고 있는 정수형 배열입니다.
    각 칸에 랜덤한 숫자 0~45 사이의 값을
    모두 넣어주세요.
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        int []NumArr = new int [6];
        for (int i = 0; i < NumArr.length; i++) {
            NumArr[i] = (int)(Math.random()*45)+1;
        }
        for (int i = 0; i < NumArr.length; i++) {
            System.out.printf("%d, ", NumArr[i]);
            if (i == NumArr.length-1) {
                System.out.printf("%d", NumArr[i-1]);
            }
        }
    }
}
