package com.design.composite;

public class CompositeDesign {

    public CompositeDesign() {
        Folder schoolFolder = new Folder("학교");

        Folder grade1Folder = new Folder("1학년");
        Folder grade2Folder = new Folder("2학년");

        schoolFolder.add(grade1Folder);
        schoolFolder.add(grade2Folder);

        File enterPhoto = new File("입학사진", 256);
        grade1Folder.add(enterPhoto);

        Folder sem1Folder = new Folder("1학기");
        Folder sem2Folder = new Folder("2학기");

        grade2Folder.add(sem1Folder);
        grade2Folder.add(sem2Folder);

        File lecturePlan = new File("강의계획서", 128);
        sem1Folder.add(lecturePlan);

        Folder projectFolder = new Folder("프로젝트");
        sem2Folder.add(projectFolder);

        File draft = new File("드래프트", 452);
        File finalResult = new File("결과물", 560);

        projectFolder.add(draft);
        projectFolder.add(finalResult);

        // 트리 구조로 탐색
//        schoolFolder.getSize();
        schoolFolder.remove();
    }
}
