package com.design.template_apply;

public class KimchiPancake extends Cook {
    @Override
    public void getIngredients() {
        System.out.println("김치, 밀가루, 식용유 등 재료 준비");
    }

    @Override
    public void trimIngredients() {
        System.out.println("김치 자르기");
        System.out.println("반죽 만들기");
    }

    @Override
    public void makeSauceForFood() {
        System.out.println("간장 소스 만들기");
    }
}
