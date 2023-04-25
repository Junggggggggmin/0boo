package com.green.java.ch07;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Tv2 tv = new Tv2();
        Computer com = new Computer();
        Buyer buyer = new Buyer();
        buyer.buy(tv);      //Tv을(를) 100만원에 구매하였습니다.
        buyer.buy(com);     //Computer을(를) 200만원에 구매하였습니다.


        buyer.printState(); //나의 남은 돈은 얼마입니다. 보너스 점수는 %d점 입니다.

    }
}
class Buyer {
    private int money;
    private int bonusPoint = 0;

    Buyer() {
        this.money = 1000;
        this.bonusPoint = 0;

    }


    public void printState () {
        System.out.printf("남은돈은 %d만원 입니다. 보너스 점수는 %d점 입니다.\n" ,money, bonusPoint);
    }

    public void buy (Product B) {
        this.money -= B.price;
        bonusPoint += B.getBonusPoint();
        System.out.printf("%s을(를) %d만원에 구매하였습니다.\n", B.toString(), B.getPrice());
//        int productPRice = B.getPrice();
//        money = money - B.getPrice();         //두줄 요약하면 윗줄입니다.
    }



}


class Product {
    protected int price;
    protected int bonusPoint;

    Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price * 0.1);
    }

    public int getPrice() {
        return price;
    }
    public int getBonusPoint() {
        return bonusPoint;
    }
}


class Computer extends Product {
    public Computer(){
        super(200);
    }
    public String toString() {
        return "Computer";
    }                                   //public String ~~~ "Computer"오버라이딩
}


class Tv2 extends Product {
    public Tv2() {
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}
