package exceptionhandling;

import java.lang.classfile.Superclass;
import java.util.Scanner;

public class customException {
    static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");

        try {
            int age = sc.nextInt();
            if (age > 100) {
//                throw new MyException("My error is this");
                throw new ArithmeticException("More then 100 is not Allowed");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}


class MyException extends Exception{

    public MyException(String Message){
        super(Message);

    }
}