package com.green.java.aazz;

public class Asd_1 {
    public static void main(String[] args) {
        for(int i = 1; i <=5; i++){
            System.out.println("현재 i값 1~5");
            for (int j = 1; j <= 4-i; j++){
                System.out.println("현재 j값 2층");
            }
            for (int j = 1; j <= 8-i; j++){
                System.out.println("지금 j값 3층");
            }
            System.out.println("요기까지");
        }
    }
}
