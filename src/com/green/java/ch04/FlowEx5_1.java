package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx5_1 {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'D', opt = ' ';

        System.out.print("점수를 입력하세요 > ");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
       if (score > 100 || score < 0) {
           System.out.println("올바른 점수가 아닙니다.");
       }
       else if (score >= 90){
           grade = 'A';
       }
       else if (score >= 80){
           grade = 'B';
       }
       else if (score >= 70){
           grade = 'C';
       }
       int num = score % 10;
       if (grade != 'D'){
           if(num < 4) {
               opt = '-';
           }
           else if (num <= 8 || score == 100){
               opt = '+';
           }
           else {
               opt = ' ';
           }
       }
        System.out.printf("%d의 점수는 %c%c이다.\n", score, grade, opt);}
}
