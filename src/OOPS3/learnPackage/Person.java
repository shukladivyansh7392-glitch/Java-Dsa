package OOPS3.learnPackage;

public class Person {

    int age;
    String name;

    public static int count =12;

    boolean canBeChanged = true;

    public void setAge(int age) {
        if (canBeChanged) {
            if (age > 0) {
                this.age = age;
            }
        }
    }

    boolean canBeAcces = false;

    public int getAge(){
        if(canBeAcces) return age;{
            return -1;
        }
    }

}
