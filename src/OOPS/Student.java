package OOPS;

public class Student {
    private String name;
    private int age;

//    public Student(){
//        this("Golu");
//        System.out.println("Default Constructor!!");
//    }
    public Student(String name, int age){
//        System.out.println("Two Parameter");
        this.name = name;
        this.age = age;
    }
//    Student(String name) {
//        this("Polu",21);
//        this.name = name;
//        this.age = age;
//        System.out.println("Single Parameter");
//    }

//    public void print(){
//        System.out.println(this.name + " - " + this.age);
//    }
//}

//    public String getName(){
//    return this.name;
//    }
//
//    public int getAge(){
//        return this.age;
//    }
//
//    public void setAge(int age){
//        this.age = age;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) return; //validation
        this.age = age;
    }

//    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



class Demo{
    static void main(String[] args) {
        Student s1 = new Student("Golu",21);
        System.out.println(s1);
//        System.out.println(s1.getName());
//        System.out.println(s1.getAge());
//        s1.setAge(88);
//        System.out.println(s1.getAge());





        //ClassName variableName = new ClassName()
//        Student s1 = new Student("Golu", 12);
//        //s1.initialize("Golu", 12);
////        s1.name = "Divyansh";
////        s1.age = 19;
//
//        Student s2 = new Student("Polu", 13);
//        //s2.initialize("Polu", 13);
//
//        Student s3 = new Student("Molu", 17);
////        s3.name = "piyush";
////        s3.age = 19;
//        //s3.initialize();
//
//        Student s4 = new Student("Sholu", 15);
////        s4.initialize("Sholu", 15);
//        Student s5 = new Student("divyansh");
//
//
//        s1.print();
//        s2.print();
//        s3.print();
//        s4.print();
//        s5.print();




    }
}