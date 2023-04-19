package com.green.java.ch06;

public class MyMEthodTest {
    public static void main(String[] args) {
        MyMethod mm = new MyMethod();   //객체화
        mm.sum(10, 2312);   //call method 메소드 호출
        mm.sum(15, 32);
        mm.sum(10, 55);
        mm.sum(10, 9);

        int result = mm.sum2(10, 245);
        System.out.println("result : "+ result);
    }
}
