package com.design.strategy;

public class StrategyDesign {

    public StrategyDesign() {

        SearchButton searchButton = new SearchButton();

        searchButton.onClick(); //전체 검색

        searchButton.selectType(new SearchStrategyImage());
        searchButton.onClick(); //이미지 검색

        searchButton.selectType(new SearchStrategyNews());
        searchButton.onClick(); //뉴스 검색

        searchButton.selectType(new SearchStrategyMap());
        searchButton.onClick(); //지도 검색
    }
}
