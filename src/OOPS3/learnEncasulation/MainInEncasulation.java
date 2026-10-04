package OOPS3.learnEncasulation;

import OOPS3.learnPackage.Person;

public class MainInEncasulation {

   public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(-21);
       System.out.println(p1.getAge());

       Person.count = 50;

       Person p2  = new Person();
       System.out.println(Person.count);

       System.out.println(Math.max(2, 4));
    }
}
