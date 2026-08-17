package OOPS;

public class Student {
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void initialize(){

    }

    public void print(){
        System.out.println(this.name + " - " + this.age);
    }
}



class Demo{
    static void main(String[] args) {
        //ClassName variableName = new ClassName()
        Student s1 = new Student("Golu", 12);
        //s1.initialize("Golu", 12);
//        s1.name = "Divyansh";
//        s1.age = 19;

        Student s2 = new Student("Polu", 13);
        //s2.initialize("Polu", 13);

        Student s3 = new Student("Molu", 17);
//        s3.name = "piyush";
//        s3.age = 19;
        //s3.initialize();

        Student s4 = new Student("Sholu", 15);
//        s4.initialize("Sholu", 15);


        s1.print();
        s2.print();
        s3.print();
        s4.print();




    }
}