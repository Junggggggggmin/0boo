package com.green.java.Bobug;

public class ForQuiz2 {
    public static void main(String[] args) {
        int star =5;
        int ROW_CNT = 5;

        for (int i = 1; i <= star; i++) {

            System.out.print("*");
            if(i % ROW_CNT == 0) {
                System.out.println();
            }
        }

        System.out.println("------------------");


        for (int i = 0; i < star; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}