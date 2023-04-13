package com.green.java.ch04;

import java.util.Scanner;

public class IfStudy3_1 {
    public static void main(String[] args) {
        final int WOMAN_STAND_HEIGHT = 158;
        final int MAN_STAND_HEIGHT = 171;


        Scanner scan = new Scanner(System.in);
        System.out.print("성별 (w,m): ");
        String gender = scan.nextLine();
        if (!gender.equals("w") && !gender.equals("m")) {
            System.out.println("제대로 입력");
        } else {
            System.out.println("키 :");
            int tall = scan.nextInt();

            int stand = 0;    //???
            if (gender.equals("w")) {
                stand = WOMAN_STAND_HEIGHT;
            } else if (gender.equals("m")) {
                stand = MAN_STAND_HEIGHT;
            }

            if (tall > stand) {
                System.out.println("평균 초과");
            } else if (tall == stand) {
                System.out.println("평균");
            } else if (tall < stand) {
                System.out.println("평균 미달");
            }
        }
    }
}