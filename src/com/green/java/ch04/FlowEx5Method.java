package com.green.java.ch04;

import java.util.Scanner;

class ScoreObj2 {
    String getGrade(int score) {
        if (score > 100 || score < 0) {
            return "점수는 0~100점 사이입니다.";
        } else if (score < 70) {
            return String.format("%d점의 학점은 D입니다.", score);
        }
        String grade = "C";
        if (score == 100) {
            return "100점의 학점은 A+입니다.";
        } else if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        }
        int num = score % 10;
        if (num > 8) {
            grade += "+";
        } else if (num < 4) {
            grade += "-";
        } else {
            grade += "0";
        }
        return String.format("%d점의 학점은 %s입니다.", score, grade);
    }
}
    public class FlowEx5Method {
        public static void main(String[] args) {
            int score;
            System.out.print("점수를 입력하세요 > ");
            Scanner scan = new Scanner(System.in);
            score = scan.nextInt();
            ScoreObj2 so = new ScoreObj2();
            String result = so.getGrade(score);
            System.out.println(result);
        }
    }
