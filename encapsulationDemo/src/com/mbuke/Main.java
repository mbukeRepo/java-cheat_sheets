package com.mbuke;

public class Main {

    public static void main(String[] args) {
     // introduction code
	 Player midfielder = new Player("cristiano Ronaldo", 120, "revolver");
	 System.out.println("Initial health: " + midfielder.getHealth());
	 midfielder.looseHealth(60);
	 // challenges code
     // simulating a printer
     Printer hp = new Printer(50,true);
     System.out.println("Initial number of pages: " + hp.getPagesPrinted());
     int pagesPrinted = hp.printPages(4);
     System.out.println("Pages printed: " + hp.getPagesPrinted());
     pagesPrinted = hp.printPages(2);
     System.out.println("pages printing: " + pagesPrinted + " Pages printed: " + hp.getPagesPrinted());
    }
}
