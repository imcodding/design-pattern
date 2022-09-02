package com.design.strategy;

public interface SearchStrategy {

    void search();
}

class SearchStrategyAll implements SearchStrategy {

    @Override
    public void search() {
        System.out.println("search all");
    }
}

class SearchStrategyImage implements SearchStrategy {

    @Override
    public void search() {
        System.out.println("search image");
    }
}

class SearchStrategyNews implements SearchStrategy {

    @Override
    public void search() {
        System.out.println("search news");
    }
}

class SearchStrategyMap implements SearchStrategy {

    @Override
    public void search() {
        System.out.println("search map");
    }
}