package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx25Method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하시에. ex)12345 > ");
        String temp = scan.nextLine();
        int sum = sumStringNumber(temp);
        System.out.printf("각 자리수의 합 : %d\n", sum);
    }

    public static int sumStringNumber(String str) {
        int val = Integer.parseInt(str);
        int sum = 0;
        while(val>0){
            sum += val%10;
            val /= 10;          //10으로 나눈 몫    while문 돌아가는걸 이해해야함 반복.@
        }
        return sum;
    }
}


// =이 있으므로 void method 아닙니다