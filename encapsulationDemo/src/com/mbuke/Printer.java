package com.mbuke;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;
    public Printer(int tonerLevel,boolean isDuplex){
        if(tonerLevel >= 0 && tonerLevel <= 100){
            this.tonerLevel  = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }
    public int  addToner(int toner){
        if(toner >= 0 && toner <= 100){
            // overfilling case
            if(this.tonerLevel + toner > 100){
                return -1;
            }
            this.tonerLevel = toner;
            return this.tonerLevel;
        }else{
            return -1;
        }
    }
    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.isDuplex){
            pagesToPrint = pages / 2 + (pages % 2);
            System.out.println("printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return  pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
