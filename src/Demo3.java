public class Demo3 {
    public static void main(String[] args){
        //EngineeringStudent1 es1 = new EngineeringStudent1();

//        es1.name = "Divyansh Shukla";
//        es1.age = 19;
//        es1.rollNo = 10;
//        es1.college = "University of Lucknow";
//
//        es1.print();

        EngineeringStudent1 es2 = new EngineeringStudent1("Divyansh", 28, 101, "IIT Guwahati");
        es2.print();
    }
}

class Student1 {
    String name;
    int age;
    int rollNo;

    Student1() {}

    Student1(String name, int Age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    void print(){
        System.out.println(name + " , " + age + " , " + rollNo);

    }
}
class EngineeringStudent1 extends Student1 {
    String college;

     EngineeringStudent1(String name, int age, int rollNo, String college){
       //  super("name, age, rollNo");
//         this.name = name;
//         this.age = age;
//         this.rollNo = rollNo;
        this.college = college;
    }
    void print() {
        super.print();
        System.out.println(college);

    }

}


//public class Demo3 {
//    public static void main(String[] args) {
//        // EngineeringStudent es1 = new EngineeringStudent();
//        // es1.name = "Aditya";
//        // es1.age = 28;
//        // es1.rollNo = 101;
//        // es1.college = "IIT Guwahati";
//
//        // es1.print();
//
//        EngineeringStudent es2 = new EngineeringStudent("Aditya", 28, 101, "IIT G");
//        es2.print();
//    }
//}
//
//class Student1 {
//    String name;
//    int age;
//    int rollNo;
//
//    Student1() {}
//
//    Student1(String name, int age, int rollNo) {
//        this.name = name;
//        this.age = age;
//        this.rollNo = rollNo;
//    }
//
//    void print() {
//        System.out.println(name + " , " + age + " , " + rollNo);
//    }
//}
//
//class EngineeringStudent extends Student {
//    String college;
//
//    EngineeringStudent(String name, int age, int rollNo, String college) {
//        super(name, age, rollNo);
//        this.college = college;
//    }
//
//     void print() {
//        super.print();
//        System.out.println(college);
//    }
//
//
//}