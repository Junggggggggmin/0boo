package com.green.java.ch02;

public class Naming {
    public static void main(String[] args){
        //단어 + 단어 + 단어

        //Hello World Bye
        //기법
        // 파스칼 케이스 기법 > 클래스명
        String HelloWorldBye;

        // 카멜 케이스 기법 > 변수명, 메소드명
        String helloWorldBye;       //java는 파스칼,카멜만

        // 스네이크 케이스 기법
        String hello_world_bye;

        // 케밥 케이스 기법             java에서 사용불가!
        //String hello-world-bye;

        //이름에 쓸 수 있는 특수기호 2개 : _ , $
        String _hi, h$i;

        //이름 처음에 숫자 사용금지! but 처음만 아니면 가능!
        //String 1a;
        String a1a;
        String aa1;

        //이름에 빈칸 사용할 수 없다.
        //String hello World;

        //대소문자 구분
        String aaa;
        String aAa;
        String aaA;

        //예약어 사용 금지 (파랑색상 단어는 예약어)
        //String public;
        String pUblic;   //<<-- 이건 가능

        //상수는 전부 대문자, 스네이크 케이스 기법
        final int NUM = 13;
        //NUM = 20;


        //
    }
}
