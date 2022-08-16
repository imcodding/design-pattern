package com.design.factory;

import com.design.decorator.Fighter;
import com.design.decorator.LaserFighter;
import com.design.decorator.MissileFighter;
import com.design.decorator.XWingFighter;

public class FighterFactory {

    public Fighter getFighter(boolean laser, boolean missile) {
        Fighter fighter = new XWingFighter();

        if(laser) fighter = new LaserFighter(fighter);
        if(missile) fighter = new MissileFighter(fighter);

        return fighter;
    }
}
