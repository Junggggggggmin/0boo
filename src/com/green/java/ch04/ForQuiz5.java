package com.green.java.ch04;

import java.util.Scanner;

public class ForQuiz5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("몇단?");
        String ggd = scan.nextLine();

        int gd = Integer.parseInt(ggd);
        for (int i = 1; i<10; i++){
            System.out.printf("%d * %d = %d\n", gd, i, gd*i);
        }
    }
}