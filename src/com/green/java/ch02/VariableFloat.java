package com.green.java.ch02;

public class VariableFloat {
    public static void main(String[] args) {
        //double(8byte), float (4byte)        플롯보다 더블이 정확(저장공간 차이)
        float f1 = 10;                     //리터럴 기본값은 더블??
        System.out.println(f1);

        f1 = (float)9.77;
        f1 = 9.77f;
        f1 = 9.77F;                     //여기서부터 위쪽 세 줄 같은 의미
        System.out.println(f1);

        long l1 = 100;
        float f2 = l1; //타입이 다른데 적용됨 -> 자동형변환 일어남    float 4byte, long 8byte
        System.out.println(f2);

        double d1 = 9.77d;
        double d2 = 9.77D;
        System.out.println(d1);
    }
}


