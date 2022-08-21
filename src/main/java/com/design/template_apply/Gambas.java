package com.design.template_apply;

public class Gambas extends Cook {
    @Override
    public void getIngredients() {
        System.out.println("새우, 마늘, 후추, 소금, 고추 등 준비");
    }

    @Override
    public void trimIngredients() {
        System.out.println("새우 씻고 소금과 후추로 간하기");
        System.out.println("마늘과 고추 다지기");
    }

    @Override
    public void makeSauceForFood() {
        System.out.println("칠리 소스 만들기");
    }
}
