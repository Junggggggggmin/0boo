package com.green.java.ch07;
// p.348, 접근 제어자
public class AcccessModifier {
    /*
    private, default, protected, public         오른쪽으로 갈수록 접근 범위 넓어진다.
     */
    public static void main(String[] args) {
        ModifierTest mt1 = new ModifierTest();
        //mt1.num1 = 10;        //내부에서만 사용가능
        mt1.num2 = 20;          //같은 패키지 안에서 접근가능
        mt1.num3 = 30;          //상속관계면 접근가능
        mt1.num4 = 40;          //open
    }
}
