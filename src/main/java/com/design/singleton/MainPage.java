package com.design.singleton;

public class MainPage {

    private Settings settings = Settings.getSettings();;

    public void setSettings() {
        settings.setDarkMode(true);
        settings.setFontSize(11);
        settings.setLanguage("English");
    }
}
