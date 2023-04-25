package com.green.java.ch07.poly;

public class PolyQuiz1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("삐뽀");
        Bulldog bd1 = new Bulldog();
        Cat cat1 = new Cat();
        Duck duck1 = new Duck();




        animalCryingCall(dog1);
        animalCryingCall(bd1);
        animalCryingCall(cat1);
        animalCryingCall(duck1);
    }


    public static void animalCryingCall (Animal A) {
        A.crying();

        if(A instanceof Dog) {
            ((Dog)A).jump();      //메소드가 Dog를 인식하지못하므로 @@강제형변환@@ 시킴
        }
    }
}
