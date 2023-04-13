package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("점수를 입력하세요 > ");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
        if(score > 100 || score < 0)
        {
            System.out.println("0~100 사이의 값을 입력하세요");}
        else {
        if (score >= 90)
        {grade = 'A';}
        else if (score >= 80)
        {grade = 'B';}
        else if (score >= 70)
        {grade = 'C';}
        else
        {grade = 'D';}

        {
            System.out.printf("%d점의 학점은 %c입니다.\n", score, grade);
        }
    }
}}

      /*  if (score >= 90)
        {
            System.out.printf("%d점의 학점은 A\n", score);}
        else if (score >= 80)
        {
            System.out.printf("%d점의 학점은 B\n", score);}
        else if (score >= 70)
        {
            System.out.printf("%d점의 학점은 C\n", score);}
        else {
            System.out.printf("%d점의 학점은 D\n", score);}
*/



        //90점 보다 크거나 같으면 "%d점수의 학점은 A"
        //80점 보다 크거나 같으면 "%d점수의 학점은 B"
        //70점 보다 크거나 같으면 "%d점수의 학점은 C"
        //나머지 "%d점수의 학점은 D";