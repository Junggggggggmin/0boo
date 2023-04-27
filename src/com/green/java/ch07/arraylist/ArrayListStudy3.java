package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy3 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);// 끝칸에 넣는다
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(1, 100);//첫번째값은 넣고싶은 위치, 두번째는 넣고 싶은 값 (1번칸에 100넣음)
        list.add(3, 300);
        System.out.println(list);

        int removeValue = list.remove(4);
        System.out.println("removeValue : " + removeValue);

        System.out.println(list);

        System.out.println(list.size());


    }
}
