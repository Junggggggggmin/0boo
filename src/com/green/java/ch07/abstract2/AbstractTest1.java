package com.green.java.ch07.abstract2;

public class AbstractTest1 {
    public static void main(String[] args) {
//        AbstractClassStudy1 acs1 = new AbstractClassStudy1();     추상클래스는 객체화를 할 수 없다

        AbstractClassStudy1 acs1 = new ChildClass();
        acs1.sum(10,20);

        AbstractClassStudy1 acs2 = new Child2Class();
        acs2.sum(20,20);
    }
}
