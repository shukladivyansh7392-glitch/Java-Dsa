public class DEMO {
   public static void main(String[] args){

       Car car = new ElectricCar();
       car.start();
       car.accelerate();
       car.brake();
   }
}

abstract class car{
    void start(){
        System.out.println("Car is started");
    }
    abstract void accelerate();

    abstract void brake();
}
class fuelCar extends car{

    @Override
    void eccelerate(){
        System.out.println("fuel car is a accelerating");

        @Override
        void brake;(){
            System.out.println("fuel car is a stopping");
        }
    }

    class electricCar extends car{




        @Override
        void eccelerate(){
            System.out.println("electric car is a accelerating");

            @Override
            void brake(){
                System.out.println("electric car is a stopping");
            }
    }
}

