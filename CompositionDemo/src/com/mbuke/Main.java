package com.mbuke;

public class Main {

    public static void main(String[] args) {
	    Case thecase = new Case("220B","Dell",new Dimensions(23,23,23));
	    Monitor monitor = new Monitor("27inch Beast","acer",23,new Resolution(23,23));
	    Motherboard  motherboard = new Motherboard("23-56","asus",23);

	    PC thepc = new PC(thecase,monitor,motherboard);

	    thepc.getMonitor().drawPixelAt(23,23,"yellow");
	    thepc.getMotherboard().loadProgram("ubuntu 20.01");
    }
}
