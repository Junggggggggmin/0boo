package com.green.java.ch07.arraylist;

    import java.util.ArrayList;

    public class ArrayListStudy1 {
        public static void main(String[] args) {
            ArrayList list = new ArrayList();
            list.add(10); //0번방
            list.add(20); //1번방
            list.add("ddd");//object 타입으로 받음

            Object obj = 10;

            System.out.println(list.get(0));//.get = 배열의 값 호출
            System.out.println(list.get(1));
            System.out.println(list.get(2));

            int n1 = (int)list.get(0);//매번 강제 형변환 필요
            int n2 = (int)list.get(1);
            String str1 = (String)list.get(2);


        }
}
