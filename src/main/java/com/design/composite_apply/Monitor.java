package com.design.composite_apply;

public class Monitor implements ComputerDevice {

    private String name;
    private int power;

    public Monitor(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public int getPower() {
        System.out.println("모델명: " + name + " / 전력: " + power + "W");
        return this.power;
    }
}
