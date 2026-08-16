package OOPS;

import java.util.Scanner;

public class Student {
    String name;
    int age;

    public void initialize(String name, int age){

    }
}



class Demo{
    static void main(String[] args) {
        //ClassName variableName = new ClassName()
        Student s1 = new Student();
        s1.name = "Divyansh";
        s1.age = 19;

        Student s2 = new Student();
        s2.name = "piyush";
        s2.age = 19;

        Student s3 = new Student();
        s3.name = "piyush";
        s3.age = 19;
        System.out.println(s1.name + " - " + s1.age);
        System.out.println(s2.name + " - " + s2.age);
        System.out.println(s3.name + " - " + s3.age);

    }
}