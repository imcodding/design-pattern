package com.design.mediator_apply;

import java.util.ArrayList;

public class StateMediator {

    ArrayList<StateListener> listeners = new ArrayList<>();

    public void addListener(StateListener listener) { listeners.add(listener); }
    public void onStateChange(State state) {
        for(StateListener listener : listeners) {
            listener.onStateChange(state);
        }
    }
}
