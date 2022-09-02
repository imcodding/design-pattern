package com.design.strategy;

public class SearchButton {

    private SearchStrategy searchStrategy = new SearchStrategyAll();

    public void selectType(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public void onClick() {
        this.searchStrategy.search();
    }
}


