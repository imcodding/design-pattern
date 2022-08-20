package com.design.composite;

public class File implements FileSystem {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        System.out.println(name + " 파일 크기: " + size);
        return size;
    }

    @Override
    public void remove() {
        System.out.println(name + " 파일 삭제");
    }
}
