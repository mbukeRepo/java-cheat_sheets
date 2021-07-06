package com.mbuke;

public class Animal {
    public int legs;
    public int teeth;
    public String type;
    public Animal(int legs,int teeth, String type)
    {
        this.legs = legs;
        this.teeth = teeth;
        this.type = type;
    }
    public void speak(){
        System.out.println("Animal.speak() called");
    }
}
