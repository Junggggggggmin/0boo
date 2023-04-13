package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //Scanner type에 scan이라는 변수명 할당

        System.out.print("두자리 정수를 하나 입력해주세요.>");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);       //자주 사용, 일단 암기

        System.out.println("입력내용 : " + input + 11);   //문자열
        System.out.printf("num=%d\n", num + 1);         //정수
    }
}
