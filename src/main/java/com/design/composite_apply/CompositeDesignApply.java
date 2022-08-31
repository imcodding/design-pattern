package com.design.composite_apply;

public class CompositeDesignApply {

    public CompositeDesignApply() {

        Computer computer = new Computer("MS-7B23");

        computer.add(new Keyboard("LEOPOLD", 5));
        computer.add(new Mouse("M110s", 3));
        computer.add(new Monitor("Alphascan", 20));

        computer.getPower();
    }
}
