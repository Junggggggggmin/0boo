package com.green.java.ch06;

public class Time {
    private int hour;      //멤버 필드   >> 전역 변수
    private int minute;    //멤버 필드
    private int second;    //멤버 필드 - can use anywhere

    final int MAXH=24;
    final int MINH=0;
    final int MAXM=60;
    final int MINM=0;
    final int MAXS=60;
    final int MINS=0;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        {
            if (hour > MINH && hour < MAXH)
                this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        {
            if (minute >= MINM && minute < MAXM)
                this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        {
            if (minute >= MINS && minute < MAXS)
                this.second = second;
        }
    }
}
