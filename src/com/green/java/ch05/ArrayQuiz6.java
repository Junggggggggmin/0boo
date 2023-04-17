package com.green.java.ch05;
/*
    numArr 배열을 이용하여
    copyArr에 numArr을 deep copy 해주세요/
    copyuArr값을 모두 출력해 주세요.
    copyArr[0] > 11
    copyArr[1] > 14
    ...
    copyArr[5] >
 */
public class ArrayQuiz6 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int[] copyArr = new int[numArr.length];

        //deep copy 과정
        for (int i = 0; i < numArr.length; i++) {           //numArr or copyArr 상관없음
            copyArr[i] = numArr[i];                         //for문 돌아가는 구조 항상 잘보기!!
            numArr[0] = 33;}

        //copyArr 값 출력과정
        for (int i = 0; i < numArr.length; i++) {
            System.out.printf("copyArr[%d] > %d\n", i, copyArr[i]);
        }
    }
}
