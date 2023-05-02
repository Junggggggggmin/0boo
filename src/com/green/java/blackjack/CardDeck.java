package com.green.java.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    public static final String[] PATTERNS = {"♠","♥","♣","◆"};
    public static final int CARD_COUNT = 13;

    private List<Card> cardList;

    public CardDeck() {
        cardList = new ArrayList();
        for (int i = 0; i < PATTERNS.length; i++) {
            for (int j = 0; j < CARD_COUNT; j++) {  //패턴과 카드 숫자 두 가지의 경우를 모두 넣기위해 for문 2번 사용
                String num = null;
                switch (j){
                    case 1:
                        num = "A";
                        break;
                    case 11:
                        num = "J";
                        break;
                    case 12:
                        num = "Q";
                        break;
                    case 13:
                        num = "K";
                        break;
                    default:
                        num = String.valueOf(j);  // 위에서 num을 String으로 했기 때문에 int 값인 j를 받으려면 형변환을 필요로 한다.
                        break;
                }
                cardList.add(new Card(PATTERNS[i], num));   //새로운 카드객체를 만들어서 값을 input
            }
        }
    }
}
