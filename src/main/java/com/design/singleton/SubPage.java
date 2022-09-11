package com.design.singleton;

public class SubPage {

    private Settings settings = Settings.getSettings();

    public void printSettings() {
        System.out.println("다크 모드: " + (settings.isDarkMode() ? "ON" : "OFF"));
        System.out.println("폰트 크기: " + settings.getFontSize());
        System.out.println("언어: " + settings.getLanguage());
    }
}
