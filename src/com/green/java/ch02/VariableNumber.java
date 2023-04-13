package com.green.java.ch02;

public class VariableNumber {
    public static void main(String[] args) {
        //변수 정수형
        byte b1; //1byte
        short s1; //2byte
        long l1; //8byte
        int n1; //(정수형) 변수 선언  //4byte
        //int n1l // 변수 선언은 1번만 가능
        n1 = 10; //= is 대입연산자, 오른쪽 값 복사하여 왼쪽에 주입,   최초대입을 초기화라고 함
        System.out.println(n1);

        n1 = 20;
        System.out.println(n1);
    }
}
