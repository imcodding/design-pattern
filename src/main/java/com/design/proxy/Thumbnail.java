package com.design.proxy;

public interface Thumbnail {
    void showTitle();
    void showPreview();
}

class ProxyThumbnail implements Thumbnail {

    private String title;
    private String videoUrl;
    private RealThumbnail realThumbnail;

    public ProxyThumbnail(String title, String videoUrl) {
        this.title = title;
        this.videoUrl = videoUrl;
    }

    @Override
    public void showTitle() {
        System.out.println("제목: " + title);
    }

    @Override
    public void showPreview() {
        if(realThumbnail == null) {
            realThumbnail = new RealThumbnail(title, videoUrl);
        }
        realThumbnail.showPreview();
    }
}

class RealThumbnail implements Thumbnail {

    private String title;
    private String videoUrl;

    public RealThumbnail(String title, String videoUrl) {
        this.title = title;
        this.videoUrl = videoUrl;

        System.out.println(title + " 영상 다운로드(" + videoUrl + ")");
    }

    @Override
    public void showTitle() {
        System.out.println("제목: " + title);
    }

    @Override
    public void showPreview() {
        System.out.println(title + " 미리보기 재생");
    }
}
