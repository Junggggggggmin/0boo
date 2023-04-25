package com.green.java.ch07;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireCar fc = new FireCar();
        FireCar fc2 = null;


        fc.water();
        car = fc;             //상속관계에서 타입이 달라도 형변환 가능
        //car.water           //car type에는 drive, stop만 알고있음
        fc2 = (FireCar)car;
        fc2.water();
//        car = new Car();      //이거 쓰면 false 나옴
        if (car instanceof FireCar) {
            fc2 = (FireCar) car;
            fc2.water();
        } else {
            System.out.println("nope!!");
        }
    }
}


class Car {
    void drive() {
        System.out.println("drive, Brrrrrrr~");
    }
    void stop() {
        System.out.println("stop!!!");
    }
}

class FireCar extends Car {
    void water() {
        System.out.println("water!!!");
    }
}