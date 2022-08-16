package com.design.abstractFactory;

public class AbstractFactoryDesign {

    public AbstractFactoryDesign() {
        CompFactory lightCompFactory = new LightCompFactory();
        CompFactory darkCompFactory = new DarkCompFactory();

        lightCompFactory.getComp(Usage.PRESS); //라이트 버튼 생성
        lightCompFactory.getComp(Usage.TOGGLE); //라이트 스위치 생성

        darkCompFactory.getComp(Usage.PRESS); //다크 버튼 생성
        darkCompFactory.getComp(Usage.TOGGLE); //다크 스위치 생성
    }
}
