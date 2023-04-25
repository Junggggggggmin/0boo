package com.green.java.ch07.poly;

public class Animal {
    private String name;

    public Animal() {}


    public Animal(String name) {
        this.name = name;
    }


    public void crying() {
        System.out.println("동물이 운다");
    }


}


class Dog extends Animal {
    public Dog() {
        super("바둑2");
    }

    public Dog (String name) {
        super(name);
    } //String name에 삐뽀 들어와서 name에 연결 -> super(name) -> public Animal(String name)의 name에 삐뽀 들어감


    @Override
    public void crying() {
        System.out.println("멍멍");
    }

    public void jump() {
        System.out.println("개가 점프");
    }
}

class Bulldog extends Dog {
    @Override
    public void crying() {
        System.out.println("으르르르어");
    }

}

class Cat extends Animal {

//    public Cat() {
//        super();
//    }                     //생략되어있는것
    @Override
    public void crying() {
        System.out.println("야옹");
    }

}

class Duck extends Animal {
    @Override
    public void crying() {
        System.out.println("꽥");
    }

}
