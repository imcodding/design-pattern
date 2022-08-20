package com.design.composite;

import java.util.ArrayList;

public class Folder implements FileSystem {

    private String name;
    private ArrayList<FileSystem> includes = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem fileSystem) {
        includes.add(fileSystem);
    }

    @Override
    public int getSize() {
        int total = 0;
        for(FileSystem fileSystem : includes) {
            total += fileSystem.getSize();
        }
        System.out.println(name + " 폴더 크기: " + total);
        System.out.println("- - - - -");
        return total;
    }

    @Override
    public void remove() {
        for(FileSystem fileSystem : includes) {
            fileSystem.remove();
        }
        System.out.println(name + " 폴더 삭제");
    }
}
