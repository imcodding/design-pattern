package com.design.abstractFactory_apply;

public class AbstractFactoryDesignApply {

    public AbstractFactoryDesignApply() {

        StyleFactory pureStyleFactory = new PureStyleFactory();
        StyleFactory sexyStyleFactory = new SexyStyleFactory();

        pureStyleFactory.getStyle(Type.TOP);
        pureStyleFactory.getStyle(Type.BOTTOM);

        sexyStyleFactory.getStyle(Type.TOP);
        sexyStyleFactory.getStyle(Type.BOTTOM);
    }
}
