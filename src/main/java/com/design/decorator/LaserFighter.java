package com.design.decorator;

public class LaserFighter extends FighterDecorator {

    public LaserFighter(Fighter _decoratedFighter) {
        super(_decoratedFighter);
    }

    @Override
    public void attack() {
        super.attack(); //상속 부모의 attack 호출
        System.out.println("레이저 발사");
    }
}
