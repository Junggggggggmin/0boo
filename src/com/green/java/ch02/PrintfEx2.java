package com.green.java.ch02;

public class PrintfEx2 {
    public static void main(String[] args) {
        String url = "http://www.codechobo.com";
        float f1 = .10f;
        double d = 1.2345678;


        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);     //%는 printf에서만 useable,   %g : 간단하게 표현
        System.out.printf("d=%f\n", d);
        System.out.printf("d=%14.10f\n", d);       //.기준 앞자리 전체 자릿수, 뒷자리는 소수점 자리수
        System.out.printf("d=%.3f\n", d);

        System.out.println("[12345678901234567890]");
        System.out.printf("%s\n", url);
        System.out.printf("[%30s]\n", url);
        System.out.printf("[%-30s]\n", url);
        System.out.printf("[%.8s]\n", url);

    }
}