package com.green.java.ch05;

/*
    numArr 배열을 이용하여
    copyArr은 numArr보다 1칸 더 많게 해주세요.
    마지막 방에는 100을 넣어주세요.
    copyArr에 numArr을 deep copy 해주세요.

    copyArr값을 모두 출력해 주세요.

 */
public class ArrayQuiz7 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int[] copyArr = new int[numArr.length + 1];

        for (int i = 0; i < numArr.length; i++) {
            copyArr[i] = numArr[i];
        }                                                   //하드코딩 = 절대 변하지않는 값?

        copyArr[copyArr.length - 1] = 100;
        for (int i = 0; i < copyArr.length; i++) {
            System.out.println(copyArr[i]);
        }
//    String ruseult = Arrays.toString(copyArr);
//        System.out.println(result);
    }
}
