package com.green.java.ch06;

public class TvTest {
    public static void main(String[] args) {
        Tv tv = new Tv();           //Tv객체의 주소값만 담을수있는 레퍼런스 변수
        System.out.printf("power : %b\n", tv.power);
        System.out.printf("channel : %d\n", tv.channel);

        tv.power = true;
        System.out.printf("power : %b\n", tv.power);
        tv.power();
        System.out.printf("power : %b\n", tv.power);

        tv.channelUp();
        tv.channelUp();
        System.out.printf("channel : %d\n", tv.channel);
        tv.channel = 10;
        System.out.printf("channel : %d\n", tv.channel);
        tv.channelDown();
        System.out.printf("channel : %d\n", tv.channel);
    }
}
