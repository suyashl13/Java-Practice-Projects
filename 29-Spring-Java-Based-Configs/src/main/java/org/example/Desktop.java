package org.example;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

    private int ram;

    public Desktop(){
        System.out.println("Desktop object created...");
    }

    @Override
    public void compile() {
        System.out.println("Compiling from desktop...");
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
