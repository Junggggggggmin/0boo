package com.green.java.ch07.arraylist;


public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);

        myList.add(2, 100);

        System.out.println(myList);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }


        System.out.println("-----");
        System.out.println(myList.size());
        //[10, 20, 30]


        System.out.println("-----");
        int v1 =myList.get(0);
        System.out.println(v1);


        System.out.println("-----");
        int sum = 0;        //for문 안에 넣으면 for문 돌때마다 새로 sum생성됨됨됨됨
        for (int i = 0; i < myList.size(); i++) {
            sum += myList.get(i);
        }
        System.out.println(sum);







        /*
                 //@@@@@@@@@@@@@@@   Remove 실험실   @@@@@@@@@@@@@@@@

        System.out.println("@@@@@@@");
        for (int i = 1; i < myList.size(); i++) {
            System.out.println(myList.remove(i));
        }

         */
    }
}