package com.mbuke;

public class  Motherboard {
    private String model;
    private String manufacturer;
    private int ramslots;

    public Motherboard(String model, String manufacturer, int ramslots) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramslots = ramslots;
    }
    public void loadProgram(String program)
    {
        System.out.println("Program " + program + " is loading.....");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamslots() {
        return ramslots;
    }
}
