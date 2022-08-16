package com.design.abstractFactory;

abstract public class Component {
    protected abstract String getCompName();
    public Component() {
        System.out.println(this.getCompName() + " 생성");
    }
}

class LightButton extends Component {

    @Override
    protected String getCompName() {
        return "라이트 버튼";
    }
}
class DarkButton extends Component {

    @Override
    protected String getCompName() {
        return "다크 버튼";
    }
}
class LightSwitch extends Component {

    @Override
    protected String getCompName() {
        return "라이트 스위치";
    }
}
class DarkSwitch extends Component {

    @Override
    protected String getCompName() {
        return "다크 스위치";
    }
}

enum Usage {
    PRESS, TOGGLE
}