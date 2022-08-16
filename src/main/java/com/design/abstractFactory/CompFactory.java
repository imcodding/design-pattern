package com.design.abstractFactory;

interface CompFactory {
    Component getComp(Usage usage);
}

//라이트 테마
class LightCompFactory implements CompFactory {

    @Override
    public Component getComp(Usage usage) {
        if(usage == Usage.PRESS) {
            return new LightButton();
        } else {
            return new LightSwitch();
        }
    }
}

//다크 테마
class DarkCompFactory implements CompFactory {

    @Override
    public Component getComp(Usage usage) {
        if(usage == Usage.PRESS) {
            return new DarkButton();
        } else {
            return new DarkSwitch();
        }
    }
}
