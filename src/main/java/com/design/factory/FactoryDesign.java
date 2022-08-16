package com.design.factory;

public class FactoryDesign {

    public FactoryDesign() {

        FighterFactory factory = new FighterFactory();

        //탄환 발사
        factory.getFighter(false, false).attack();

        //탄환, 레이저 발사
        factory.getFighter(true, false).attack();

        //탄환, 레이저, 미사일 발사
        factory.getFighter(true, true).attack();
    }
}
