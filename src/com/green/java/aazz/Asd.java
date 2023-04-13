package com.green.java.aazz;

public class Asd {
    public static void main(String[] args) {
        int star = 10;
                for(int i = 1; i<=star; i++){
                    for(int j = 1; j<=star-i; j++){
                        System.out.print("_");
                    }
                    for(int j = 1; j<=i; j++){
                        System.out.print("*");
                    }
                    for(int j = 2; j<=i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
    }
}
