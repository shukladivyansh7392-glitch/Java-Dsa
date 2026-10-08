package exceptionhandling;

public class Main {
    static void main(String[] args) {
//        int a[] = new int[5];
//        System.out.println("Hello guy's");
//
//        try {
//
//            int result = 5/0;
//
//            System.out.println(a[9]);
//        }
//            catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("tried to access the out of bound elements");
//        }
//        catch (ArithmeticException e){
//            System.out.println(e.fillInStackTrace());
//            System.out.println(e.getMessage());
//            System.out.println(e);
//        }
//            System.out.println("Bye guy's");






        int a[] = new int[5];
        System.out.println("Hello guy's");

        try {

            int result = 5/0;

            System.out.println(a[9]);
        }
//        catch(ArrayIndexOutOfBoundsException | ArithmeticException |NullPointerException e){
//            System.out.println("Handling the exception");
//        } catch (RuntimeException e){
//
//        }

        catch (Exception e){
            System.out.println("All Exception Handle");
        }

//        catch (ArithmeticException e){
//            System.out.println("Handling the exception");
//        }
        System.out.println("Bye guy's");




        }
    }
