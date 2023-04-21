package com.green.java.ch07;

public class MyTv extends Speaker {
    int channel;

    void channelUp() {channel++;}
    void channelDwon() {channel--;}
}

class MyTv2 {
    int channel;

    void channelUp() {channel++;}
    void channelDwon() {channel--;}
    Speaker speaker;


    void volumnUp() {speaker.volumnUp();}
    void volumnDown() {speaker.volumnDown();}
    int getvolumn() {return speaker.volumn;}
}


class Speaker {
    int volumn;
    void volumnUp() {volumn++;}
    void volumnDown() {volumn--;}
}