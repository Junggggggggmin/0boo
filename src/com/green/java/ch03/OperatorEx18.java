package com.green.java.ch03;

public class OperatorEx18 {
    public static void main(String[] args) {
        double pi = 3.1415592;
        double shortPi = Math.round(pi * 1000) / 1000.0;                  // double/double
        System.out.println(shortPi);

        System.out.println(Math.round(315.4));  //315    round는 반올림
        System.out.println(Math.round(315.5));  //316
        System.out.println(Math.ceil(315.1));  //316.0   ceil 올림
        System.out.println(Math.floor(315.9));  //315.0  floor 내림
    }
}
