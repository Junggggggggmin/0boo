package com.green.java.ch03;

public class OperatorEx24 {
    public static void main(String[] args) {
        // && and 연산자      --> 전부 true이여야 true 나옴
        // || or 연산자       --> 앞이 true면 뒤도 true
        // (2 > 1) && (3 > 2)
        // (2 > 1) && (3 > 2) && (3 >= 5)     <<이러면 false

        // (2 > 1) || (3 > 2) || (3 >= 5)

        boolean r1 = (2 > 1) && (3 > 2);
        System.out.printf("r1 : %b\n", r1);

        boolean r2= (2 > 1) && (3 > 2) && (3 >= 5);
        System.out.printf("r2 : %b\n", r2);

        boolean r3= (2 > 1) || (3 > 2) || (3 >= 5);
        System.out.printf("r3 : %b\n", r3);

        int a = 5;
        int b = 0;

        System.out.println(a != b || ++b != 0);
        System.out.println(a == 0 && ++b != 0);
        System.out.println(a == 5 && ++b != 0);
        System.out.println(a == 5 && b++ != 0);  //윗 문장 제외하면 true (++영향)


        boolean r4 = ( 66 > 3 ) || ( 3<2 );
        System.out.printf("r4 : %b \n", r4);
    }
}
