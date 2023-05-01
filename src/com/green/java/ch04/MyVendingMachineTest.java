package com.green.java.ch04;

public class MyVendingMachineTest {
    public static void main(String[] args) {
        MyVendingMachine vm = new MyVendingMachine();


        vm.insert(10000);
        vm.insert(10000);
        vm.insert(10000);
        vm.insert(10000);

        vm.showMoney(); //현재 잔액은 40,000원입니다.



        vm.showMenus();


        vm.showMoney();




        vm.choice();

        vm.total();

    }
}
