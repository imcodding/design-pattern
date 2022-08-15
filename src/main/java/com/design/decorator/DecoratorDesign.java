package com.design.decorator;


public class DecoratorDesign {

    public DecoratorDesign() {

        new XWingFighter().attack(); //탄환 발사

        new LaserFighter(new XWingFighter()).attack(); //탄환 + 레이저 발사

        //탄환 + 레이저 + 미사일 발사
        new MissileFighter(
            new LaserFighter(
                new XWingFighter()
            )
        ).attack();
    }
}
