package com.design.state;

public class ModeSwitch {

    private ModeState modeState = new VibrationMode();

    public void setModeState(ModeState modeState) {
        this.modeState = modeState;
    }

    public void onSwitch() {
        modeState.toggle(this);
    }
}
