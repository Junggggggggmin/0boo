package com.green.java.ch04;

public class ForQuiz3 {
    public static void main(String[] args) {
        int star = 5;

        //중첩 for문 사용하여 별을 찍어주세요.
        //*****
        //*****
        //*****
        //*****
        //*****
//바깥 for문 = 줄 담당
        for (int i = 0; i < star; i++) {
            for (int z = 0; z < star; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
