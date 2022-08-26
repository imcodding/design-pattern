package com.design.mediator_apply;

public class MediatorDesignApply {

    public MediatorDesignApply() {
        DevState devState = new DevState();
        StateMediator stateMediator = new StateMediator();

        devState.setStateMediator(stateMediator);

        stateMediator.addListener(new Device());
        stateMediator.addListener(new DeviceDetail());

        devState.toggleState();
        devState.toggleState();
    }
}
