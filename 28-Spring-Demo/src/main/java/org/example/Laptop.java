package org.example;

public class Laptop implements Computer {
    private String brand;
    private int ram;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public void compile() {
        System.out.println("Compiling from laptop...");
    }
}
