package com.green.java.ch04;
//while문
//랜덤값 : 1~100 사이의 값
//1~100 정수 입력 : 50
//down
//1~100 정수 입력 : 25
//up
//1~100 정수 입력 : 30
//nice

import java.util.Scanner;

public class WhileQuiz1 {
    public static void main(String[] args) {
        int input , answer ;
        answer = (int)(Math.random() * 100)+1;
boolean AAA = true;

        Scanner scan = new Scanner(System.in);
        System.out.print("1~100 정수 입력 :");
        while(AAA){
            input = scan.nextInt();
            if (input > 100){
                System.out.println("장난금지");
            }
            else if (input < 0){
                System.out.println("장난금지");
            }
            else if(input < answer) {
                System.out.println("up");
            }
            else if (input > answer) {
                System.out.println("down");
            }
            else {
                System.out.println("nice :)");
                AAA = false;
            }
        }
    }
}
