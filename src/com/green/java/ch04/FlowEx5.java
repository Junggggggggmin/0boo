package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = ' ';

        System.out.print("점수를 입력하세요 > ");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
        //if () {}
        if (score > 100 || score < 0) {
            System.out.println("올바른 값을 입력하세요.");
        } else {
            if (score >= 90) {
                grade = 'A';
                if (score >= 98) {
                    opt = '+';
                } else if (score < 94) {
                    opt = '-';
                } else {
                    opt = ' ';
                }
            } else if (score >= 80) {
                grade = 'B';
                if (score >= 88) {
                    opt = '+';
                } else if (score < 84) {
                    opt = '-';
                } else {
                    opt = ' ';
                }
            } else if (score >= 70) {
                grade = 'C';
                if (score >= 78) {
                    opt = '+';
                } else if (score < 74) {
                    opt = '-';
                } else {
                    opt = '0';
                }
            } else {
                grade = 'D';
            }
            System.out.printf("%d점의 학점은 %c%c입니다. \n", score, grade, opt);

        }
    }
}
