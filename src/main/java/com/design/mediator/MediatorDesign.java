package com.design.mediator;

public class MediatorDesign {

    public MediatorDesign() {
        ModeSwitch modeSwitch = new ModeSwitch();
        ModeMediator modeMediator = new ModeMediator();

        modeSwitch.setModeMediator(modeMediator);

        modeMediator.addListener(new ListView());
        modeMediator.addListener(new GalleryView());
        modeMediator.addListener(new DataDownLoader());

        modeSwitch.toggleMode();
        //리스트뷰 감춤
        //갤러리뷰 보여줌
        //갤러리뷰 데이터 다운로드

        modeSwitch.toggleMode();
        //리스트뷰 보여줌
        //갤러리뷰 감춤
        //리스트뷰 데이터 다운로드
    }
}
