package com.design.composite_apply;

public class Mouse implements ComputerDevice {

    private String model;
    private int power;

    public Mouse(String model, int power) {
        this.model = model;
        this.power = power;
    }

    @Override
    public int getPower() {
        System.out.println("모델명: " + model + " / 전력: " + power + "W");
        return this.power;
    }
}
