package com.green.java.ch04;

import java.util.Scanner;

public class IfStudy3_2 {
    public static void main(String[] args) {
        final int WOMAN_WEIGHT = 100;
        final int MAN_WEIGHT = 200;

        Scanner scan = new Scanner(System.in);
        System.out.print("성별 :");
        String gender = scan.nextLine();
        if (!gender.equals("w") && !gender.equals("m")){
            System.out.println("retry!");
        }else{
        System.out.print("무게? :");
        int wei = scan.nextInt();

        if(gender.equals("w")){
            if(wei>100){
                System.out.print("w초과");}
            else if(wei == 100){
                System.out.println("w평균");
            }
            else {
                System.out.println("w미달");
        }
    }
        if(gender.equals("m")){
            if(wei>200){
                System.out.println("m초과");
            }
            else if(wei == 200){
                System.out.println("m평균");
        }else{
                System.out.println("m미달");
}}}}}
