package com.green.java.ch07;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireCar fc = null;

        car.drive();
        // fc = (FireCar)car;   //자식은 부모의 객체주소를 담을 수 없다.
    }
}
