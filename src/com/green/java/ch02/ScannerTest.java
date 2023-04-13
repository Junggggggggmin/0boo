package com.green.java.ch02;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자 입력: ");
        String numb = scan.nextLine();
        int num = Integer.parseInt(numb);

        System.out.println("ㅁㄴㅇㄹ");
        String asdf = scan.nextLine();
        int gas = Integer.parseInt(asdf);
        System.out.println("ㅇㅇㅇ " + numb + "ㅁㅁㅁ" + asdf);

    }
}
