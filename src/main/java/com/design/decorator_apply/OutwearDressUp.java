package com.design.decorator_apply;

public class OutwearDressUp extends DressUpDecorator {

    public OutwearDressUp(DressUp dressUpDecorator) {
        super(dressUpDecorator);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("겉옷 입기");
    }
}
