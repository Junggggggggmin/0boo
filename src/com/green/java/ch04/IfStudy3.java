package com.green.java.ch04;

import java.util.Scanner;

public class IfStudy3 {
    public static void main(String[] args) {
        final int WOMAN_HEIGHT_STAND = 158;
        final int MAN_HEIGHT_STAND = 171;

        Scanner scan = new Scanner(System.in);
        System.out.print("성별 입력 (w,m): ");
        String gender =scan.nextLine();
        if(!gender.equals("w") && !gender.equals("m"))
        {System.out.println("다시");}
        else {
        System.out.print("키 입력 (cm):");
        int height = scan.nextInt();
        if(gender .equals ("w")) {
            if (height == 158) {
                System.out.println("평균");
            } else if (height > 158) {
                System.out.println("평균 초과");
            } else if (height < 158) {
                System.out.println("평균 미만");
            }
        }
        if(gender .equals ("m")) {
            if (height == 171) {
                System.out.println("평균");
            } else if (height > 171) {
                System.out.println("평균 초과");
            } else if (height < 172) {
                System.out.println("평균 미만");
    }
}
    }
}}


        //M, 171 > 평균입니다            w, 158 > 평균
        //M, 172 > 평균 초과            w, 158  평균 초과
        //M, 170 > 평균 미만            w, 158 이하값 > 평균 미만