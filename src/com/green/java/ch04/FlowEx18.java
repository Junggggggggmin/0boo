package com.green.java.ch04;

public class FlowEx18 {
    public static void main(String[] args) {
        //중첩 for문 use 2~9단 출력
        //단수 바뀌면 한줄 띄우고 시작

//
//        for (int i = 2; i<10; i++){
//            for(int j =1; j <=10; j++){
//                if (j==10) {
//                    System.out.println();
//                }else{
//            System.out.printf("%d * %d = %d\n", i, j, i*j);
//                }
//            }
//        }
int gu = 2;
for(int i = 1; i<10; i++){
    for (int j = 1; j<10; j++){
        System.out.printf("%d * %d =%d \n", i, j, i*j);
    }
    System.out.println();
}
    }
}
