package com.green.java.aazz;

import java.util.Scanner;

public class NoBoolean {
    public static void main(String[] args) {
        int num = 1;
        int sum = 1;


        Scanner scan = new Scanner(System.in);
        System.out.println("합계 구할 숫자를 적으렴. (0쓰면 끝남) ");


        while(sum != 0) {
            System.out.println(">> ");
            sum = scan.nextInt();
            num += sum;
            if (sum == 0){
                break;
            }
        }
        System.out.printf("%d\n", num);
    }
}
//while is 조건이 거짓이면 멈춤