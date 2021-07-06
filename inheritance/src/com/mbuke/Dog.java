package com.mbuke;

public class Dog extends Animal{
    public Dog(int legs,int teeth){
        super(legs,teeth,"Dog");
    }

    @Override
    public void speak() {
        System.out.println("woooooo,woooo!!!");
        super.speak();
    }
}
