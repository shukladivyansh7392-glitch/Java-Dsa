public class Interface {
    public static void main(String[] args){
        Car car = new FuelCar();
        car.start();
        car.accelerate();
        car.brake();
    }
}

interface Car {
    void  start();

    void accelerate();

    void brake();
}

class FuelCar implements Car {

    @Override
    public void start(){
        System.out.println("fuel car is a starting");
    }
    @Override
    public void accelerate() {
        System.out.println("fuel car is a accelerating");

    }
    @Override
    public void brake()
    {
        System.out.println("fuel car is a stopping");
    }
}

class electricCar implements Car{

    @Override
    public void start(){
        System.out.println("Electric car is a starting");
    }
    @Override
    public void accelerate() {
        System.out.println("electric car is a accelerating");

    }
    @Override
    public void brake(){
        System.out.println("electric car is a stopping");
    }
}