package com.green.java.ch07.cards;

public class Card {
    static final String[] KINDS = {"CLOVER", "HEART", "DIAMOND", "SPADE"};  //무늬들
    static final int NUM_MAX = 13; //무늬별 카드 수

    String kind; //무늬값 저장
    String num; //카드 수 값 저장

    //외부에서 무늬, 번호 값을 받아서 나의 멤버필드 무늬와 번호에 대입하는 생성자 만들라
    Card (String kind, String num) {
     this.kind = kind;
     this.num = num;

    }
}
