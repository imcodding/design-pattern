package com.design.mediator_apply;

public class DevState {

    State state = State.NORMAL;

    StateMediator stateMediator;

    public void setStateMediator(StateMediator stateMediator) {
        this.stateMediator = stateMediator;
    }

    public void toggleState() {
        state = state == State.NORMAL ? State.ERROR : State.NORMAL;

        if(stateMediator != null) {
            stateMediator.onStateChange(state);
        }
    }
}

enum State {
    NORMAL, ERROR
}