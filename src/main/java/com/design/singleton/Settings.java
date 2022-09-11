package com.design.singleton;

public class Settings {

    private boolean darkMode = false;
    private int fontSize = 12;
    private String language = "Korean";
    private Settings() {}
    private static Settings settings = null;

    public static Settings getSettings() {
        if(settings == null) {
            settings = new Settings();
        }
        return settings;
    }

    public boolean isDarkMode() {
        return darkMode;
    }

    public void setDarkMode(boolean darkMode) {
        this.darkMode = darkMode;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
