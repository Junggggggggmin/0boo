package com.green.java.ch04;

import java.util.Scanner;
//mon 값이
//3,4,5면 "현재의 계절은 봄입니다."
//6,7,8면 "현재의 계절은 여름입니다."
//9,10,11면 "현재의 계절은 가을입니다."
//12,1,2면 "현재의 계절은 겨울입니다."
//이외의 값은 null 리턴 return null;

class Season0bj{
    String getSeason(int mon) {
        switch (mon) {
            case 3: case 4: case 5:
                return "봄";

            case 6: case 7: case 8:
                return "여름";

            case 9: case 10: case 11:
                return "가을";

            case 12: case 1: case 2:
                return "겨울";

            default:
                return null;
        }
    }
}

public class FlowEx6Method {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요. (1~12): ");
        Scanner scan = new Scanner(System.in);
        int mon = scan.nextInt();
        Season0bj so = new Season0bj();
        String result = so.getSeason(mon);
        if(result == null){
            System.out.println("잘못된 입력입니다.");
            return;
        }
        System.out.printf("현재의 계절은 %s입니다.", result);
    }
}
