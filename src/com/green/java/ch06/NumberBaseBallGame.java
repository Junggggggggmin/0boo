package com.green.java.ch06;

import java.util.Arrays;
import java.util.Scanner;

// 엑셀켜서 실행 복기해보자
public class NumberBaseBallGame {

    static int[] getRandomNumberArr(int numberCount) {
        int[] arr = new int[numberCount];

        int selectedIdx = 0;
        Loop:
        while (selectedIdx < arr.length) {
            int rVal = getRandomNumber2(1, 9);

            for (int i = 0; i < selectedIdx; i++) {         //0,1,2 번 방에 숫자를 넣자
                if (arr[i] == rVal) {                        //앞의 방과 방금 뽑은 랜덤수가 같은지 체크 (중복 방지) (i = 방 번호)
                    continue Loop;                          //Loop를 continue 시켜서 while까지 올라감
                }
            }
            arr[selectedIdx++] = rVal;
        }
        return arr;                                         //arr의 주소 값 리턴!
    }


    static int getRandomNumber2(int MIN, int MAX) {
        return (int) (Math.random() * (MAX - MIN + 1)) + MIN;
    }


    public static void main(String[] args) {
        final int NUMBER_COUNT = 3;
        int[] numArr = getRandomNumberArr(NUMBER_COUNT);    //@@@@@@int 배열 타입@@@@@@
        //System.out.println(Arrays.toString(numArr));          //정답!


        Scanner scan = new Scanner(System.in);
        System.out.println("[Game Start]");
        int A = 1;


        while (true) {
            int[] myArr = new int[NUMBER_COUNT];
            for (int i = 0; i < NUMBER_COUNT; i++) {
                System.out.printf("%d번 숫자 입력 : ", i + 1);
                myArr[i] = scan.nextInt();
            }


            int s = 0, b = 0, o = 0;
            for (int i = 0; i < NUMBER_COUNT; i++) {


                for (int z = 0; z < NUMBER_COUNT; z++) {

                    if (numArr[i] == myArr[z]) {

                        if (i == z) {
                            s++;
                        } else {
                            b++;
                        }
                    }
                }
            }
            o = NUMBER_COUNT - (s + b);
            System.out.printf("S :%d, B: %d, O: %d\n", s, b, o);
            A++;

            if (s == NUMBER_COUNT) {
                break;
            }
        }
        System.out.println("[Game Over]");
        System.out.printf("%d회 도전하셨군요", A);
    }
}
