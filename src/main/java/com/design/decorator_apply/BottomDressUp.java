package com.design.decorator_apply;

public class BottomDressUp extends DressUpDecorator {

    public BottomDressUp(DressUp dressUpDecorator) {
        super(dressUpDecorator);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("하의 입기");
    }
}
