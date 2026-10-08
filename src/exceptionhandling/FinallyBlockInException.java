package exceptionhandling;

public class FinallyBlockInException {
    static void main(String[] args) {
        int a[] = new int[5];

//        System.out.println("Hello World");
//        try {
//            System.out.println(a[3]);
//        }
//        catch (Exception e){
//            System.out.println("All Exception Handling");
//        } finally {
//            System.out.println("I Will Run Always");
//        }
//        System.out.println("Bye World");

        try{
            getNumberFromArray(a);
        }catch (Exception e){
            System.out.println("catched the exception"+e.getMessage());
        }
        getNumberFromArray(a);
    }

    static int getNumberFromArray(int a[])throws ArithmeticException{
        return a[8];
    }
}
