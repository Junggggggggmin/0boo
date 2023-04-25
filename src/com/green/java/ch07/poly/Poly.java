package com.green.java.ch07.poly;
// p.354    다형성, 상속관계에서만 의미 있음
public class Poly {
    /*
        1. 부모타입은 자식 객체 주소값 저장할 수 있다.
        2. 자식타입은 부모 객체 주소값 저장할 수 없다.
        3. 타입은 (알고 있는 메소드만 호출할 수 있음)
                (메소드를 호출할 수 있나없나만 결정)
                >> 실제 실행되는건 객체 기준이다.
     */
    public static void main(String[] args) {
        Animal ani1 = new Dog();    //상속관계
        ani1.crying();
//        ani1. jump();     알고있는 메소드만 호출가능하기 때문에 호출 불가

        //Bulldog bulldog1 = (Bulldog)ani1;  //런타임 에러 발생
        Dog dog1 = (Dog)ani1;  //에러 발생 X
        dog1.crying();
        dog1.jump();

    }
}
