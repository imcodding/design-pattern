package com.design.command;

public class Machine {

    public enum Base { WATER, MILK }
    public enum Syrup { BASIC, VANILLA, HAZELNUT }

    public void pourBase(Base base) {
        System.out.println(base == Base.WATER ? "물" : "우유" + " 붓기");
    }

    public void putEspressoShot(int count) {
        System.out.println("에스프레소 " + count + "샷 넣기");
    }

    public void putSyrup(Syrup syrup) {
        System.out.println(syrup + " 시럽 추가");
    }
}
