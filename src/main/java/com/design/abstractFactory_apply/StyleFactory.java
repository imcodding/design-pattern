package com.design.abstractFactory_apply;

interface StyleFactory {
    Style getStyle(Type type);
}

class PureStyleFactory implements StyleFactory {

    @Override
    public Style getStyle(Type type) {
        if(type == Type.TOP) {
            return new PureTop();
        } else {
            return new PureBottom();
        }
    }
}

class SexyStyleFactory implements StyleFactory {

    @Override
    public Style getStyle(Type type) {
        if(type == Type.TOP) {
            return new SexyTop();
        } else {
            return new SexyBottom();
        }
    }
}
