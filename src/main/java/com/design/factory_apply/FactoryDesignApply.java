package com.design.factory_apply;

public class FactoryDesignApply {

    public FactoryDesignApply() {

        DressUpFactory dressUpFactory = new DressUpFactory();

        dressUpFactory.getDressUp(true, true, false, false).wear();

        dressUpFactory.getDressUp(true, true, true, false).wear();

        dressUpFactory.getDressUp(true, true, true, true).wear();

    }
}
