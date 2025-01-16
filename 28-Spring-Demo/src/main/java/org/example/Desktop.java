package org.example;

public class Desktop implements Computer{
    Desktop(){
        System.out.println("Desktop object created...");
    }

    @Override
    public void compile() {
        System.out.println("Compiling from desktop...");
    }
}
