package com.green.java.ch04;

import java.util.Scanner;

public class SwitchStudy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        int score = scan.nextInt();
        String grade = " ";
        switch(score / 10) {
            case 10: case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7 :
                grade = "C";
                break;
            default:
                grade = "D";
        }
        System.out.printf("%d점의 학점은 %s입니다.\n", score, grade);






        //use switch
        //0~1000점만 score에 들어온다는 전제
        //예외처리 x
        //90~100 "%d점의 학점은 A입니다."
        //80~89 "%d점의 학점은 B입니다."
        //70~79 "%d점의 학점은 C입니다."
        //나머지 "%d점의 학점은 D입니다."
    }
}
