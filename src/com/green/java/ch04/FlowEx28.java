package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input, answer;
        Scanner scan = new Scanner(System.in);
        answer = (int) (Math.random() * 100) + 1;

        do{
            System.out.println("1~100사이 값 입력: ");
        input = scan.nextInt();
        if (input >100 || input < 0){
            System.out.println("장난질금지");
        }
            else if (input > answer) {
                System.out.println("down");
            } else if (input < answer) {
                System.out.println("up");
            }
        }while (input != answer);
        System.out.println("g");
    }
}