public class Abstract {
   public static void main(String[] args){

       car car = new fuelCar();
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
    void accelerate() {
        System.out.println("fuel car is a accelerating");

    }
        @Override
        void brake()
        {
            System.out.println("fuel car is a stopping");
        }
    }

    class ElectricCar extends car{

        @Override
        void accelerate() {
            System.out.println("electric car is a accelerating");

        }
            @Override
            void brake(){
                System.out.println("electric car is a stopping");
            }
    }
//}

