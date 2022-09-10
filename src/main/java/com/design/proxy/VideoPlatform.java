package com.design.proxy;

import java.util.ArrayList;

public class VideoPlatform {

    private ArrayList<Thumbnail> thumbnails = new ArrayList<>();

    public VideoPlatform() {
        thumbnails.add(new ProxyThumbnail("Spring 강의", "/spring.mp4"));
        thumbnails.add(new ProxyThumbnail("Vue 강의", "/vue.mp4"));
        thumbnails.add(new ProxyThumbnail("React 강의", "/react.mp4"));
        thumbnails.add(new ProxyThumbnail("Android 강의", "/android.mp4"));
        thumbnails.add(new ProxyThumbnail("Git 강의", "/git.mp4"));
    }

    public ArrayList<Thumbnail> getThumbnails() {
        return thumbnails;
    }
}
