package com.green.java.ch07;

public class BindingTest3 {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        Child3 c = new Child3();

//        p.method(5); 안됨
        p.method();
        System.out.println("----");
        c.method(5);
    }
}

class Parent3 {
    protected int x = 100;      //자식들은 x값을 쓰고싶다 --> protected 사용하세요
    void method() {
        System.out.println("Parent3 Method");
    }
}

class Child3 extends Parent3{
    private int x = 200;

    void method(int x) {
        System.out.println("x = " + x);
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
    }
}