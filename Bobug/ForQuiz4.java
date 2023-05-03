package com.green.java.Bobug;

public class ForQuiz4 {
    public static void main(String[] args) {
        int dan = 5;

        Gu(dan);


        int sDan = 3, eDan = 8;
        Gu(sDan,eDan);

    }


    static void Gu (int dan) {
        for (int j = 1; j < 10; j++) {
            System.out.printf("%d x %d = %d\n", dan, j, dan*j);
        }
        System.out.println("=============");
    }


    static void Gu (int sDan, int eDan) {
        for (int i = sDan; i <= eDan; i++) {
            Gu(i);
            System.out.println();
        }
    }
}
