package com.green.java.ch03;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i = 5, j = 0;

        j = i++;   //++뒤쪽에 있으면 원래 값 먼저 사용 후 1증가   j에 5의 값이 들어가있음
        System.out.printf("j=i++; 실행 후 i=%d, j=%d\n", i, j);

        int i2 = 5, j2 = 0;
        j2 = ++i2;
        System.out.printf("j=++i2; 실행후 i2=%d, j2=%d\n", i2, j2);
    }
}
