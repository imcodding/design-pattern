package com.design.state;

public class StateDesign {

    public StateDesign() {

        ModeSwitch modeSwitch = new ModeSwitch();

        modeSwitch.onSwitch(); //진동 -> 무음
        modeSwitch.onSwitch(); //무음 -> 진돔
        modeSwitch.onSwitch(); //진동 => 무음
    }
}
