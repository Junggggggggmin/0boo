package com.green.java.ch04;

public class FlowEx18Method {
    public static void main(String[] args) {
        gugudan(5);
        System.out.println("-----------------");

        Agugudan(6);
        System.out.println("-----------------");

        gugudan(2,8);               //s단 ~ e단까지의 구구단 출력
        System.out.println("-----------------");
        gugudan(5,7);

    }





    public static void gugudan(int sDan, int eDan) {
        for (int i = sDan; i <= eDan; i++) {
            gugudan(i);
        }
    }

    public static void gugudan(int num) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d X %d = %d\n", num, i, i*num);
        }
        System.out.println();
    }

    public static void Agugudan(int dan) {
        for (int i = 1; i <= dan; i++) {
         gugudan(i);
        }
    }
}
