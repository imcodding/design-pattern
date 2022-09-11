package com.design.singleton;

public class SingletonDesign {

    public SingletonDesign() {
        MainPage mainPage = new MainPage();
        mainPage.setSettings();

        SubPage subPage = new SubPage();
        subPage.printSettings();
    }
}
