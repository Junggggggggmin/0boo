package com.green.java.ch05;
/*
numArr 배열을 이용하여 각 방에 짝수값만 콘솔에 출력
14
2
36
 */
public class ArrayQuiz3 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0)
                System.out.println(numArr[i]);}

        System.out.println("----------짝수쪽만----------");
        for (int i = 0; i < numArr.length; i++)
            if(numArr[i%2] == numArr[1])
            System.out.println(numArr[i]);


        System.out.println("---30초과의 숫자만 출력하면?---");
        for (int i=0; i<numArr.length; i++){
        if (numArr[i] > 30){
            System.out.println(numArr[i]);}
        }
    }
}