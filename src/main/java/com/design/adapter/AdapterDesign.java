package com.design.adapter;

import com.design.strategy.SearchButton;

public class AdapterDesign {

    public AdapterDesign() {

        SearchButton searchButton = new SearchButton();
        searchButton.selectType(new SearchFindAdapter(new FindVideo()));

        // 다르게 정의된 검색방식을 어댑터를 이용하여 기존 형태처럼 사용 가능!
        // 즉, find 로 검색 가능했던 것을 search 로 검색 가능하도록 만듦.
        searchButton.onClick(); // 비디오 검색
    }

}
