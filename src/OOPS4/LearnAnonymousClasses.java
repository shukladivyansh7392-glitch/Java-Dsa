package OOPS4;

public class LearnAnonymousClasses {

//    class InnerClass extends OuterClass();

    OuterClass obj = new OuterClass(){

        void sing(){

        }
    };



    SuperInterface obj2 = new SuperInterface() {
        @Override
        public void interfaceMethod() {

        }
    };
    SuperInterface obj3 = () -> {

    };

//    static void main(String[] args) {
//        WalkAble walkAble = (int steps) ->{
//            IO.println("Walked"+steps+"Steps");
//            return steps;
//
//        };
//    }

}

interface walkAble{
    int walk(int steps);

}


class OuterClass{

    public void outerMethod(){
}
}

@FunctionalInterface
interface SuperInterface{
    void interfaceMethod();


}