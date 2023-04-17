package com.green.java.ch05;

/*
    numArr 배열을 이용하여
    Arrays.toString 메소드 이용하지 않고
    아래처럼 출력되도록 로직으로 해결하세요.
    [11, 14, 2, 7, 36, 35]
 */
public class ArrayQuiz8 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};

        for (int i = 0; i < numArr.length; i++){   //i < 6
            if(i == 0){
            System.out.printf("[%d, ", numArr[i]);}
            else if (i>0 && i<numArr.length-1){     //0<i<5
                System.out.printf("%d, ", numArr[i]);}
            else if (i == numArr.length-1){         //i = 5
                System.out.printf("%d]", numArr[i]);}
            }
        }
    }