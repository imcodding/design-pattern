package com.design.adapter;

public interface SearchOther {
    void find();
}

class FindVideo implements SearchOther {

    @Override
    public void find() {
        System.out.println("find video");
    }
}
