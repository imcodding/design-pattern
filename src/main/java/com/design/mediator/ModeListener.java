package com.design.mediator;

public interface ModeListener {
    public void onModeChange(Mode mode);
}

class ListView implements ModeListener {

    @Override
    public void onModeChange(Mode mode) {
        System.out.println("리스트뷰 " + (mode == Mode.LIST ? "보여줌" : "감춤"));
    }
}

class GalleryView implements ModeListener {

    @Override
    public void onModeChange(Mode mode) {
        System.out.println("갤러리뷰 " + (mode == Mode.LIST ? "보여줌" : "감춤"));
    }
}

class DataDownLoader implements ModeListener {

    @Override
    public void onModeChange(Mode mode) {
        System.out.println((mode == Mode.LIST ? "갤러리" : "리스트") + "뷰 데이터 다운로드");
    }
}