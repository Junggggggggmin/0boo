package com.green.java.ch07;

public class ModifierTest {
    private int num1;   //은닉화 , 내부에서는 사용가능
    int num2;   //default   같은 패키지 안에서 사용가능 (ch07에서 사용 가능~)
    protected int num3;
    public int num4;

    public void printNum1() {
        System.out.println(num1);
    }
}
