package com.green.java.ch04;

public class FlowEx24 {
    public static void main(String[] args) {
        int i = 11;
        System.out.println("카운트 다운 시작");

        while(i-- !=0) {
            System.out.println(i);

            for(long z=0; z<2_200_000_000l; z++) {
            }

        }
        System.out.println("깥!");
    }
}
