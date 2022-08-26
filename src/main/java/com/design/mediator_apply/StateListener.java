package com.design.mediator_apply;

public interface StateListener {
    void onStateChange(State state);
}

class Device implements StateListener {

    @Override
    public void onStateChange(State state) {
        System.out.println("장비 상태: " + (state == State.NORMAL ? "정상" : "장애"));
    }
}

class DeviceDetail implements StateListener {

    @Override
    public void onStateChange(State state) {
        System.out.println("장비 상세정보 " + (state == State.NORMAL ? "조회" : "조회 불가능"));
    }
}
