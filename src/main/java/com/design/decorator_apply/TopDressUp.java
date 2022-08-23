package com.design.decorator_apply;

public class TopDressUp implements DressUp {

    @Override
    public void wear() {
        System.out.println("상의 입기");
    }
}
