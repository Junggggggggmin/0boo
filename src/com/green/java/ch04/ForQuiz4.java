package com.green.java.ch04;

public class ForQuiz4 {
    public static void main(String[] args) {             //다중 for문은 in&out 생각해보기
        int star = 5;
//        for (int i = 0; i < star; i++) {
//            for (int z = star; z > i+1; z--){
//                System.out.print("_");}
//
//
//            for (int a = 0; a <= i; a++) {
//              System.out.print("*");
//            }
//            System.out.println();}


        //for문 2개로 해결
        for(int i = star; i>0; i--){
            for(int z = 1; z <= star; z++){
                if(z < i) {
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
     }
}




