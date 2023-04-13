package com.green.java.ch04;
/*
    [1, 1]
           [2, 2]
                  [3, 3]
 */
public class FlowEx21 {
    public static void main(String[] args) {
        for(int i = 1; i < 4; i++){
            for(int z = 1; z <= i; z++){
                if( i==z ){
                System.out.printf("[%d, %d]", i, z);
            }
            else System.out.printf("%5c", ' ');
        }
            System.out.println();
        }
    }
}
