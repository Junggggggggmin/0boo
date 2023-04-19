package com.green.java.ch06;

public class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];         //각 방에는 Tv 객체의 주소값 들어갈수있음     Tv tv1, tv2, tv3;  or  String[] strArr = new String[3];
        for (int i = 0; i < tvArr.length; i++) {
                tvArr[i] = new Tv();            // <<< same >>>  Tv tv = new Tv() \\   tvArr[i] = tv;\\ tv.channel = 10+i;
                tvArr[i].channel = 10 + i;
        }

        System.out.println(tvArr[2].channel);
    }
}
