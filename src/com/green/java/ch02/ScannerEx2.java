package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = "노정민";
        System.out.print("나이 입력: ");

        String input = scan.nextLine();
        int age = Integer.parseInt(input);

        System.out.println(" 나의 이름은 " + name + "이고 나이는 " + input + "살 입니다." );
        System.out.printf(" 만나이=%d살\n", (age-2));

        //나의 이름은 노정민이고 나이는 00살 입니다.

        /*
        String name = "ㅇㅇㅇ";
        int age = 0;
        System.out.print("나이 입력: ");
        String strAge = scan.nextLine();
        age = Integer.parseInt(strAge);
        System,out.printf("나의 이름은 %s이고 나이는 %d살 입니다.", name, age);

        scan.close();
         */
    }
}
