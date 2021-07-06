package com.mbuke;

public class Human extends Animal {
    public String name;
    public Human(int legs, int teeth,String name) {
        super(legs, teeth,"Human");
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("hi!, I am " + this.name);   
        super.speak();
    }
}
