package com.design.proxy;

import java.util.ArrayList;

public class ProxyDesign {

    public ProxyDesign() {
        VideoPlatform platform = new VideoPlatform();

        ArrayList<Thumbnail> thumbnails = platform.getThumbnails();

        //목록에 제목만 노출됨
        for(Thumbnail thumbnail : thumbnails) {
            thumbnail.showTitle();
        }

        //해당 영상 위치에 멈추면 자동으로 미리보기 재생
        thumbnails.get(0).showPreview();
        thumbnails.get(4).showPreview();
    }
}
