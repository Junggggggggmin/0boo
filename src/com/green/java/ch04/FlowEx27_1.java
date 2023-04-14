package com.green.java.ch04;
/*
>> 100
>> 200
>> 300
>> 0
 합계 : 600
 */
import java.util.Scanner;

public class FlowEx27_1 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        //boolean flag = true; //while 조건식으로 사용.
        Scanner scan = new Scanner(System.in);
        System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면0)");


        while (true) {
            System.out.print(">> ");
            sum = scan.nextInt();
            num += sum;
            if (sum == 0) {
                System.out.println("-=--=-=-=-");
                break;
            }

        }    System.out.printf("%d\n", num);

    }
}



// 04/13 boolean ues/dont use 만들어보기 !!!!!
//04/14 숫자외에 ㅁ다른 문자 입력했을때 처음으로 돌아가는 코드 만들기