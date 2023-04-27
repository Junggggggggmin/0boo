package com.green.java.ch07.abstract2;

public abstract class AbstractClassStudy1 {  //클래스명 앞에 abstract를 붙이는게 추상클래스

    int multi(int n1, int n2) {
        return n1*n2;
    }

    abstract void sum(int n1, int n2);  //추상 클래스 안에 있는 메소드에는 abstract를 앞에 붙인다
}

class ChildClass extends AbstractClassStudy1 {  //추상클래스를 상속받으면 추상 메소드를 들고와야함
            //해당하는 객체에서 실현이 된다.
    @Override
    void sum(int n1, int n2) {
        System.out.println("합계 : " + (n1+n2));
    }
}

class Child2Class extends AbstractClassStudy1 {

    @Override
    void sum(int n1, int n2) {
        System.out.println("sum : " + (n1+n2));
    }
}
