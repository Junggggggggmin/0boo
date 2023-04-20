package com.green.java.ch04;

public class FlowEx17Method {
    public static void main(String[] args) {
        int star = 5;

        printStarLine(star); //*****
        printStarLine(6); //******
        printStarLine(6); //******
        System.out.println("====================");

        printStarRect(3);
        //***
        //***
        //***
        System.out.println("====================");

        printStarTri(4);
        //*
        //**
        //***
        //****

    }

    public static void printStarLine(int star) {    //
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printStarRect(int star) {
        for (int i = 0; i < star; i++) {
            printStarLine(star);                //위에 있는 프린트 재활용
        }
        System.out.println();
    }

    public static void printStarTri(int star) {
        for (int i = 0; i < star+1; i++) {
            printStarLine(i);
        }
    }
}


//출력은 main에서 함