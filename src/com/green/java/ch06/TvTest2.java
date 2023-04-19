package com.green.java.ch06;

//클래스 여러개 가능하지만 public은 파일명과 같은 class에만 사용가능!@#!
public class TvTest2 {
    public static void main(String[] args) {
        Tv2 tv = new Tv2();

        for (int i = 0; i < 10; i++) {
            tv.channelUp();
            System.out.printf("channel : %d\n", tv.channel);
        }
        System.out.println("============");
        for (int i = 0; i < 10; i++) {
            tv.channelDown();
        }
        System.out.printf("channel : %d\n", tv.channel);
    }
}

class Tv2 {
    String color;
    boolean power;
    int channel;

    final int MAX_CHANNEL = 5;
    final int MIN_CHANNEL = 1;

    void power() {
        power = !power;
    }

    void channelUp() {++channel;
        if (channel > MAX_CHANNEL) {
            channel = MIN_CHANNEL;
        }
    }

    void channelDown() {
        if (channel > MIN_CHANNEL) {
            --channel;
        }
    }
}
