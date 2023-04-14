package com.green.java.ch04;

import java.util.Scanner;

/*
(1) square
(2) square root
(3) log
원하는 메뉴(1~3)을 선택하세요. (종료 : 0) > 4
메뉴를 잘못 선택하셨습니다.(종료 : 0)
(1) square
(2) square root
(3) log
원하는 메뉴(1~3)을 선택하세요. (종료 : 0) > 1
선택하신 메뉴는 1번입니다.
(1) square
(2) square root
(3) log
원하는 메뉴(1~3)을 선택하세요. (종료 : 0) > 0
프로그램 종료~
 */
public class FlowEx32_1 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("(1) square\n(2) square root\n(3) log\n원하는 메뉴를 선택하세요. (종료: 0)");
            i = scan.nextInt();
            if (i == 0) {
                System.out.println("종료합니다");
                break;
            } else if (i > 0 && i <4) /*    =(i<0 || i>3)       */ {
                System.out.printf("선택하신 메뉴는 %d번 입니다.\n", i);
            }
            System.out.println("---------잘못선택함. 다시 선택하세요-------------");
        }
    }
}
