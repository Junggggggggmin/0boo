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
public class FlowEx32 {
    public static void main(String[] args) {
        int i = 55;
        while (i != 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("(1) square\n(2) square root\n(3) log\n원하는 메뉴를 선택하세요. (종료: 0)");
            i = scan.nextInt();


            switch (i) {
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                case 1: case 2: case 3:
                    System.out.printf("선택하신 메뉴는 %d입니다.\n", i);
                    break;
                default:
                    System.out.println("재선택~");
            }
        }
    }
}
