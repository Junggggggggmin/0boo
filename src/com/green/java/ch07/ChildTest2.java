package com.green.java.ch07;

public class ChildTest2 {
    public static void main(String[] args) {
        Child ch = new Child(10);
        ch.age = 20;    // = this.age

        System.out.printf("super: %d\n", ch.getSuperAge());     //부모에 저장된 Age
        System.out.printf("this: %d\n", ch.getThisAge());       //this(나 자신)에 저장된 Age
    }
}
