package com.design.template_apply;

public abstract class Cook {
    public abstract void getIngredients(); //재료 준비
    public abstract void trimIngredients(); //재료 손실
    public abstract void makeSauceForFood(); //소스 준비

    public void cook() {
        getIngredients();
        trimIngredients();
        makeSauceForFood();
    }
}
