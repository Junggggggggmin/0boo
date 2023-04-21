package com.green.java.ch07;

class Tv {
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() {channel++;}
    void channelDown() {channel--;}
}

class CaptionTv extends Tv {
    boolean caption;
    void displayCaption(String txt) {
        if(caption) {               //불린값이 디폴트가 false라서 그냥하면 실행이 안됩니다..
            System.out.println(txt);
        }
    }
}

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("자목 나오나?");
        ctv.caption = true;
        ctv.displayCaption("자목 나오너?");
        ctv.channelDown();
        System.out.println(ctv.channel);
    }
}
