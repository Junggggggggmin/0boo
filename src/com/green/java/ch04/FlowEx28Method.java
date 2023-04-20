package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx28Method {
    public static void main(String[] args) {
        int input, answer;
        Scanner scan = new Scanner(System.in);
        answer = getRandomNumber(1, 100);
        System.out.println(answer);

    }
//random * (MAX-MIN+1) + MIN
    //        .length
    public static int getRandomNumber(int MIN, int MAX) {
        return (int)(Math.random() * (MAX - MIN +1)+MIN);
    }
}