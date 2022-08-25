package com.design.abstractFactory_apply;

abstract public class Style {

    protected abstract String getStyle();
    public Style() {
        System.out.println(this.getStyle() + " 입기");
    }
}

class PureTop extends Style {

    @Override
    protected String getStyle() {
        return "흰 티";
    }
}

class PureBottom extends Style {

    @Override
    protected String getStyle() {
        return "청바지";
    }
}

class SexyTop extends Style {

    @Override
    protected String getStyle() {
        return "딱 붙는 티";
    }
}

class SexyBottom extends Style {

    @Override
    protected String getStyle() {
        return "핫팬츠";
    }
}

enum Type {
    TOP, BOTTOM
}