package com.green.java.ch05;

import java.util.Arrays;
import java.util.Random;

public class ArrayQuiz13 {
    public static void main(String[] args) {
        int[] lottoArr = new int[6];
        setRandomValueArr(lottoArr);
        System.out.println(Arrays.toString(lottoArr));
        System.out.println("------------------------");


        sortArr(lottoArr);
        System.out.println(Arrays.toString(lottoArr));
        System.out.println("------------------------");


        sortArr2(lottoArr);
        System.out.println(Arrays.toString(lottoArr));
    }

    public static int getRandomValueFromTo(int sVal, int eVal) {
        return (int)(Math.random() * (eVal - sVal + 1)) + sVal;
    }


    public static void setRandomValueArr2(int[] lottoArr) {
        int i = 0;
        Loop:
        while(i<lottoArr.length) {
            int rVal = getRandomValueFromTo(1,45);
            for (int z=0; z<i; z++) {
                if(lottoArr[z] == rVal) {
                    continue Loop;
                }
            }
            lottoArr[i++] = rVal;
        }
    }





    public static void setRandomValueArr(int[] lottoArr) {
        for (int i = 0; i < lottoArr.length; i++) {
            int rVal = getRandomValueFromTo(1, 45);

            for (int j = 0; j < lottoArr.length; j++) {
                if(lottoArr[j] == 0) {
                    lottoArr[j] = rVal;
                    break;
                } else if(lottoArr[j] == rVal) {
                    i--;
                    break;
                }
            }
        }

    }


    public static void sortArr(int[] lottoArr) {
        for (int i = lottoArr.length-1; i > 0; i--) {
            for (int j=0; j<i; j++) {
                if(lottoArr[j] > lottoArr[j+1]) {
                    int temp = lottoArr[j];
                    lottoArr[j] = lottoArr[j+1];
                    lottoArr[j+1] = temp;
                }
            }
        }
    }


    public static void sortArr2(int[] lottoArr) {
        for (int i = lottoArr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(lottoArr[j] > lottoArr[j+1]) {
                    swap(lottoArr, i, j);
                }
            }
        }
    }



    static void swap(int[] lottoArr, int i, int j) {
        int temp = lottoArr[i];
        lottoArr[i] = lottoArr[j];
        lottoArr[j] = temp;
    }
}