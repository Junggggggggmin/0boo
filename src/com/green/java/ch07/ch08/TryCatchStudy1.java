package com.green.java.ch08;
//p.416
public class TryCatchStudy1 {
    public static void main(String[] args) {
        try {
            int result = 10 / 1;        //예외 발생 시 바로 catch문으로 넘어감
            System.out.println("next line"); //실행 x
            //예외가 발생될 가능성이 있는 로직(source) 위치
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외 발생");
            //예외가 발생되었을 때 하고 싶은 작업(로직) 위치
        }
        finally {
            System.out.println("fi널리");
            //옵션, 예외가 발생이 되든 안되든 무조건 실행하고 싶은 로직 위치
        }
        System.out.println("끝");

    }
}
