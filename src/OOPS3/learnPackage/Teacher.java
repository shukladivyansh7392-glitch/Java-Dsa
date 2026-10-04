package OOPS3.learnPackage;

public class Teacher  {

    public int teachingClass;

    private int  id;

    String degree; //Default And Package Private

    protected int studentCount;

    static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.teachingClass = 12;
        obj.id = 123;
    }

}
