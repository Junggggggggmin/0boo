package com.green.java.ch04;

import java.awt.*;
import java.util.LinkedList;
import java.util.Scanner;

public class VendingMachine {
    private int money;

    private String[] MenusArr = {"콜라", "사이다", "환타", "미란다"};
    private int[] PriceArr = {1000, 1500, 2000, 2500};  //not 객체지향 it's 절차지향
    private LinkedList<Integer> purchaseList = new LinkedList<>();


    public void insert(int money) {
        this.money += money;
    }

    public void showMoney() {
        System.out.printf("현재 잔액은 %,d원입니다.\n", this.money);
    }


    public void showMenus() {
        System.out.printf("번호\t 메뉴명\t 가격 \t\n");
        for (int i = 0; i < MenusArr.length; i++) {
            System.out.printf("%d.\t %s\t %,d원 \n", i+1, MenusArr[i], PriceArr[i]);
        }
    }



    public void purchaseDrink (int a) {
        int idx = a-1;
        System.out.printf("%s를 구매하였습니다.\n", MenusArr[idx]);
        this.money -= PriceArr[idx];
        purchaseList.add(idx);
    }



    public void showPurchaseList() {
        if(purchaseList.size() == 0) {
            System.out.println("제품을 구매하지 않았습니다/");
            return;
        }

        int idx = purchaseList.get(0);
        System.out.println(MenusArr[idx]);

        for (int i = 1; i < purchaseList.size(); i++) {
            idx = purchaseList.get(i);
            System.out.printf(", %s", MenusArr[idx]);
        }
        System.out.println("을(를) 구매했다.");
    }





//    -----------------------------self made---------------------------------------
//    public void choice () {
//        while(true) {
//            Scanner scan = new Scanner(System.in);
//            System.out.print("메뉴를 선택하세요.(종료 : 0)  >>> ");
//            String input = scan.nextLine();
//            int num = Integer.parseInt(input);
//            if(num == 0) {
//                break;
//            }
//            System.out.printf("선택하신 메뉴는 %s이고 %,d원입니다.\n", MenusArr[num - 1], PriceArr[num - 1]);
//               // while문의 개념 복습.
//        }
//    }
//
//    public void total () {
//        int n = 0;
//        int pay = 0;
//
//        pay += PriceArr[];
//
//        System.out.printf("상품은 총 %d개 구입하였고 결제금액은 %d원입니다.", n, pay);
//    }
//-------------------------------self made zone----------------------------------



//      n개 구입 종류 total
//    public void changes(int C) {
//        int changes = this.money - PriceArr[C];
//        System.out.printf("거스름돈은 %,d원입니다.\n", changes);
//    }
}
