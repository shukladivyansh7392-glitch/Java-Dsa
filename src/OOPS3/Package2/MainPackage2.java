package OOPS3.Package2;

import OOPS3.learnPackage.Teacher;

public class MainPackage2 extends Teacher {

    static void main(String[] args) {
        Teacher obj = new Teacher();
//        obj.id =123;
        obj.teachingClass = 4;
//        obj.degree = "PHD";

        MainPackage2 mainPackage2 = new MainPackage2();
        mainPackage2.studentCount = 100;
    }
}
