package com.green.java.ch04;

import java.util.LinkedList;
import java.util.Scanner;

public class MyVendingMachine {
    private int money;

    private String[] MenusArr = {"콜라", "사이다", "환타", "미란다"};
    private int[] PriceArr = {1000, 1500, 2000, 2500};
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



    public void choice () {
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("메뉴를 선택하세요.(종료 : 0)  >>> ");
            String input = scan.nextLine();
            int num = Integer.parseInt(input);
            if(num == 0) {
                break;
            }
            System.out.printf("선택하신 메뉴는 %s이고 %,d원입니다.\n", MenusArr[num - 1], PriceArr[num - 1]);
            purchaseList.add(num-1);  //num만 쓰면 횟수는 맞는데 메뉴가 이상하게 나올것
        }
    }

    public void total () {
        System.out.printf("상품은 총 %d개 구입하였고 / 결제금액은 %d원입니다.", purchaseList.size(), 1);
    }
}
