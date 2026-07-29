public class Polymorephism {
    static void mai(String[] args){
        B a = new B();
//        A.fun();
//        System.out.println(a.x);
        System.out.println(a.getX());

    }
}

class A{
//    int x = 10;
    int getX(){
        return 10;
    }

}

class B extends A{
//    int x = 20;
    int getX(){
        return 20;
    }
}


//Static --> They Belong to Class and not to Objects
//private methods can be override.
//Final methods can not be override.
//Field / Variable they can not Polymorphism
//static
//class A{
//    static void fun(){
//        System.out.println("Hello");
//    }
//    private void fun2(){
//        System.out.println("Hello");
//    }
//    final void fun3(){
//        System.out.println("Hello");
//    }
//}
//class B extends A{
//    static void fun(){
//        System.out.println("bye");
//    }
////    void fun3(){
////        System.out.println("bye");
////    }

  //      }

