//Types of inheritance
//Simple inheritance
//multi-level inheritance
//hierarchical inheritance
//multiple inheritance (not suported in JAVA)

//public class Demo2 {
//    public static void main(String[] args){
////        CSEEngineeringstudent cs1 = new CSEEngineeringstudent();
//
//    }
//}
//
//class student { //Parent. --> A
//    String name;
//    int age;
//
//    public student(String divyansh, int i) {
//    }
//
//    public void markAttendance() {
//        System.out.println("Attendance marked");
//    }
//}
//
//class Engineeringstudent extends student { //Child class -->B
//    void attendLab(){
//        System.out.println("lab attended for Engineering student");
//    }
//}
//
//class Medicalstudent extends student { //Child class -->C
//    void attendLab(){
//        System.out.println("lab attended for Medicalstudent");
//    }
//}

//A --> B --> C

//class CSEEngineeringstudent extends Engineeringstudent {
//    void attendCSELab(){
//
//    }
//}

//Multilevel
//Student --> Engineeringstudent --> CSEEngineeringstudent.

//Hierrarchy
//       A
//     /   \
//    B     C

//Multiple
//    A    B
//     \  /
//      C