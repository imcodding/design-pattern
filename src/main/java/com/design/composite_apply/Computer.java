package com.design.composite_apply;

import java.util.ArrayList;

public class Computer implements ComputerDevice {

    private String name;
    private ArrayList<ComputerDevice> devices = new ArrayList<>();

    public Computer(String name) {
        this.name = name;
    }

    public void add(ComputerDevice device) {
        devices.add(device);
    }

    @Override
    public int getPower() {
        int totalPower = 0;
        for(ComputerDevice device : devices) {
            totalPower += device.getPower();
        }
        System.out.println("\n"+ name + "컴퓨터의 총 전력: " + totalPower + "W");
        return totalPower;
    }
}
