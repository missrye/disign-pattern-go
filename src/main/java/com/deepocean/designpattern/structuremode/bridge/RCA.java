package com.deepocean.designpattern.structuremode.bridge;

public class RCA extends TV {
    @Override
    public void on() {
        System.out.println("RCA.on");
    }

    @Override
    public void off() {
        System.out.println("RCA.off");
    }

    @Override
    public void tuneChannel() {
        System.out.println("RCA.tuneChannel");
    }
}
