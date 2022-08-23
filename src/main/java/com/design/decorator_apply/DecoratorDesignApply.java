package com.design.decorator_apply;

public class DecoratorDesignApply {

    public DecoratorDesignApply() {

        //상의, 하의
        //new BottomDressUp(new TopDressUp()).wear();

        //상의, 하의, 신발, 겉옷
        new OutwearDressUp(
            new ShoesDressUp(
                new BottomDressUp(
                    new TopDressUp()
                )
            )
        ).wear();
    }
}
