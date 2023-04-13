package com.green.java.ch02;

public class VariableString {
    public static void main(String[] args) {
        String s1 = "Hello"; //대문자로 시작하는 객체 =에는 주소값 복사    String->문자열
        String s2 = "World!";

        System.out.println(s1);
        System.out.println(s2);

        String s3 = s1 + s2;
        //String s3 = "HelloWorld";
        System.out.println(s3);

        String s4 = s1 + " " + s2;
        System.out.println(s4);
    }
}
