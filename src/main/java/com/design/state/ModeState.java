package com.design.state;

public interface ModeState {
    void toggle(ModeSwitch modeSwitch);
}

class VibrationMode implements ModeState {

    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("진동모드 -> 무음모드 전환");
        modeSwitch.setModeState(new SilenceMode());
    }
}
class SilenceMode implements ModeState {

    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("무음모드 -> 진동모드 전환");
        modeSwitch.setModeState(new VibrationMode());
    }
}
