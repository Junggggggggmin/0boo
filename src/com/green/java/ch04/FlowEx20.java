package com.green.java.ch04;
/*
    [1, 1] [1,2] [1,3]
    ...
 */
public class FlowEx20 {
    public static void main(String[] args) {
        int a = 11;
       for(int i = 1; i < a; i++){
           for(int z = 1; z < a; z++){
               System.out.printf("[%d, %d] \t", i, z);
           }
           System.out.println();
       }
    }
}
