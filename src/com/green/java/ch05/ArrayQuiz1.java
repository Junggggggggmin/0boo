package com.green.java.ch05;

public class ArrayQuiz1 {
    public static void main(String[] args) {
        int[] numArr = { 0, 0, 0};
        //for (값 입력, 1, 2, 3)


        //for (값 출력, 각 방에 있는 값을 출력)
        // 0>1
        // 1>2
        // 2>3
//                   방
        for(int i=0; i<numArr.length; i++){
            numArr[i] = i+1;   //     1,2,3의 값 where?
        }

        for(int i=0; i<numArr.length; i++){
            System.out.printf("%d > %d\n", i, numArr[i]);
        }
    }
}
