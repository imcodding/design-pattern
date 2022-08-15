package com.design.decorator;

public class MissileFighter extends FighterDecorator {

    public MissileFighter(Fighter _decoratedFighter) {
        super(_decoratedFighter);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("미사일 발사");
    }
}
