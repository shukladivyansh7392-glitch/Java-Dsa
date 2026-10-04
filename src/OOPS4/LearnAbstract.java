package OOPS4;

public class LearnAbstract {

    static void main(String[] args) {
        Car c1 = new Car();
        c1.accelerate();
        c1.brakes(4);

    }


}

abstract class Vehicle{
    abstract void accelerate();

    abstract int brakes(int wheels);

    void honks(){
        System.out.println("Vehicle honks");
    }
}
class Car extends Vehicle{

    @Override
    void accelerate() {
        System.out.println("Car Is Accelerating");
    }


    int brakes(int wheels) {
        System.out.println("Car breaks are pushed");
        return wheels;
    }

    void honks() {
        System.out.println("Car is Honked ");
    }
}