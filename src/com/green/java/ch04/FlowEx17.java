package com.green.java.ch04;

public class FlowEx17 {
    public static void main(String[] args) {
        int star = 6;


        //*
        //**
        //***
        //****
        //*****

        for (int i = 0; i < star; i++) {
            for (int z = star; z > i; z--){
                System.out.print("*");
        }
        System.out.println();
    }
}
}


//0012345
//543210