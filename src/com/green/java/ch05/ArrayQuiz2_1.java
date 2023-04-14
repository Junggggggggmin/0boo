package com.green.java.ch05;
/*
    rNumArr은 10칸 가지고 있는 정수형 배열입니다.
    각 칸에 랜덤한 숫자 10~45 사이의 값을
    모두 넣어주세요.
 */
public class ArrayQuiz2_1 {
    public static void main(String[] args) {
        int[] rNumArr = new int[10];
        for (int i = 0; i < rNumArr.length; i++) ;

        for (int i = 0; i < rNumArr.length; i++){
            rNumArr[i] = (int)(Math.random()*100)+1;
            System.out.printf("%d,", rNumArr[i]);

            if (i+1 == rNumArr.length){
                System.out.printf("%d", rNumArr[i]);
            }
        }
    }
}