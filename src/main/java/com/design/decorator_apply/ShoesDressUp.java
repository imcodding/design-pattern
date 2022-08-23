package com.design.decorator_apply;

public class ShoesDressUp extends DressUpDecorator {

    public ShoesDressUp(DressUp dressUpDecorator) {
        super(dressUpDecorator);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("신발 신기");
    }
}
