package com.green.java.ch07.cards;

import com.green.java.ch07.ModifierTest;

public class CardTest {
    public static void main(String[] args) {
        ModifierTest mt1 = new ModifierTest();
        mt1.num4 = 10;
//        mt1.num1 = 10;
//        mt1.num2 = 10;
//        mt1.num3 = 10;




        CardDeck cd = new CardDeck();
        cd.openCards();
        System.out.println("-----------------------");

        cd.shuffle();
        cd.openCards();
        System.out.println("-----------------------");

//        Card c1 = cd.pick();        //카드덱의 주소값을 주는것이 아님... 카드 객체의 주소값임..
//        System.out.println(c1.kind + ", " + c1.num);
//
//        Card c2 = cd.pick();
//        System.out.println(c2.kind + ", " + c2.num);
//
//        Card c3 = cd.pick();
//        System.out.println(c3.kind + ", " + c3.num);


        for (int i = 0; i < cd.cards.length; i++) {
            cd.pick();
        }

        cd.pick();


        System.out.println("---");
        cd.openCards();


    }
}
