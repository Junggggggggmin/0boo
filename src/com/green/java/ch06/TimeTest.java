package com.green.java.ch06;
//get >> set에게 정보를 받아서 알려줌
public class TimeTest {
    public static void main(String[] args) {
        Time t1 = new Time();
        //hour 1~23
        System.out.println("hour: " + t1.getHour());
        t1.setHour(t1.MAXH);
        t1.setHour(222);
        System.out.println("hour: " + t1.getHour());

        t1.setMinute(456);
        System.out.println("minute: ");

        t1.setSecond(1);
        System.out.println("second: ");


        System.out.printf("현재시각 : %dH %dM %dS", t1.getHour(), t1.getMinute(), t1.getSecond());
    }
}