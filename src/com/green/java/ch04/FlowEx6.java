package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요. (1~12): ");
        Scanner scan = new Scanner(System.in);
        int mon = scan.nextInt();
        String season = " ";
        switch (mon) {
            case 3 : case 4 : case 5 :
                season = "봄";
                break;
            case 6 : case 7: case 8 :
                season = "여름";
                break;
            case 9 : case 10 : case 11 :
                season = "가을";
                break;
            case 12 : case 1: case 2 :
                season = "겨울";
                break;
            default:
                System.out.println("제대로 입력하세요");
        }
        if(!" ".equals(season)){
        //if (season != " "){
            System.out.printf("계절은 %s입니다.", season);
        }


        //mon 값이
        //3,4,5면 "현재의 계절은 봄입니다."
        //6,7,8면 "현재의 계절은 여름입니다."
        //9,10,11면 "현재의 계절은 가을입니다."
        //12,1,2면 "현재의 계절은 겨울입니다."
    }
}
//빈 칸 비교할때는 뒤쪽에 빈 칸 넣지말고 앞쪽으로 넣는게 좋음