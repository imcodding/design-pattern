package com.design.decorator_apply;

public class DressUpDecorator implements DressUp {

    private final DressUp _dressUpDecorator;

    public DressUpDecorator(DressUp dressUpDecorator) {
        _dressUpDecorator = dressUpDecorator;
    }

    @Override
    public void wear() {
        _dressUpDecorator.wear();
    }
}
