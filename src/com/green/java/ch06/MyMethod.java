package com.green.java.ch06;
//메소드의 선언부           void sum~ {} = 구현부
public class MyMethod {

    //void >> return type, 리턴타입                   "명"이 들어가면 암거나하면됨
    //sum >> method name, 메소드명
    //(int n1, int n2) >> parameter, 매개변수
    void sum(int n1, int n2) {           //보이드는 항상 혼자 나옴 ex) 뒤에 >,=이런거 안붙음
        System.out.println(n1 + n2);
    }

    int sum2(int n1, int n2) {
        return n1 + n2;
    }
}
// 모든 메서드는 리턴 키워드를 만나야 돌아갑니다