package com.design.adapter;

import com.design.strategy.SearchStrategy;

public class SearchFindAdapter implements SearchStrategy {

    private SearchOther searchOther;

    public SearchFindAdapter(SearchOther searchOther) {
        this.searchOther = searchOther;
    }

    @Override
    public void search() {
        searchOther.find();
    }
}
