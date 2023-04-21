package com.green.java.ch07;

public class Child extends Parent {
    int age;        //20부여 ㅋ

    public Child() {
    }

    public Child(int age) {
        super();
        super.age = age;        //부모에 있는 age값을 복사해서 넘어와서 부여
        System.out.println("-- Child int age 생성자 --");
    }


    public int getSuperAge() {
        return super.age;
    }

    public int getThisAge() {
        return this.age;
    }

    void play() {
        System.out.printf("%d살인 아이가 논다.\n", age);
    }
}
