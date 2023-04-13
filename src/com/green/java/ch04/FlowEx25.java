package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하시에. ex)12345 > ");
        String temp = scan.nextLine();
        int tempK = Integer.parseInt(temp);


        while(tempK > 0) {
            int tempO = tempK % 10;
            sum += tempO;
            tempK = tempK / 10;
        }
        System.out.println("각 자리수의 합 : "+ sum);
    }
}